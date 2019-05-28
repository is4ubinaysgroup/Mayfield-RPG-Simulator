// Mina 05-27
// not sure yet what GUIshenanigans will be needed to switch to the end screen (will frame.removeAll be needed?)


package src;

import src.character.NonPlayer;
import src.gui.EndScreen;
import src.gui.GUIExtension1;
import src.gui.MainExecutable;
import src.gui.Map;
import src.gui.TestFrame;

public class MatchExtension
{

	public static int matchLevel; // needed to compare if the player is playing a level they've already beaten
	public static boolean run = false; // if the game is ongoing; needed for distinguishing if Backpack is being accessed out of battle
	
	public static boolean turn = false; // true if player's turn; not sure if this reference will be useful depending on logic for turns
	public static boolean win = false; // true if player wins; this variable may or may not be needed (see static endResult method in this class)

	

	public static void runMatch (int level)
	{
		matchLevel = level;
		turn = true;
		run = true;
		win = false;
		
		
		if (level == 0)
		{
			// tutorial
		}

		else if (level == 1)
		{
			/*TEST
			TestFrame frame = new TestFrame();
			frame.initGui(frame);
			*/


		} // level 1

		else
		{
		}

	} // runMatch method
	
	
	
	public static void endResult (NonPlayer boss, Boolean win) // win either needs to be set or passed
	{
		
		int level = MainExecutable.getPlayer().getLevel();
		int coins = MainExecutable.getPlayer().getCoins();
		
		
		if (win == true)
		{
			int winningAmount = level * coins;
			MainExecutable.getPlayer().setCoins(winningAmount); // the player wins coins
	
			if (level == matchLevel)
			{
				MainExecutable.getPlayer().setLevel(level+1);
				Map.updateMap(MainExecutable.getPlayer().getLevel()); // update the map
				
			} // increase the player's level if the player isn't playing a level they already beat
			
			
			if (MainExecutable.getPlayer().alreadyOwnsWeapon(boss.getEquippedWeapon()) == false)
			{
				MainExecutable.getPlayer().addWeapon(boss.getEquippedWeapon()); 
			} // the player wins the boss's weapon if they're beating the boss for the first time
			
			EndScreen.update(true, winningAmount, false, false); // update the battle over screen
			
		} // if the player was won the battle
		
		
		
		else
		{
			// alreadyOwnsWeapon boolean would be arbitrary
			
			if (coins == 0)
			{
				if (level == matchLevel)
				{
					MainExecutable.getPlayer().setLevel(level-1);
					Map.updateMap(MainExecutable.getPlayer().getLevel()); // update the map
					
				} // decrease the player's level if the player isn't playing a level they already beat
				
				EndScreen.update(false, 0, true, true); 

			} // if player has 0 coins when losing
			
			else if (coins < 10)
			{
				coins = coins-5;
				MainExecutable.getPlayer().setCoins(coins); // player loses 5 coins
				
				EndScreen.update(false, 5, true, false);
				
			} // else if the player has less than 10 coins
			
			else
			{
				
				double percentage = ((15 + (Math.random() * (20 - 15)))/100); // get a random percentage b/w 15-20%
				int losingAmount = (int)(coins*percentage); // get the losing amount of coins
				
				coins = coins - losingAmount;
				MainExecutable.getPlayer().setCoins(coins); // player loses 15-20% of their coins
				
				EndScreen.update(false, losingAmount, true, false);
				
			} // else the player has 10 or more coins
			
		} // else lose
		
		
		// not sure yet if more GUI stuff will be needed to transition out of battle
		GUIExtension1.switchPane(EndScreen.getPane()); // go to the battle over screen
		
	} // endResult method

	
} // Match Extension class