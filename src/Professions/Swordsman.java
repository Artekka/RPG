package Professions;

/*
 * This is one of our current available classes in the Rpg
 * We hard code the specific data meant for the class (Swordsman) in. We only allow the user to change the name and the name of the weapon. Our
 * toString method is essentially a player card that will retrieve and display the current stats of the    player
 */
public class Swordsman extends BasePlayer{
	
	/*
	 * We are going to hard code these values in the Swordsman class so the stats can never be changed by user
	 */
	private String weaponName;
	private static double health = 20000.0;
	private static double armor = 200;
	private static double attack = 200;
	private static double mana = 2000;
	private static double xp = 0;
	
	/*
	 * Our first initial idea on creating a constructor, but was incorrect!
	 * 
	public Swordsman(String n, double h, double arm, double attk, double mana2, double xp2, String weaponName) {
		super(n, health, armor, attack, mana, xp);
		setWeaponName(weaponName);
		// TODO Auto-generated constructor stub
	}
	*/
	
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
