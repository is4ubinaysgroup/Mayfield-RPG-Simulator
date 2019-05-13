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
		
	public final static int PRODUCT_ARRAY_SPACE = 100;
	public final static int WEAPON_ARRAY_SPACE = 9;
	
	private int level;
	private int coins;
	
	private int numProducts;
	private int productCapacity; // upgradable up to 100
	private int numWeapons; // not completely necessary but saves a linear check for the first array space pointing to null
	
	
	private Weapon weapons [];
	private Product products [];


	public Player() {} // default constructor
	
	public Player(int health, int defense, int maxHealth, Weapon equippedWeapon, String imagePath,
					int coins, int level, int numProducts, int numWeapons, int productCapacity)
	{
		this.setHealth (health);
		this.setDefense (defense);
		this.setMaxHealth (maxHealth);
		this.setEquippedWeapon (equippedWeapon);
		this.setImagePath (imagePath);
		
		this.coins = coins;
		this.level = level;
		
		this.numProducts = numProducts;
		this.productCapacity = productCapacity;
		this.numWeapons = numWeapons;
				
		this.weapons [] = new Weapon [WEAPON_ARRAY_SPACE];
		this.products [] = new Product [PRODUCT_ARRAY_SPACE];
		
	} // Player constuctor
	
	
	// ------------------------------------------------ gets and sets ------------------------------------------------
	
	public void setCoins (int coins) {this.coins = coins;}
	public int getCoins () {return coins;}
					  
	public void setLevel (int level) {this.level = level;}
	public int getLevel () {return level;}
	
	public void setNumProducts (int numProducts) {this.numProducts = numProducts;}
	public int getNumProducts () {return numProducts;}
	
	public void setNumWeapons (int numWeapons) {this.numWeapons = numWeapons;}
	public int getNumWeapons () {return numWeapons;}
	
	public void setProductCapacity(int productCapacity) {this.productCapacity = productCapacity;}
	public int getProductCapacity() {return productCapacity;}

	public void setWeaponsArray (Weapon[] weapons) {this.weapons[] = weapons;}
	public Weapon[] getWeaponsArray () {return weapons;}
	
	public void setProductsArray (Product[] products) {this.products[] = products;}
	public Product[] getProductsArray () {return products;}

	
	// ------------------------------------------------ product and weapon storage management ------------------------------------------------

	public boolean isCapacityUpgradable() {return numProducts < PRODUCT_ARRAY_SPACE;} // isCapacityUpgradable method
	
	public void upgradeCapacity() {productCapacity = productCapacity+5;} // upgradeCapacity method
	
	
	
	public boolean alreadyOwnsWeapon (Weapon weapon)
	{
		for (int i = 0; i< numWeapons; i++)
		{
			if (weapon.getName().equals(weapons[i].getName())) {return true;}
			
		} // for 0...numWeapons-1
		
		return false;
		
	} // alreadyOwnsWeapon method
	
	
	public void deleteProduct(Product product)
	{
		for (int i = 0; i< numProducts; i++)
		{
			if (product.getName().equals(products[i].getName()))
			{
				products [i] = null; // not sure if this is needed but just in case
	
				products [i] = product [numProducts-1];
				
				products [numProducts-1] = null;
				
				Backpack.removeProduct (product.getName());
				
				numProducts--;
				
			} // if match found
		
		} // for 0...numProducts-1
	} // deleteProduct method: linear search and set null of pointer and switch of item in highest index to vacated pointer; previously highest index becomes null and numItems decrements


	
} // Player class
