// @Author: Mina Fang
// @Contributor: Carson Fujita
// updated 05-07

/*
Edited, Carson Fujita, May 9th 2019
Added the public modifaction to the final stats. no biggie
evaluatation as PM 3: 10/10
*/

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
	
	public Product (String name, int upgradeType, int increase)
	{
		
		this.setName(name);
		this.upgradeType = upgradeType;
		this.increase = increase;
		
	} // Product constructor
	
	
	// ------- set and get methods -------
	
	public void setUpgradeType (int upgradeType) { this.upgradeType = upgradeType; } // setUpgradeType method
	public int getUpgradeType () { return upgradeType; } // getUpgradeType method
	
	public void setIncrease (int increase) { this.increase = increase; } // setIncrease method
	public int getIncrease () { return increase; } // getIncrease method
	
} // Upgrade class
