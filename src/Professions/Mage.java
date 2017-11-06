

package Professions;

public class Mage extends BasePlayer {
	
	private String weaponName;
	private final static double BASE_HEALTH = 15000;
	private final static double BASE_ARMOR = 100;
	private final static double BASE_ATTACK = 300;
	private final static double BASE_MANA = 2500;
	private final static double BASE_XP = 0;
	
	public final static String TAUNT = " Magic is beleiving in yourself, if you can do that, you can make anything. \n";
	
	public Mage(String name, String weaponName){
		super(name, BASE_HEALTH, BASE_ARMOR, BASE_ATTACK, BASE_MANA, BASE_XP);
		setWeaponName(weaponName);
	}
	
	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	
	
	public String battleCry(){
		return this.getName() +" says: Magic is believing in yourself, if you can do that, you can make anything happen.\n";
	}
	
	@Override
	public String toString(){
		return "My name is "+ getName() +  "\n"
			   + "Quote: " + battleCry() +"\n"
	           + "Health: " + getHealth() + "\n"
	           + "Armor: " + getArmor() + "\n"
	           + "Attack Power: "+ getAttack() + "\n"
	           + "Mana: "+ getMana() +"\n" 
	           + "Xp: " + getExp() + "\n"
	           + "Weapon: " + getWeaponName();
	}

}
