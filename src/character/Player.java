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



}
