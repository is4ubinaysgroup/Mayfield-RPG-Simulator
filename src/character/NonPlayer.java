/**
 * 
 */
package src.character;

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
	public Boolean getIsBoss() {
		return isBoss;
	} 

	public void setIsBoss(Boolean isBoss) {
		this.isBoss = isBoss;
	}
	
		public void runTurn(Room room) //TODO
	{
		Player player = MainExecutable.getPlayer();
		int r = player.getEquippedWeapon().getRange();



		if(player.hasLowHealth()) //if Player has low health
		{
			attack(MainExecutable.getPlayer());
		}
		else if( ( r < Human.MOVEMENT)  && inRangeOf(player) && nearCorner() ) // if cornered
		{
			moveTo(player);
		}
		else if(player.inRangeOf(this) && ( player.getEquippedWeapon().getType() == Weapon.MELEETYPE || player.getEquippedWeapon().getType() == Weapon.ALLTYPE ))
		{// 3. If the player is in melee attack range:

			//The boss will check and follow the first true statement procedure in order of first to last:
			if(MainExecutable.getPlayer().hasLowHealth()) //1. If the player has low health:
			{
			}
			else if( ( r < Human.MOVEMENT)  &&  inRangeOf(player)  && nearCorner())//2. If the boss is cornered:
			{
				//The boss will move to the other side of the player, however, if the boss cannot it will move as far as it can to the other side of the player.
				moveTo(player);
			}
		}
		//Continues to the next true statement
		if(player.inRangeOf(this) && ( player.getEquippedWeapon().getType() == Weapon.RANGEDTYPE || player.getEquippedWeapon().getType() == Weapon.ALLTYPE ))//If the player is in non-melee attack range:
		{
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
		else	if(!(player.inRangeOf(this))) 
		{
			int random =  (int) ( Math.random() * 2 + 1); // will return either 1 or 2
			if(random == 1) 
			{
				moveIn(player, true, Weapon.MELEETYPE);
			}
			else // random == 2 
			{
				moveIn(player, true, Weapon.RANGEDTYPE);
			}
		}
		else	 if(inRangeOf(player)) 
		{
			moveOut(player,room,false);
			setHealth( getHealth() + (int) Math.ceil(getMaxHealth()*0.01) );//recovers 1% of health.
		}
		else 
		{
			
		}

	}				


	

	private boolean nearCorner() {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
 
