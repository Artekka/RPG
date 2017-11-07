package Runner;
/* @Author Omar Mohammed
 * This class contains the main
 */



import javax.swing.JOptionPane;

import Professions.BasePlayer;
import Professions.Mage;
import Professions.Marksman;
import Professions.Swordsman;
import Professions.Tank;
import java.util.HashMap;
import java.util.Random;


public class Game {
	
	//Game game = new Game();
	private enum Names {MAGE,MARKSMAN,SWORDSMAN,TANK}
	public enum Enemy_names {CHUCKY,BONES,CROW,DAMIEN}

	public static void main(String args[]){
		Game game = new Game();
		game.run();
		
	}

	public void run(){
		this.createPlayer(true);
	}

	
	public BasePlayer createPlayer(Boolean player){
		HashMap<String, BasePlayer> createsCharacter = new HashMap<>();
		
		
		Names[] names = {Names.MAGE,Names.MARKSMAN,Names.SWORDSMAN,Names.TANK};
		String classSelection = (String) JOptionPane.showInputDialog(null,"Pick a class!", "Class Selection",JOptionPane.QUESTION_MESSAGE,null,names,"select a class").toString();
		String name = (String) JOptionPane.showInputDialog(null,"Enter the name of your " + classSelection);
		String nameOfWeapon = (String) JOptionPane.showInputDialog(null,"Enter the name of your Weapon");
			
		createsCharacter.put(Names.SWORDSMAN.toString(), new Swordsman(name, nameOfWeapon));
		createsCharacter.put(Names.MARKSMAN.toString(), new Marksman(name,nameOfWeapon));
		createsCharacter.put(Names.TANK.toString(), new Tank(name, nameOfWeapon));
		createsCharacter.put(Names.MAGE.toString(), new Mage(name,nameOfWeapon));
			
		BasePlayer character = createsCharacter.get(classSelection);
			
		if(!player){
			String enemyName = "Enemy";
			String enemyWeapon = "Sparkle Glitter";
			
			Random number = new Random();
			int value = number.nextInt(Names.values().length);
			String key = Names.values()[value].toString();
			BasePlayer enemy = createsCharacter.get(key);
			enemy.setName(enemyName);
			enemy.setWeaponName(enemyWeapon);
			
			return enemy;
		}
		
		return character;
		
	}
	
	
	public static void fight(BasePlayer player, BasePlayer Enemy){
		/*
		Random Turn = new Random();
		Random Turn2 = new Random();
		int playerTurn = Turn.nextInt(100);
		int enemyTurn = Turn2.nextInt(100);
		*/
		
		
		//System.out.println(player.getName());
		System.out.print(player.getName() + " vs " + Enemy.getName());
		
		int round = 1;
		while(round > 0){
			while(player.getHealth() > 0 || Enemy.getHealth() > 0){
				Random Turn = new Random();
				Random Turn2 = new Random();
				int playerTurn = Turn.nextInt(100);
				int enemyTurn = Turn2.nextInt(100);
				
				if(playerTurn > enemyTurn){
					player.attack(Enemy);
				}else{
					Enemy.attack(player);
				}
			}
			round = -2;
		}
		
	}
}


