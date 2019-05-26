/**
 * 
 */
package src.character;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

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
	
	public NonPlayer(String name,Boolean isBoss) 
	{
		this.name = name;
		this.setIsBoss(isBoss);
	}

	public NonPlayer(String name,Boolean isBoss, Weapon weapon) 
	{
		this.name = name;
		this.setIsBoss(isBoss);
		this.setEquippedWeapon(weapon);
	}
	
	public NonPlayer(String name,Boolean isBoss, Weapon weapon, int[] pos) 
	{
		this.name = name;
		this.setIsBoss(isBoss);
		this.setEquippedWeapon(weapon);
		this.setPosition(pos);
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
		int y = (int) getRoom().getHeight();
		if(human.getX() < Math.abs(Human.MOVEMENT)) //incase movement is ever set to a negitive the ai will still work
		{
			x = (int) getRoom().getWidth();
		}
		if(human.getY() < Math.abs(Human.MOVEMENT)) 
		{
			y = 0;
		}
		return new Point(x,y);
	}

	public boolean nearCorner(Human human ) {
		if(human.getY() > getRoom().getHeight()-Math.abs(Human.MOVEMENT) || human.getX() > getRoom().getWidth()-Math.abs(Human.MOVEMENT) || human.getX() < Math.abs(Human.MOVEMENT) || human.getY() <  Math.abs(Human.MOVEMENT))
		{
			return true;
		}
		return false;
	}

	public void moveOut(Human human, boolean useMostOptimalMove) throws Exception //moves out of a human's weapons range
	{
		Point[] allPoints = new Point[(int) getRoom().getWidth()*(int) getRoom().getHeight()];
		for(int x = 0;  x != (int) getRoom().getWidth(); x++) 
		{
			for(int y= 0;  y != (int) getRoom().getHeight(); y++) // find all available points
			{
				if(canMoveTo(x,y)) // remove all points in array that are outside human range
				{
					allPoints[x+y] = new Point(x,y);// puts point into array.
				}
			}
		}// creates an array
		
		//shorten array 
		
		
		ArrayList<Point> buffer = new ArrayList<Point>( (int) (getRoom().getWidth()* getRoom().getHeight()) );
		for(int i = 0;  i < allPoints.length; i++) 
		{
			if(allPoints[i] != null) // if not null
			{
				buffer.add(allPoints[i]);
			}
		}// creates an array
		int newLength = 0; 
		for(newLength = 0; buffer.get(newLength) != null ; newLength++) {}//finds the new length. since it will include null positions we want only till it gets null
		
		
		if(useMostOptimalMove = true) 
		{
		// if one Point left in array: move there
		if(newLength == 0) // if no Points left in array: move away from human
		{
			moveAway(human);
		}
		else 
		{
			
		}
		}
		else //useMostOptimalMove = false
		{
			Random random = new Random();
			Point newPosition = buffer.get( (int) Math.floor(random.nextInt() * newLength) );
			moveTo( buffer.get( (int) Math.floor(random.nextInt() * newLength) ), true);
		}
		//END
		
		
		// remove all points in array that aren't within it's movement
		// if one Point left in array: move there
		// if no Points left in array: move away from human
		
		//copy array.
		
		//remove all spots at the corners
		// if one Point left in array: move there
		// if no Points left in array: move away from human
		
		//remove all spots near the corners by 1
		// if one Point left in array: move there
		// if no Points left in array: use previous data and choose farthest point
		
		
		// remove all spots out of its melee range
		//if none left copy the orginal array
		//removes all spots near the human by the human range + 1
		//continue till there is only one point left
		// if one Point left in array: move there
		// if no Points left in array: use previous data and choose farthest point
				

		
		
		
		
		
		//finds an available spot that is out of human range but is in its range
		//finds an available spot that is out of human range
		//finds a spot as far as it can from human range but towards an open area without nearing the player more
		//finds a spot as far as it can from human range
		//moves to the first range found
	}
	

	public void moveIn(Human human) throws Exception //moves so that human is in it's weapon range
	{
		int x = human.getX();
		int y = human.getY();
		ArrayList<Point> output = cleanArray(getPointsInMovement(this));
		output.remove(new Point(x,y));// we don't want it trying to move on the player
		ArrayList<Point> position;
		Point[][] selection = 
			{
				getPointsInMovement(human), getPointsInRange(human)
			};
		int length = getLength(output);
		
		for(int i = 0; i < 2 && length > 1; i++) 
		{
			position = cleanArray(selection[i]);
			for(int pos = getLength(position); pos != -1; pos--) 
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
		
		
		if(length == 1) 
		{
			moveTo(output.get(0), false);
		}
		
		if(length > 1) 
		{
			moveTo(output.get((int) Math.random()*(length)), false);
		}
		
	}
	
	
	private int getLength(ArrayList<Point> buffer)
	{
		int newLength = buffer.size(); 
		//for(newLength = 0; buffer.get(newLength) != null ; newLength++) {}//finds the new length. since it will include null positions we want only till it gets null
		return newLength-1;
		
	}
	
	public Point[] getPointsInMovement(Human human) 
	{
		Point[] allPoints = new Point[(int) getRoom().getWidth()*(int) getRoom().getHeight()];
		for(int x = 0;  x != (int) getRoom().getWidth(); x++) 
		{
			for(int y= 0;  y != (int) getRoom().getHeight(); y++) // find all available points
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
		Point[] allPoints = new Point[(int) getRoom().getWidth()*(int) getRoom().getHeight()];
		for(int x = 0;  x != (int) getRoom().getWidth(); x++) 
		{
			for(int y= 0;  y != (int) getRoom().getHeight(); y++) // find all available points
			{
				if(range + human.getX() > x && x > human.getX() - range &&	range + human.getY() >  y && y  >	human.getY() - range) 
				{
					allPoints[x+y] = new Point(x,y);// puts point into array.
				}
			}
		}// creates an array
		return allPoints;
	}
	
	
	
	public void moveIn(Human human, boolean useMostOptimalMove, int attackType) throws Exception//optimal 
	{
	}
	
	
	public ArrayList<Point> cleanArray(Point[] allPoints) 
	{
		ArrayList<Point> buffer = new ArrayList<Point>( (int) (getRoom().getWidth()* getRoom().getHeight()) );
		for(int i = 0;  i < allPoints.length; i++) 
		{
			if(allPoints[i] != null) // if not null
			{
				buffer.add(allPoints[i]);
			}
		}// creates an array
		return buffer;
	}
	
	public ArrayList<Point> cleanArray(ArrayList<Point> allPoints) 
	{
		ArrayList<Point> buffer = new ArrayList<Point>( (int) (getRoom().getWidth()* getRoom().getHeight()) );
		for(int i = 0;  i < allPoints.size() ; i++) 
		{
			if(allPoints.get(i) != null) // if not null
			{
				buffer.add(allPoints.get(i));
			}
		}// creates an array
		return buffer;
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
	
		public void runTurn() throws Exception //TODO
	{
		Player player = MainExecutable.getPlayer();
		int r = player.getEquippedWeapon().getRange();
		player.setHealth(player.maxHealth);


		if(player.hasLowHealth()) //if Player has low health
		{
			System.out.println("Low Health");
			attack(MainExecutable.getPlayer());
		}
		else if( ( r < Human.MOVEMENT)  && inRangeOf(player) && nearCorner() ) // if cornered
		{
			System.out.println("cornered");



			
			moveTo(player,true);
		}
		else if( player.inRangeOf(this) && ( player.getEquippedWeapon().getType() == Weapon.MELEETYPE || player.getEquippedWeapon().getType() == Weapon.ALLTYPE ) )
		{// 3. If the player is in melee attack range:
			System.out.println("melee attack range");
			//The boss will check and follow the first true statement procedure in order of first to last:
			if(MainExecutable.getPlayer().hasLowHealth()) //1. If the player has low health:
			{
			}
			else if( ( r < Human.MOVEMENT)  &&  inRangeOf(player)  && nearCorner())//2. If the boss is cornered:
			{
				//The boss will move to the other side of the player, however, if the boss cannot it will move as far as it can to the other side of the player.
				moveTo(player,true);
			}
		}
		//Continues to the next true statement
		if(player.inRangeOf(this) && ( player.getEquippedWeapon().getType() == Weapon.RANGEDTYPE || player.getEquippedWeapon().getType() == Weapon.ALLTYPE ))//If the player is in non-melee attack range:
		{
			System.out.println("nonmelee attack range");
			int random =  (int) ( Math.random() * 2 + 1); // will return either 1 or 2
			if(random == 1) 
			{
				attack(player);
			}
			else
			{
				runAndHit(player);
			}
		}
		else if(!(player.inRangeOf(this))) 
		{
			System.out.println("in not range");
			moveIn(player);
			/*int random =  (int) ( Math.random() * 2 + 1); // will return either 1 or 2
			if(random == 1) 
			{
				moveIn(player, true, Weapon.MELEETYPE);
			}
			else // random == 2 
			{
				moveIn(player, true, Weapon.RANGEDTYPE);
			}*/
		}
		else if(inRangeOf(player)) 
		{
			System.out.println("in player range");
			moveOut(player,false);
			setHealth( getHealth() + (int) Math.ceil(getMaxHealth()*0.01) );//recovers 1% of health.
		}
		else 
		{
			System.out.println("else");
		}
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
 
