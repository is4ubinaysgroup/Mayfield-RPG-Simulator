/**
 * 
 */
package src.character;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import src.Database;
import src.gui.MainExecutable;
import src.gui.Room;
import src.items.Weapon;
/**
 * @author Carson Fujita
 * May 13th 2019.
 * Created 
 * 
 * May 14th 2019.
 * created isBoss with setters and getters
 * created runTurn()
 */
/*
may 16th 2019
Carson Fujita
coded more to runTurn()
added nearCorner()


*/
public class NonPlayer extends Human {

	/**
The boss will check and follow the first true statement procedure in order of first to last:
1. If the player has low health:
the boss will attack the player
End of turn.
2. If the boss is cornered:
The boss will move to the other side of the player, however, if the boss cannot it will move as far as it can to the other side of the player.
Continue to the next true statement
3. If the player is in melee attack range:
Based on a random number from 1-2 the boss will:
If 1, attack the player.
If 2, move out of melee range but into non-melee range, then attack.
End of turn.
4. If the player is in non-melee attack range:
Based on a random number from 1-10 the boss will:
If the number is < 7 The boss will attack with its non-melee weapon.
If the number is equal to or > than 7 then, the boss will move into melee range and attack the player.
End of turn.
5. player is not in range:
Based on a random number from 1-2 the boss will:
If 1, The boss will move only as close as it can to ensure the player is in it's melee range, however, if the boss can do this and be out of the players attack range it will move to the location that it can attack and be out of player range.
If 2, The boss will move only as close as it can to ensure the player is in it's non-melee range, however, if the boss can do this and be out of the players attack range it will move to the location that it can attack and be out of player range.
End of turn.
6. The Boss is in player range
The boss will move out of player range and recover 1% of its health.
End of turn.


UML
-isBoss: boolean
+ setToBoss(boolean)
+ setToHallMonitor(Boolean)

	 */
	
	private Boolean isBoss;
	private Room room;
	
	public NonPlayer(String name,Boolean isBoss, Weapon weapon, int maxDefense, int maxHealth, Point pos) 
	{
		this.name = name;
		this.setIsBoss(isBoss);
		this.setEquippedWeapon(weapon);
		this.setPosition(pos);
		this.maxDefense = maxDefense;
		this.defense = maxDefense;
		this.maxHealth = maxHealth;
		this.health = maxHealth;
	}
	
	public Boolean getIsBoss() {
		return isBoss;
	} 

	public void setIsBoss(Boolean isBoss) {
		this.isBoss = isBoss;
	}
	
	
	//Movement related Functions
	public void moveTo(Human human, boolean moveAnyWays) throws Exception // moves to a human
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
		
