// @Author: Mina Fang
// @Contributor: Carson Fujita
// updated 05-09

/*
Edited, Carson Fujita, May 9th 2019
Added the public modifaction to the final stats. no biggie
evaluatation as PM 3: 10/10
*/

// Mina Fang updated 05-10
/*
Editing and contributing @Carson Fujita
Date: 
May 11th, 2019
move getProduct to database.
added a constructor
 */

/*
Coding @Carson Fujita
Date: 
May 12th, 2019
added Defense upgrade type. 
Completed:
*/
package src.items;

import src.Database;
import src.gui.MainExcecutable;

public class Product extends Item
{

	public static final int ARMOR = 1;
	public static final int CAPACITY = 2; // has a limit
	public static final int CRITICALCHANCE = 3;
	public static final int HEALTH = 4;
	public static final int MAXHEALTH = 5;
	public static final int DAMAGE = 6;
	public static final int DEFENSE = 7; // added by carson
	
	
	private int upgradeType;
	private int increase;
	private int cost;
	private String description;
	private String imagePath;
	
	
	public Product () {} // default constructor
	
	public Product (String name, int upgradeType, int increase, int cost, String description, String imagePath)
	{
		
		this.setName(name);
		this.upgradeType = upgradeType;
		this.increase = increase;
		this.cost = cost;
		this.description = description;
		this.imagePath = imagePath;
		
	} // Product constructor
	
	public Product (String name, int upgradeType, int increase, int cost, String description)
	{
		this.setName(name);
		this.upgradeType = upgradeType;
		this.increase = increase;
		this.cost = cost;
		this.description = description;
	}
	
	// ------- set and get methods -------
	
	public void setUpgradeType (int upgradeType) { this.upgradeType = upgradeType; } // setUpgradeType method
	public int getUpgradeType () { return upgradeType; } // getUpgradeType method
	
	public void setIncrease (int increase) { this.increase = increase; } // setIncrease method
	public int getIncrease () { return increase; } // getIncrease method
	
	public void setCost (int cost) { this.cost = cost; } // setCost method
	public int getCost () { return cost; } // getCost method
	
	public void setDescription (String description) { this.description = description; } // setDescription method
	public String getDescription () { return description; } // getDescription method
	
	public void setImagePath (String imagePath) { this.imagePath = imagePath; } // setImagePath method
	public String getImagePath () { return imagePath; } // getImagePath method
	
	
	
	
	
	public static boolean use (Product product)
	{
		
		boolean used = false;
		
		int upgradeType = product.getUpgradeType();
		int increase = product.getIncrease();
		
		
		if (upgradeType == ARMOR)
		{
	
			// need name of Player object and class where it is instantiated

			int defense = MainExcecutable.player.getDefense () + increase;
			MainExcecutable.player.setDefense (defense));
			
			used = true;
			
		} // if armour upgrade
		
		
		else if (upgradeType == CAPACITY)
		{
			
			// need name of Player object and class where it is instantiated
			
			// check if productCapacity is upgradable (compare to array size)
			
			if (MainExcecutable.player.productCapacityIsUpgradable() == true)
			{	
				int productCapacity = MainExcecutable.player.getProductCapacity () + increase;
			
				MainExcecutable.player.setProductCapacity (productCapacity);
			
				used = true;
			}

			
		} // if capacity upgrade
		
		
		
		else if (upgradeType == CRITICALCHANCE)
		{
			int equippedWeapon = MainExcecutable.player.getEquippedWeapon();
			
			if (equippedWeapon == 0){Weapon.hatCCUC++;} // if 0 -hat
			else if (equippedWeapon == 1){Weapon.pencilCCUC++;} // if 1 - pencil
			else if (equippedWeapon == 2){Weapon.rulerCCUC++;}// else if 2 - ruler
			else{Weapon.rubberBandCCUC++} // else 3 - rubber band

			used = true;
			
		} // if critical chance upgrade
		
		
		else if (upgradeType == HEALTH)
		{
			
			int health = MainExcecutable.player.getHealth() + increase;
			
			
			if (health > MainExcecutable.player.getHealth())
			{
				health = MainExcecutable.player.getHealth();
			} // if over max
			
			MainExcecutable.player.setHealth (health);		
			
			used = true;
			
		} // if health upgrade
		
		
		else if (upgradeType == MAXHEALTH)
		{
			
			int maxHealth = MainExcecutable.player.getMaxHealth() + increase;
			MainExcecutable.player.setMaxHealth (maxHealth);
			
			used = true;
			
		} // if maxHealth upgrade
		
		
		else //DAMAGE
		{
			
			int equippedWeapon = MainExcecutable.player.getEquippedWeapon();
			
			if (equippedWeapon == 0) {Weapon.hatDUC++;} // if 0 -hat
			else if (equippedWeapon == 1){Weapon.pencilDUC++;} // if 1 - pencil
			else if (equippedWeapon == 2){Weapon.rulerDUC++;}// else if 2 - ruler
			else {Weapon.rubberBandDUC++;} // else 3 - rubber band
			
			used = true;
			
		} // if 6 - damage upgrade
		

		
		// delete the product from storage
		
		if (used == true)
		{
			MainExcecutable.player.deleteProduct (product);
		} 
		
		return used;

		
	} // use method
	
	
	
} // Product class
