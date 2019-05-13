package src.character;

import src.items.Product;
import src.items.Weapon;
/*
 * Author: Carson.
 * 
 * 
 */

/*
05-13 Mina
updated

*/

public class Player extends Human {
	
	private int coins;
	private int level;


	public Player() {} // default constuctor
	
	public Player(int health, int defense, int maxHealth, Weapon equippedWeapon, String imagePath, int coins, int level)
	{
		this.setHealth (health);
		this.setDefense (defense);
		this.setMaxHealth (maxHealth):
		this.setEquippedWeapon (equippedWeapon);
		this.setImagePath (imagePath);
		this.setCoins (coins);
		this.setLevel (level);
		
	} // Player constuctor
	
	
	// gets and sets
	public void setHealth (int health) {this.health = health;}
	public int getHealth () {return health;}
	
	public void setDefense (int defense) {this.defense = defense;}
	public int getDefense () {return defense;}
	
	public void setMaxHealth (int maxHealth) {this.maxHealth = maxHealth;}
	public int getMaxHealth () {return maxHealth;}
	
	public void setEquippedWeapon (Weapon equippedWeapon) {this.equippedWeapon = equippedWeapon;}
	public Weapon getEquippedWeapon () {return equippedWeapon;}
	
	public void setImagePath (String imagePath) {this.ImagePath = imagePath;}
	public String getImagePath () {return imagePath;}
	
	public void setCoins (int coins) {this.coins = coins;)
	public int getCoins () {return coins;}
					  
	public void setLevel (int level) {this.level = level};
	public int getLevel () {return level;}

	

	public boolean isCapacityUpgradable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void upgradeCapacity() 
	{
		
	}

	public void setProductCapacity(int productCapacity) {
		// TODO Auto-generated method stub
		
	}

	public int getProductCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public int getCoins() {
		// TODO Auto-generated method stub
		return 0;
	}


} // Player class
