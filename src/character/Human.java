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
/*Carson
 * may 21st added getCorner, inCorner to Human. programmed moveAway.
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
	private Point position = new Point(0,0);
	
	/*
	 //We will move as close as we can to the position
	 //to do this I need to get Movement
	 
	 */
	protected boolean canMoveTo(int x, int y) {
		int changeInX = x - getX();
		int changeInY = y - getY();
		if(Math.abs(changeInX) <= MOVEMENT && Math.abs(changeInY) <= MOVEMENT  ) //can move here with no issues
		{
			return true;
		}
		return false;
	}
	
	
	public void moveTo(Point point) throws Exception 
	{
		if(canMoveTo(point.x, point.y)) //can move here with no issues
		{
			setX(point.x);
			setY(point.y);
		}
		else 
		{
			throw new Exception("Cannot move to "+point.x + "," +point.y+".");
		}
	}
	
	public void moveTo(Point point, boolean moveAnyWays) throws Exception 
	{
		//How much do we need to move to get there
		int changeInX = point.x - getX();
		int changeInY = point.y - getY();
		if(canMoveTo(point.x, point.y)) //can move here with no issues
		{
			setX(point.x);
			setY(point.y);
		}
		else if(moveAnyWays)
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
		else 
		{
			throw new Exception("Cannot move to "+point.x + "," +point.y+".");
		}
	}
	
	public boolean hasLowHealth() 
	{
		if(getHealth()==getMaxHealth()) 
		{
			return false;
		}
		if(0.25 < (getHealth()/getMaxHealth()) ) // I think below 25% is little health
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void attack(Human human) 
	{
		//Cuts damage from armor then if there is more damage it cuts to health. 
		//also adds critical change 
		int initialDamage = this.getEquippedWeapon().getDamage();
		if (Math.random() <= this.equippedWeapon.getCriticalChance()) 
		{
			initialDamage= initialDamage*2;
		}
		
		int damageToHealth = human.getDefense() - initialDamage;
		if(damageToHealth < 0) 
		{
			human.setDefense(0);
			if(human.getHealth() <= 0) 
			{
				human.setHealth(0);
			}
			else 
			{
				human.setHealth(human.getHealth() - Math.abs(damageToHealth));
			}
		}
		else 
		{
			human.setDefense(damageToHealth);
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
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public int getY() {
		return this.position.y;
	}
	
	public void setY(int y) {
		if(y < 0) 
		{
			y = 0;
		}
		else if(y > 20) 
		{
			y = 20;
		}
		this.position.setLocation(this.position.getX(), y);
	}
	
	public int getX() {
		return (int) this.position.getX();
	}
	
	public void setX(int x) {
		if(x < 0) 
		{
			x = 0;
		}
		else if(x > 20) 
		{
			x = 20;
		}
		this.position.setLocation(x,this.position.getY());
	}
	
	public boolean inRangeOf(Human human) {//if it is in the range of this humans weapons it returns true
		int changeInX = human.getX() - getX();
		int changeInY = human.getY() - getY();
		if(Math.abs(changeInX) <= human.getEquippedWeapon().getRange() && Math.abs(changeInY) <= human.getEquippedWeapon().getRange()  ) //can move here with no issues
		{
			return true;
		}
		return false;
			
	}


} // Human class
