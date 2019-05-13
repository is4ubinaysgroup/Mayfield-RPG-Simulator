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
		this.coins = coins;
		this.level = level;
		
	} // Player constuctor
	
	
	// ------------------------------------------------ gets and sets ------------------------------------------------
	
	public void setCoins (int coins) {this.coins = coins;}
	public int getCoins () {return coins;}
					  
	public void setLevel (int level) {this.level = level;}
	public int getLevel () {return level;}

	
	// ------------------------------------------------ product and weapon storage management ------------------------------------------------

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



} // Player class
