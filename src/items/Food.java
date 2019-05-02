// Mina Fang
// updated 05-02

public class Food extends Item
{
	
	private int increase;
	
	
	public Food () {} // default constructor
	
	public Food (String name, int increase)
	{
		this.setName (name);
		this.increase = increase;
		
	} // Food constructor
	
	
	
	// ------- get and set methods for increase -------
	
	public void setIncrease (int newIncrease)
	{
		this.increase = newIncrease;
	} // setIncrease
	
	public int getIncrease () {return increase; }
	
	
} // Food class
