/**
 * 
 */
package src.character;

import src.Room;
import src.gui.MainExecutable;

/**
 * @author Carson Fujita
 * May 13th 2019.
 * Created 
 * 
 * May 14th 2019.
 * created isBoss with setters and getters
 * created runTurn()
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
	
	public NonPlayer(String name,Boolean isBoss) 
	{
		this.name = name;
		this.setIsBoss(isBoss);
	}

	public Boolean getIsBoss() {
		return isBoss;
	}

	public void setIsBoss(Boolean isBoss) {
		this.isBoss = isBoss;
	}
	
	public void runTurn(Room room) //TODO
	{
		int r = MainExecutable.getPlayer().getEquippedWeapon().getRange();
		int x =MainExecutable.getPlayer().getX();
		int y = MainExecutable.getPlayer().getY();
		
		Point node1 = new Point(x+r, y+r);
		Point node2 = new Point(x+r, y-r);
		Point node3 = new Point(x-r, y-r);
		Point node4 = new Point(x-r,y+r);
		
	
		
		if(MainExecutable.getPlayer().hasLowHealth()) //if Player has low health
		{
			
		}
		else if( ( r > Human.MOVEMENT ) && (this.getX() >= node4.x && this.getX() <= node2.x &&
				this.getY() >= node4.y && this.getY() <= node2.y) && () ) // if cornered
		{
			
		}
			
	}

	
	

}
 
