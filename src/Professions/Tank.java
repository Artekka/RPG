package Professions;

public class Tank extends BasePlayer{
	
	private String weaponName;
	private static double health = 15000;
	private static double armor = 100;
	private static double attack = 350;
	private static double mana = 1500;
	private static double xp = 0;
	
	public Tank(String n, String weaponName){
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
		return this.getName() +" says: My shield is here for you.\n";
	}
	
	@Override
	public String toString(){
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
