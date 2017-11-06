package Professions;

public class Swordsman extends BasePlayer{
	private String weaponName;
	private final static double HEALTH = 20000.0;
	private final static double ARMOR = 200;
	private final static double ATTACK = 200;
	private final static double MANA = 2000;
	private final static double XP = 0;

	public Swordsman(String n, String weaponName){
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
