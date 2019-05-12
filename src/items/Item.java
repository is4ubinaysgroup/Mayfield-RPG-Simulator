/**
  4/30/2017
  Version: Fujirose-May30th-Edition
 */
package src.items;

/**
 * @author Fujirose
 *item Class is abstract
 *only contains the String name.
 */
/*
 Editing and contributing @Carson Fujita
Date: 
May 11th, 2019
rearraged stuff.
 */
/*
Editing and contributing @Carson Fujita
Date: 
May 12th, 2019

added Description, ImagePath, Cost and their getters and setters. (from mina's work)
*/
public abstract class Item {
	protected String name;
	protected int cost;
	protected String description;
	protected String imagePath;
	
	public Item() {}
	public Item(String name) { this.name = name; }

	//Getters and Setters
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	
	public void setCost (int cost) { this.cost = cost; } // setCost method
	public int getCost () { return cost; } // getCost method
	
	public void setDescription (String description) { this.description = description; } // setDescription method
	public String getDescription () { return description; } // getDescription method
	
	public void setImagePath (String imagePath) { this.imagePath = imagePath; } // setImagePath method
	public String getImagePath () { return imagePath; } // getImagePath method

}
