package src.character;

import java.awt.Point;

import src.gui.Backpack;
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

// 05-14 added position array to constructor

/*
05-17 Mina
added hasEnoughCoins method
*/

// Mina 05-20 added loadProduct and loadWeapon methods to avoid numWeapons or numProducts overlap


public class Player extends Human {

	public final static int PRODUCT_ARRAY_SPACE = 100;
	public final static int WEAPON_ARRAY_SPACE = 9;
	
	
	// ------------------------------------------------ object fields ------------------------------------------------

	private int level = 0;
	private int coins;
	
	private int numProducts;
	private int productCapacity; // upgradable up to 100
	private int numWeapons; // not completely necessary but saves a linear check for the first array space pointing to null when pushing
	
	
	private Weapon weapons [];
	private Product products [];


	// ------------------------------------------------ constructor ------------------------------------------------

	public Player() {} // default constructor
	public Player(int health, int defense, int maxDefense, int maxHealth, Weapon equippedWeapon, String imagePath,
					Point position, 
					int coins, int level, int numProducts, int numWeapons, int productCapacity)
	{
		this.setHealth (health);
		this.setDefense (defense);
		this.setMaxDefense(maxDefense);
		this.setMaxHealth (maxHealth);
		this.setEquippedWeapon (equippedWeapon);
		this.setImagePath (imagePath);
		
		this.setPosition(position);
		this.setY(0);
		this.setX(0);
		
		this.coins = coins;
		this.level = level;
		
		this.numProducts = numProducts;
		this.productCapacity = productCapacity;
		this.numWeapons = numWeapons;
				
		this.weapons = new Weapon [WEAPON_ARRAY_SPACE];
		this.products = new Product [PRODUCT_ARRAY_SPACE];
		
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

	public void setWeaponsArray (Weapon[] weapons) {this.weapons = weapons;}
	public Weapon[] getWeaponsArray () {return weapons;}
	
	public void setProductsArray (Product[] products) {this.products = products;}
	public Product[] getProductsArray () {return products;}


	
	// ------------------------------------------------ product and weapon storage management ------------------------------------------------

	public boolean isCapacityUpgradable() {return productCapacity < PRODUCT_ARRAY_SPACE;} // isCapacityUpgradable method
	
	
	public void upgradeCapacity() {productCapacity = productCapacity+5;} // upgradeCapacity method
	
	
	public boolean isProductCapacityFull () {return numProducts == productCapacity;} // isProductCapacityFull method

	

	public boolean hasEnoughCoins (int cost) {return coins >= cost;}

	
	
	public void addProduct (Product product)
	{
		products [numProducts] = product;
		Backpack.addProduct (product.getName());
		numProducts++;
		
	} // addProduct method (push)
	
	
	
	public void loadProduct (Product product, int i)
	{
		products [i] = product;
		Backpack.addProduct (product.getName());
	} // loadProduct method
	
	
	
	public void deleteProduct(Product product)
	{
		for (int i = 0; i< numProducts; i++)
		{
			if (product.getName().equals(products[i].getName()))
			{
				products [i] = null; // not sure if this is needed but just in case
	
				products [i] = products [numProducts-1];
				
				products [numProducts-1] = null;
				
				Backpack.removeProduct (product.getName());
				
				numProducts--;
				
				return; // exit the method
				
			} // if match found
		} // for 0...numProducts-1
	} // deleteProduct method: linear search and set null of pointer and point it to item in highest index; previously highest index becomes null and numProducts decrements
	

	
	public boolean alreadyOwnsWeapon (Weapon weapon)
	{
		for (int i = 0; i< numWeapons; i++)
		{
			if (weapon.getName().equals(weapons[i].getName())) {return true;}
			
		} // for 0...numWeapons-1
		
		return false;
		
	} // alreadyOwnsWeapon method
	
	
	
	public void addWeapon (Weapon weapon)
	{
		weapons [numWeapons] = weapon;
		Backpack.addWeapon (weapon.getName());
		numWeapons++;
		
	} // addWeapon method (push)
	
	
	
	public void loadWeapon (Weapon weapon, int i)
	{
		weapons [i] = weapon;
		Backpack.addWeapon (weapon.getName());
	} // loadWeapon method
	
	

	public void switchWeapon (Weapon weapon)
	{
		
		deleteWeapon (weapon);
		addWeapon (this.getEquippedWeapon());
		setEquippedWeapon (weapon);
		
	} // switchWeapon method
	
	
	
	public void deleteWeapon(Weapon weapon)
	{
		for (int i = 0; i< numWeapons; i++)
		{
			if (weapon.getName().equals(weapons[i].getName()))
			{
				weapons [i] = null; // not sure if this is needed but just in case
	
				weapons [i] = weapons [numWeapons-1];
				
				weapons [numWeapons-1] = null;
				
				Backpack.removeWeapon (weapon.getName());
				
				numWeapons--;
				
				return; // exit the method
				
			} // if match found
		} // for 0...numWeapons-1
	} // deleteWeapon method
	
	
	
} // Player class
