package Professions;
/*
 * BasePlayer class
 * @author Omar Mohammed
 * This is the class where all the 'classes' basic structure is made. Every class in this rpg will have
 * A name, health, armor, attack, mana, and experience.
 * They will have the ability to gain or lose health and mana.
 */

public class BasePlayer {
	
	private String name;
	private double Health;
	private double Armor;
	private double Attack;
	private double Mana;
	private double Exp;
	
public BasePlayer(String n, double h, double arm, double attk, double mana, double xp )
{
	setName(n);
	setHealth(h);
	setArmor(arm);
	setAttack(attk);
	setMana(mana);
	setExp(xp);
}
public double getHealth() {
	return Health;
}
public void setHealth(double health) {
	Health = health;
}

public void addHealth(double healthbonus){ //Make more complex later
	if(Health < 10000.0){
		Health += healthbonus;
	}else{
		System.out.println("Already at max hp");
	}
}

public void subtractHealth(double healthbonus){ //Make more complex later
	if(Health > 0){
		Health -= healthbonus;
		System.out.println(this.getName()+ " Says: Yeowch!\n");
	}else{
		System.out.println(this.getName() + " is Dead!");
	}
}



public double getArmor() {
	return Armor;
}
public void setArmor(double armor) {
	Armor = armor;
}

public double getMana() {
	return Mana;
}
public void setMana(double mana) {
	Mana = mana;
}
public void addMana(double manaBonus){ //Make more complex later
	if(Mana < 10000.0){
		Mana += manaBonus;
	}else{
		System.out.println("Already at max hp");
	}
}
public void subtractMana(double manaBonus){ //Make more complex later
	if(Mana > 0.0){
		Mana -= manaBonus;
	} else{
		System.out.println("You are OOM");
	}
}

public double getAttack() {
	return Attack;
}
public void setAttack(double attack) {

	Attack = attack;
}


/*
 * Each character has their own taunt and weapon name, thus we have no output for this
 */
public void attack(BasePlayer n){
	//System.out.println(this.getName() + "uses  "+ this.getWeaponName() + " on "+n.getName());
	//n.subtractHealth(this.getAttack());
}


public double getExp() {
	return Exp;
}
public void setExp(double exp) {
	Exp = exp;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String toString(){
	return name;
}



}