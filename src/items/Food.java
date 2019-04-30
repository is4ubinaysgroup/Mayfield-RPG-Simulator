// Mina Fang
// completed 04-30

public class Food extends Item
{
	
	private int increase;
	
	
	
	public Food (String name, int increase)
	{
		this.name = name;
		this.increase = increase;
		
	} // Food constructor
	
	
	
	// ------- get and set methods for increase -------
	
	public void setIncrease (int newIncrease)
	{
		this.increase = newIncrease;
	} // setIncrease
	
	public int getIncrease () {return increase; }
	
	
} // Food class
