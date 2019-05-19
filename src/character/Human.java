package src.character;
import java.awt.Point;

/*
@Author: Carson Fujita
@Contributor:
human class sets the requirements and data for the rest of the classes
*/

/*
05-13 Mina
added imagePath field
*/

/*
Carson Fujita
fixed imagepath
*/

/*
 date: May 14th 2019
 Contributor:Carson Fujita
 added location getter and setters along with x and y getter and setter.
 added maxdefense; added maxdefense getter and setter.
 added attack();
 added hasLowHealth();
*/

// 05-14 Mina added some spacing

/*
date: May 16th 2016
Carson: added and coded inRangeOf(Human human) and bug fix
*/

/*
date: May 17th 2016
Carson: added and coded moveTo(Point), moveTo(Human), and recoverShield()
*/
import src.items.Weapon;

public class Human
{

	public static int MOVEMENT = 3;
	protected String name;
	protected int health;
	protected int defense;
	protected int maxDefense;
	protected int maxHealth;
	protected Weapon equippedWeapon;
	protected String imagePath;
	private int[] position = new int[2];
	/*
	 //We will move as close as we can to the position
	 //to do this I need to get Movement
	 
	 */
	public void moveTo(Point point) 
	{
		//How much do we need to move to get there
		int changeInX = point.x - getX();
		int changeInY = point.y - getY();
		if(Math.abs(changeInX) <= MOVEMENT) //can move here with no issues
		{
			setX(point.x);
			setY(point.y);
		}
		else
		{// we want to move as close as we can

			if(changeInX  < 0) // x is negative
			{
				changeInX= MOVEMENT*-1;
			}
			else if(changeInX > 0) // x is positive
			{
				changeInX-=MOVEMENT;
			}

			if(changeInY  < 0) // x is negative
			{
				changeInY= MOVEMENT*-1;
			}
			else if(changeInY > 0) // x is positive
			{
				changeInY-=MOVEMENT;
			}

			setX(changeInX);
			setY(changeInY);
		}
	}
	
	//Movement related Functions
	public void moveTo(Human human) // moves to a human
	{
		//we can't move on a human but only near.
		int changeInX = human.getX() - getX();
		int changeInY =human.getY() - getY();
		
		Point output = new Point(0,0);
		if(changeInX != 0) 
		{
			output.x = human.getX() + (  changeInX /  ( Math.abs( changeInX ) ) );
		}
		else //x =0
		{
			output.x = human.getX() + 1;
		}
		
		if(changeInY != 0)
		{
			output.y = human.getY() + (  changeInY /  ( Math.abs( changeInY ) ) );
		}
		else //y =0
		{
			output.y = human.getY() + 1;
		}
		
		moveTo(new Point(human.getX(), human.getY()));
	}
	
	public void moveAway(Human human) //moves away from a human
	{
		int x = human.getX();
		int y = human.getY();
		for(int i = 1; i != Human.MOVEMENT; i--) 
		{
			
		}
	}
	
	public void moveOut(Human human) //moves out of a human's weapons range
	{
		//TODO
	}
	
	public void moveIn(Human human) //moves so that human is in it's weapon range
	{
		//TODO
	}
	
	public void moveIn(Human human, boolean useMostOptimalMove, int attackType)//optimal 
	{
		
	}
	
	public void attack(Human human) 
	{
		//Cuts damage from armor then if there is more damage it cuts to health. 
		//also adds critical change 
		int initialDamage =this.getEquippedWeapon().getDamage();
		if (Math.random() <= this.equippedWeapon.getCriticalChance()) 
		{
			initialDamage= initialDamage*2;
		}
		int damageToHealth = human.getDefense() - initialDamage;
		if(damageToHealth < 0) 
		{
			human.setDefense(0);
			human.setHealth(human.getHealth() - damageToHealth);
		}
	}
	
	public void runAndHit(Human human) {//added by carson. I will add this to UML. soon..
		// TODO Auto-generated method stub
		
	}
	
	public boolean hasLowHealth() 
	{
		if(getHealth() <= 20 ) // I think 20 is little health
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void recoverShield() //sets to Max Defense
	{
		setDefense(getMaxDefense());
	}
	// ------- gets and sets -------
	public void setHealth (int health) {this.health = health;}
	public int getHealth () {return this.health;}
	
	public void setMaxDefense (int maxDefense) {this.maxDefense = maxDefense;}
	public int getMaxDefense () {return this.maxDefense;}
	
	public void setDefense (int defense) {this.defense = defense;}
	public int getDefense () {return this.defense;}
	
	public void setMaxHealth (int maxHealth) {this.maxHealth = maxHealth;}
	public int getMaxHealth () {return this.maxHealth;}
	
	public void setEquippedWeapon (Weapon equippedWeapon) {this.equippedWeapon = equippedWeapon;}
	public Weapon getEquippedWeapon () {return this.equippedWeapon;}
	
	public void setImagePath (String imagePath) {this.imagePath = imagePath;}
	public String getImagePath () {return this.imagePath;}
	
	public int[] getPosition() {
		return position;
	}
	public void setPosition(int[] position) {
		this.position = position;
	}
	
	public int getY() {
		return this.position[1];
	}
	
	public void setY(int y) {
		this.position[1] = y;
	}
	
	public int getX() {
		return this.position[0];
	}
	
	public void setX(int x) {
		this.position[0] = x;
	}
	
	public boolean inRangeOf(Human human) {//if it is in the range of this humans weapons it returns true
		Point node1 = new Point(human.getX()- human.getEquippedWeapon().getRange(), human.getY()- human.getEquippedWeapon().getRange()); // top right node
		Point node2 = new Point(human.getX()+ human.getEquippedWeapon().getRange(), human.getY()- human.getEquippedWeapon().getRange()); // top left node
		Point node3 = new Point(human.getX()- human.getEquippedWeapon().getRange(), human.getY()+ human.getEquippedWeapon().getRange());// bottom right node
		Point node4 = new Point(human.getX()+ human.getEquippedWeapon().getRange(),human.getY()+ human.getEquippedWeapon().getRange());// bottom left node
		if( ( getX() >= node1.getX() && getX() <= node4.getX() ) && (getY() <= node3.getY() && getY() >= node2.getY() )  ) 
		{
			return true;
		}
		return false;
			
	}


} // Human class
