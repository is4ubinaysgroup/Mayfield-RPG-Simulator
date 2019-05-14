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
fixed upgradeType CRITICALCHANCE...
added functionality for defense upgrades
added fixing to upgrades and weapons.
fixed up since item has Description image path and cost now.
*/

// 05-12 edited this.setName(name); in first constructor and fixed execute spelling - Mina

package src.items;

import src.Database;
import src.gui.MainExecutable;

public class Product extends Item
{

	public static final int ARMOR = 1;
	public static final int CAPACITY = 2; // has a limit
	public static final int CRITICALCHANCE = 3;
	public static final int HEALTH = 4;
	public static final int MAXHEALTH = 5;
	public static final int DAMAGE = 6;
	private int upgradeType;
	private int increase;


	
	public Product () {} // default constructor
	
	public Product (String name, int upgradeType, int increase, int cost, String description, String imagePath)
	{
		
		this.setName(name);
		this.upgradeType = upgradeType;
		this.increase = increase;
		this.setCost(cost);
		this.setDescription(description);
		this.setImagePath(imagePath);
		
	} // Product constructor
	
	public Product (String name, int upgradeType, int increase, int cost, String description)
	{
		this.setName(name);
		this.upgradeType = upgradeType;
		this.increase = increase;
		this.setCost(cost);
		this.setDescription(description);
		// doesn't have imagePath
	}
	
	// ------- set and get methods -------
	
	public void setUpgradeType (int upgradeType) { this.upgradeType = upgradeType; } // setUpgradeType method
	public int getUpgradeType () { return upgradeType; } // getUpgradeType method
	
	public void setIncrease (int increase) { this.increase = increase; } // setIncrease method
	public int getIncrease () { return increase; } // getIncrease method
	
	
	
	
	public static boolean use (Product product)
	{
		
		boolean used = false;
		
		int upgradeType = product.getUpgradeType();
		int increase = product.getIncrease();
		
		
		if (upgradeType == ARMOR) // defense upgrade already does this
		{
	
			// need name of Player object and class where it is instantiated

			int defense = MainExecutable.getPlayer().getDefense () + increase;
			MainExecutable.getPlayer().setDefense (defense);
			
			used = true;
			
		} // if armour upgrade
		
		
		else if (upgradeType == CAPACITY)
		{
			
			if (MainExecutable.getPlayer().isCapacityUpgradable() == true)
			{	
				int productCapacity = MainExecutable.getPlayer().getProductCapacity () + increase;
			
				MainExecutable.getPlayer().setProductCapacity (productCapacity);
			
				used = true;
			}

			
		} // if capacity upgrade
		
		
		
		else if (upgradeType == CRITICALCHANCE)//fixed
		{
			Weapon equippedWeapon = MainExecutable.getPlayer().getEquippedWeapon();
			
			if (equippedWeapon.getName().equals( Database.getHat().getName() ) ){Database.getHat().upgradeCriticalChance();} // if 0 -hat
			else if (equippedWeapon.getName().equals( Database.getPencil().getName() ) ){Database.getPencil().upgradeCriticalChance();} // if 1 - pencil
			else if (equippedWeapon.getName().equals( Database.getRuler().getName() ) ){Database.getRuler().upgradeCriticalChance();}// else if 2 - ruler
			else{Database.getRubberband().upgradeCriticalChance();} // else 3 - rubber band

			used = true;
			
		} // if critical chance upgrade
		
		
		else if (upgradeType == HEALTH)
		{
			
			int health = MainExecutable.getPlayer().getHealth() + increase;
			
			
			if (health > MainExecutable.getPlayer().getHealth())
			{
				health = MainExecutable.getPlayer().getHealth();
			} // if over max
			
			MainExecutable.getPlayer().setHealth (health);		
			
			used = true;
			
		} // if health upgrade
		
		
		else if (upgradeType == MAXHEALTH)
		{
			
			int maxHealth = MainExecutable.getPlayer().getMaxHealth() + increase;
			MainExecutable.getPlayer().setMaxHealth (maxHealth);
			
			used = true;
			
		} // if maxHealth upgrade
		
		else //DAMAGE
		{
			
			Weapon equippedWeapon = MainExecutable.getPlayer().getEquippedWeapon();
			
			if ( equippedWeapon.getName().equals( Database.getHat().getName() ) ){Database.getHat().upgradeDamage();} // if hat
			else if ( equippedWeapon.getName().equals( Database.getPencil().getName() )){Database.getPencil().upgradeDamage();} // else if pencil
			else if ( equippedWeapon.getName().equals( Database.getRuler().getName() )){Database.getRuler().upgradeDamage();}// else if ruler
			else{Database.getRubberband().upgradeDamage();} // else rubber band
			
			used = true;
			
		} // if 6 - damage upgrade
		

		
		// delete the product from storage
		
		if (used == true)
		{
			MainExecutable.getPlayer().deleteProduct (product);
		} 
		
		return used;

		
	} // use method
	
	
	
} // Product class
