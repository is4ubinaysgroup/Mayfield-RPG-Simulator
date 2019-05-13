package src.character;
/*
@Author: Carson Fujita
@Contributor:
human class sets the requirements and data for the rest of the classes
*/

/*
05-13 Mina
added imagePath field
*/

/*
Carson Fujita
fixed imagepath
*/

import src.items.Weapon;

public class Human
{

	public static int MOVEMENT = 3;

	protected int health;
	protected int defense;
	protected int maxHealth;
	protected Weapon equippedWeapon;
	protected String imagePath;

	// ------- gets and sets -------
	public void setHealth (int health) {this.health = health;}
	public int getHealth () {return health;}
	
	public void setDefense (int defense) {this.defense = defense;}
	public int getDefense () {return defense;}
	
	public void setMaxHealth (int maxHealth) {this.maxHealth = maxHealth;}
	public int getMaxHealth () {return maxHealth;}
	
	public void setEquippedWeapon (Weapon equippedWeapon) {this.equippedWeapon = equippedWeapon;}
	public Weapon getEquippedWeapon () {return equippedWeapon;}
	
	public void setImagePath (String imagePath) {this.imagePath = imagePath;}
	public String getImagePath () {return imagePath;}

} // Human class
