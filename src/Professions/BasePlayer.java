package Professions;
/*
 * BasePlayer class
 * @author Omar Mohammed
 * This is the class where all the 'classes' basic structure is made. Every class in this rpg will have
 * A name, health, armor, attack, mana, and experience.
 * They will have the ability to gain or lose health and mana.
 */

public abstract class BasePlayer {
	
	private String name;
	private double health;
	private double armor;
	private double attack;
	private double mana;
	private double exp;
	
	private final static double MAX_HEALTH = 10000.0;
	private final static double MIN_HEALTH = 0;
	private final static double MAX_MANA = 10000.0;
	private final static double MIN_MANA = 0;
	
public BasePlayer(String name, double health, double armor, double attack, double mana, double xp )
{
	setName(name);
	setHealth(health);
	setArmor(armor);
	setAttack(attack);
	setMana(mana);
	setExp(xp);
}
public double getHealth() {
	return health;
}
public void setHealth(double health) {
	this.health = health;
}

public boolean addHealth(double healthbonus){ //Make more complex later
	if(health < MAX_HEALTH){
		health += healthbonus;
		return true;
	}else{
		return false;
	}
}

public boolean subtractHealth(double healthDeficit){ //Make more complex later
	if(health > MIN_HEALTH){
		health -= healthDeficit;
		return true;
		
	}else{
		return false;
	}
}



public double getArmor() {
	return this.armor;
}
public void setArmor(double armor) {
	this.armor = armor;
}

public double getMana() {
	return mana;
}
public void setMana(double mana) {
	this.mana = mana;
}
public boolean addMana(double manaBonus){ //Make more complex later
	if(mana < MAX_MANA){
		mana += manaBonus;
		return true;
	}else{
		return false;
	}
}
public boolean subtractMana(double manaDeficit){ //Make more complex later
	if(mana > MIN_MANA){
		mana -= manaDeficit;
		return true;
	} else{
		return false;
	}
}


public double getAttack() {
	return attack;
}



public void setAttack(double attack) {

	this.attack = attack;
}


public boolean attack(BasePlayer n){
	n.subtractHealth(this.getAttack());
	return true;
}


public double getExp() {
	return exp;
}
public void setExp(double exp) {
	this.exp = exp;
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