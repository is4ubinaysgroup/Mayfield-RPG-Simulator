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
public abstract class Item {
	private String name;
	
	public Item() {}

	//Getters and Setters
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
