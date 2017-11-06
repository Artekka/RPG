

package Professions;

public class Mage extends BasePlayer {
	
	private String weaponName;
	private static double health = 1500;
	private static double armor = 100;
	private static double attack = 300;
	private static double mana = 2500;
	private static double xp = 0;
	
	public Mage(String n, String weaponName){
		super(n, health, armor, attack, mana, xp);
		setWeaponName(weaponName);
	}
	
	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	
	public void attack(BasePlayer n){
		System.out.println(battleCry() + this.getName() + " uses "+ this.getWeaponName() + " on "+n.getName()
		+ "\n");
		n.subtractHealth(this.getAttack());
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
