package Professions;

public class Tank extends BasePlayer {
	
	private final static double BASE_HEALTH = 15000;
	private final static double BASE_ARMOR = 100;
	private final static double BASE_ATTACK = 350;
	private final static double BASE_MANA = 1500;
	private final static double BASE_XP = 0;
	
	public final static String Taunt = "My sheild is here for you.";
	
	public Tank(String n, String weaponName) {
		super(n, BASE_HEALTH, BASE_ARMOR, BASE_ATTACK, BASE_MANA, BASE_XP, weaponName);
	
	}
	
	public String battleCry() {
		return this.getName() +" says: My shield is here for you.\n";
	}
	
	@Override
	public String toString() {
		return "My name is "+ getName() +  "\n"
			   + "Quote: " + battleCry() 
	           + "Health: " + getHealth() + "\n"
	           + "Armor: " + getArmor() + "\n"
	           + "Attack Power: "+ getAttack() + "\n"
	           + "Mana: "+ getMana() +"\n" 
	           + "Xp: " + getExp() + "\n"
	           + "Weapon: " + getWeaponName();
	}
}
