package Professions;

public class Swordsman extends BasePlayer{
	
	private final static double BASE_HEALTH = 20000.0;
	private final static double BASE_ARMOR = 200;
	private final static double BASE_ATTACK = 200;
	private final static double BASE_MANA = 2000;
	private final static double BASE_XP = 0;
	
	public final static String TAUNT = "This time, victory is mine!";

	public Swordsman(String n, String weaponName){
		super(n, BASE_HEALTH, BASE_ARMOR, BASE_ATTACK, BASE_MANA, BASE_XP, weaponName);
	}


	public String battleCry(){
		return getName() + " Says: This time, victory is mine!\n ";
	}
	
	@Override
	public String toString(){
		return "My name is "+ getName() +  "\n"
			   + "Quote: " + battleCry() + "\n" 
	           + "Health: " + getHealth() + "\n"
	           + "Armor: " + getArmor() + "\n"
	           + "Attack Power: "+ getAttack() + "\n"
	           + "Mana: "+ getMana() +"\n" 
	           + "Xp: " + getExp() + "\n"
	           + "Weapon: " + getWeaponName();
	}
}
