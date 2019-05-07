// Mina Fang
// updated 05-07

public class Product extends Item
{

	static final int ARMOR = 1;
	static final int CAPACITY = 2; // has a limit
	static final int CRITICALCHANCE = 3;
	static final int HEALTH = 4;
	static final int MAXHEALTH = 5;
	static final int DAMAGE = 6;
	
	
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
