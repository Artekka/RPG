package TestCodes;
/*
 * This is the weapons!
 */
public class Weapons {
	private String nameOfWeapon;
	
	public Weapons(String s){
		setNameOfWeapon(s);
	}

	public String getNameOfWeapon() {
		return nameOfWeapon;
	}

	public void setNameOfWeapon(String nameOfWeapon) {
		this.nameOfWeapon = nameOfWeapon;
	}
	
	public String toString(){
		return "You are using the mighty "+ nameOfWeapon;
	}
	
	
}