		moveTo(output,true);
	}
	
	public void moveAway(Human human) //moves away from a human
	{
		Point dir = getCorner(human);
		Point Buffer = dir;
		Buffer.setLocation(dir.x/ Math.abs(dir.x), dir.y / Math.abs(dir.y) );
		for(int i = 1; i != Human.MOVEMENT; i--) 
		{
			human.setX(getX()+(i*Buffer.x));
			human.setY(getY()+(i*Buffer.y));
		}
	}
	
	public Point getCorner(Human human )  {
		int x = 0;
		int y = (int) getRoom().getBoardHeight();
		if(human.getX() < Math.abs(Human.MOVEMENT)) //incase movement is ever set to a negitive the ai will still work
		{
			x = (int) getRoom().getBoardWidth();
		}
		if(human.getY() < Math.abs(Human.MOVEMENT)) 
		{
			y = 0;
		}
		return new Point(x,y);
	}

	public boolean nearCorner(Human human ) {
		if(human.getY() > getRoom().getBoardHeight()-Math.abs(Human.MOVEMENT) || human.getX() > getRoom().getBoardWidth()-Math.abs(Human.MOVEMENT) || human.getX() < Math.abs(Human.MOVEMENT) || human.getY() <  Math.abs(Human.MOVEMENT))
		{
			return true;
		}
		return false;
	}

	public void moveOut(Human human) throws Exception //moves out of a human's weapons range
	{	 
		int x = human.getX();
		int y = human.getY();
		ArrayList<Point> output = scatterArray(cleanArray(getPointsInMovement(this)));
		output.remove(new Point(x,y));// we don't want it trying to move on the player, don't worry if it isn't there it wont throw an exception.
		/*We want to find the most optimal position that the ai will go to. 
		we will create an array containing the entire field then we will remove them piece by piece till there is one left.
		*/
		ArrayList<Point> position;
		Point[][] selection = 
			{
				getPointsInRange(human), getPointsInMovement(human), getPointsNearEdges(this)
			};
		/*
	alrighty so this is a list of the lists of the points it will remove. read slowly if you didn't get it. 
	Guarantee this will result in one left.
		 */
		
		int length = getLength(output);
		
		for(int i = 0; i < 3 && length > 1; i++) 
		{
			position = scatterArray((cleanArray(selection[i])));
			for(int pos = getLength(position); pos != -1; pos--) 
			{
				output.remove(position.get(pos));
				output = cleanArray(output);
				length = getLength(output);
				if(length == 2) 
				{
					break;
				}
			
			}
		}
		
		if(length == 1) 
		{
			moveTo(output.get(0), false);
		}
		
		if(length > 1) 
		{
			moveTo(output.get((int) Math.random()*(length)), false);
		}
	}
	

	public void moveIn(Human human) throws Exception //moves so that human is in it's weapon range
	{
		int x = human.getX();
		int y = human.getY();
		ArrayList<Point> output = scatterArray(scatterArray(cleanArray(getPointsInMovement(this))));
		output.remove(new Point(x,y));// we don't want it trying to move on the player, don't worry if it isn't there it wont throw an exception.
		/*We want to find the most optimal position that the ai will go to. 
		we will create an array containing the entire field then we will remove them piece by piece till there is one left.
		*/
		ArrayList<Point> position;
		Point[][] selection = 
			{
				getPointsInMovement(human) ,getPointsInRange(human), getPointsNearEdges(this)
			};
		/*
	alrighty so this is a list of the lists of the points it will remove. read slowly if you didn't get it. 
	Guarantee this will result in one left.
		 */
		
		int length = getLength(output);
		Random random = new Random();
		for(int i = 0; i < 3 && length > 1; i++) 
		{
			position = scatterArray(scatterArray(cleanArray(selection[i])));
			if(random.nextInt(8) >= 4) {
				for(int pos = getLength(position); pos != -1; pos--) 
				{
					output.remove(position.get(pos));
					output = cleanArray(output);
					length = getLength(output);
					if(length == 2) 
					{
						break;
					}

				}
			}
			else 
			{
				for(int pos = 0; pos <  getLength(position); pos++) 
				{
					output.remove(position.get(pos));
					output = cleanArray(output);
					length = getLength(output);
					if(length == 1) 
					{
						break;
					}

				}
			}
		}


		if(length == 1) 
		{
			moveTo(output.get(0), false);
		}
		
		if(length > 1) 
		{
			moveTo(output.get((int) Math.random()*(length)), false);
		}
		
	}
	
	
	private Point[] getPointsNearEdges(NonPlayer nonPlayer) 
	{
		Point[] results = new Point[(int) getRoom().getBoardWidth()*(int) getRoom().getBoardHeight()];
		for(int point = 0;  point != results.length; point++) 
		{
			if(results[point] != null) 
			{
				if(results[point].x > (int) Math.random()*6 || results[point].y > (int) Math.random()*6)
				{
					results[point] = null;
				}
			}
		}
		return results;
		
	}

	private int getLength(ArrayList<Point> buffer)
	{
		int newLength = buffer.size(); 
		//for(newLength = 0; buffer.get(newLength) != null ; newLength++) {}//finds the new length. since it will include null positions we want only till it gets null
		return newLength-1;
		
	}
	
	public Point[] getPointsInMovement(Human human) 
	{
		Point[] allPoints = new Point[(int) getRoom().getBoardWidth()*(int) getRoom().getBoardHeight()];
		for(int x = 0;  x != (int) getRoom().getBoardWidth(); x++) 
		{
			for(int y= 0;  y != (int) getRoom().getBoardHeight(); y++) // find all available points
			{
				if(human.canMoveTo(x,y)) // remove all points in array that are outside human range
				{
					allPoints[x+y] = new Point(x,y);// puts point into array.
				}
			}
		}// creates an array
		return allPoints;
	}
	
	
	public Point[] getPointsInRange(Human human) 
	{
		int range = human.getEquippedWeapon().getRange();
		Point[] allPoints = new Point[(int) getRoom().getBoardWidth()*(int) getRoom().getBoardHeight()];
		for(int x = 0;  x != (int) getRoom().getBoardWidth(); x++) 
		{
			for(int y= 0;  y != (int) getRoom().getBoardHeight(); y++) // find all available points
			{
				if(range + human.getX() > x && x > human.getX() - range &&	range + human.getY() >  y && y  >	human.getY() - range) 
				{
					allPoints[x+y] = new Point(x,y);// puts point into array.
				}
			}
		}// creates an array
		return allPoints;
	}
	
	
	public ArrayList<Point> cleanArray(Point[] allPoints) 
	{
		ArrayList<Point> buffer = new ArrayList<Point>( (int) (getRoom().getBoardWidth()* getRoom().getBoardHeight()) );
		for(int i = 0;  i < allPoints.length; i++) 
		{
			if(allPoints[i] != null) // if not null
			{
				buffer.add(allPoints[i]);
			}
		}// creates an array
		return buffer;
	}
	
	public void swapIndex(ArrayList<Point> allPoints, int index1, int index2)
	{
		Point buffer1 = allPoints.get(index1);
		Point buffer2  =allPoints.get(index2);
		allPoints.set(index2, buffer1);
		allPoints.set(index1, buffer2);
	}
	
	public ArrayList<Point> scatterArray(ArrayList<Point> allPoints) //randomizes the index of all objects in array
	{//TODO
		for(int i = 0;  i != allPoints.size(); i++) 
		{
			swapIndex(allPoints,i,(int) Math.round(Math.random()*(allPoints.size()-1)));
		}// creates an array
		for(int i = 0;  i != allPoints.size(); i++) 
		{
			swapIndex(allPoints,i,(int) Math.round(Math.random()*(allPoints.size()-1)));
		}// creates an array
		return allPoints;
	}
	
	public ArrayList<Point> cleanArray(ArrayList<Point> allPoints) 
	{
		ArrayList<Point> buffer = new ArrayList<Point>( (int) (getRoom().getBoardWidth()* getRoom().getBoardHeight()) );
		for(int i = 0;  i < allPoints.size() ; i++) 
		{
			if(allPoints.get(i) != null) // if not null
			{
				buffer.add(allPoints.get(i));
			}
		}// creates an array
		
		return buffer;
	}
	
		public void runTurn(Room room) throws Exception //TODO
		{
		setRoom(room);
		int r = MainExecutable.getPlayer().getEquippedWeapon().getRange();


		if(MainExecutable.getPlayer().hasLowHealth()) //if Player has low health
		{
			System.out.println("Low Health");
			moveIn(MainExecutable.getPlayer());
			
		}
		else if( ( r < Human.MOVEMENT)  && inRangeOf(MainExecutable.getPlayer()) && nearCorner() ) // if cornered
		{
			System.out.println("cornered");
			moveIn(MainExecutable.getPlayer());
		}
		else if( MainExecutable.getPlayer().inRangeOf(this) && ( MainExecutable.getPlayer().getEquippedWeapon().getType() == Weapon.MELEETYPE || MainExecutable.getPlayer().getEquippedWeapon().getType() == Weapon.ALLTYPE ) )
		{// 3. If the player is in melee attack range:
			System.out.println("melee attack range");
			//The boss will check and follow the first true statement procedure in order of first to last:
			if(MainExecutable.getPlayer().hasLowHealth()) //1. If the player has low health:
			{
				moveIn(MainExecutable.getPlayer());
			}
			
		}
		//Continues to the next true statement
		else if(MainExecutable.getPlayer().inRangeOf(this) && ( MainExecutable.getPlayer().getEquippedWeapon().getType() == Weapon.RANGEDTYPE || MainExecutable.getPlayer().getEquippedWeapon().getType() == Weapon.ALLTYPE ))//If the player is in non-melee attack range:
		{
			System.out.println("nonmelee attack range");
			int random =  (int) Math.round( Math.random() * 2) + 1; // will return either 1 or 2
			if(random == 1) {
				moveOut(MainExecutable.getPlayer());
			}
		}
		else if(!(MainExecutable.getPlayer().inRangeOf(this))) 
		{
			System.out.println("in not range");
			int random =  (int) ( Math.random() * 2 + 1); // will return either 1 or 2
			if(random == 1) 
			{
				moveIn(MainExecutable.getPlayer());
			}
			else 
			{
				moveOut(MainExecutable.getPlayer());//moveIn(player, true, Weapon.RANGEDTYPE);
			}
		}
		else if(inRangeOf(MainExecutable.getPlayer())) 
		{
			System.out.println("in player range");
			moveOut(MainExecutable.getPlayer());
			
		}
		else 
		{
			moveIn(MainExecutable.getPlayer());
		}
		
		if(MainExecutable.getPlayer().inRangeOf(this)) {
			
		attack(MainExecutable.getPlayer());
		Database.playSound (Database.getHit());
		}
		
		setDefense( getDefense() + (int) Math.round(getMaxDefense()*0.01) );//recovers 1% of health.
		MainExecutable.getPlayer().setDefense( (int) (MainExecutable.getPlayer().getDefense() + MainExecutable.getPlayer().getMaxDefense()*0.01 ));//recovers 1% of health.

		System.out.println("Finish");
	}				


	

	private boolean nearCorner() {
		if( (getX() < 3 && getY() <3 ) || (getX() > 14 && getY() >14 ) ) 
		{
			return true;
		}
		return false;
	}

	/**
	 * @return the getRoom()
	 */
	public Room getRoom() {
		return this.room;
	}

	/**
	 * @param getRoom() the getRoom() to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	
	

}
 
