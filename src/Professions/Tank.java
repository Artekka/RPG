package Professions;

public class Tank extends BasePlayer{
	
	private String weaponName;
	private final static double HEALTH = 15000;
	private final static double ARMOR = 100;
	private final static double ATTACK = 350;
	private final static double MANA = 1500;
	private final static double XP = 0;
	
	public Tank(String n, String weaponName){
		super(n, HEALTH, ARMOR, ATTACK, MANA, XP);
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
