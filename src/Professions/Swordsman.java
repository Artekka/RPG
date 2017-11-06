package Professions;

public class Swordsman extends BasePlayer{
	private String weaponName;
	private static double health = 20000.0;
	private static double armor = 200;
	private static double attack = 200;
	private static double mana = 2000;
	private static double xp = 0;

	public Swordsman(String n, String weaponName){
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
