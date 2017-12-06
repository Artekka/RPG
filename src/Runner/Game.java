package Runner;
/* @Author Omar Mohammed
 * This class contains the main
 */

import java.util.function.*;
import javax.swing.JOptionPane;

import Professions.BasePlayer;
import Professions.Mage;
import Professions.Marksman;
import Professions.Professions;
import Professions.Swordsman;
import Professions.Tank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Game {
	private static final int NUM_ROUNDS = 100;
	public static final String DEFAULT_ENEMY_NAME = "Enemy";
	public static final String DEFAULT_ENEMY_WEAPON_NAME = "Sparkle Glitter";
	private final Random rng;
	
	public Game() {
		// One psuedo-random number generator for the entire game; bypasses LCG issues.
		this.rng = new Random();
	}
	
	public static void main(String args[]) {
		Game game = new Game();
		game.run();
	}

	public void run() {
		final BasePlayer player = this.createPlayer(),
				enemy = this.createEnemy();
		
		this.fight(player, enemy);
	}

	public BasePlayer createPlayer() {
		final String profession = JOptionPane.showInputDialog(null,
					"Pick a class!", "Class Selection",
					JOptionPane.QUESTION_MESSAGE, null,
					Professions.ALLOWED_PROFESSION_NAMES.toArray(), "select a class").toString();
		if (!Professions.isValidProfession(profession)) {
			throw new IllegalStateException("This should never happen.");
		}
		
		final String playerName = JOptionPane.showInputDialog(null, "Enter the name of your " + profession);
		final String weaponName = JOptionPane.showInputDialog(null, "Enter the name of your Weapon");
		
		return Professions.getPlayerForProfession(profession, playerName, weaponName);
	}
	
	public BasePlayer createEnemy() {
		return Professions.getPlayerForProfession(Professions.getRandomProfession(this.rng), DEFAULT_ENEMY_NAME, DEFAULT_ENEMY_WEAPON_NAME);
	}
	
	public void fight(final BasePlayer player, final BasePlayer enemy) {
		System.out.print(player.getName() + " vs " + enemy.getName());
		
		while (player.getHealth() > 0 && enemy.getHealth() > 0) {
			final int roll = rng.nextInt(2); // 0 or 1
			final BasePlayer attacker = roll == 0 ? player : enemy,
							 defender = roll == 1 ? player : enemy;
			
			final double damageDone = attacker.attack(defender);
			
			System.out.println(attacker.getName() + " did " + damageDone + " damage to " + defender.getName());
			System.out.println(player.getName() + "'s health: " + player.getHealth() + " | " + enemy.getName() + "'s health: " + enemy.getHealth());
		}
		
		final BasePlayer winner = player.getHealth() > 0 ? player : enemy;
		System.out.println("The winner is " + winner.getName() + "!");
	}
}


