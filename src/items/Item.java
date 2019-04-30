/**
  4/30/2017
  Version: Fujirose-May30th-Edition
 */
package items;

/**
 * @author Fujirose
 *item Class is abstract
 *only contains the String name.
 */
public abstract class Item {

	/**
	 * 
	 */
	private String name;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

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
