// execute was spelled wrong - Mina
// last updated 05-14-19


package src.gui;

import src.Database;
import src.character.Player;

public class MainExecutable
{
	private static Player player;

	public static void main(String[] args)
	{
		GUIExtension1.initFrameAndParentPanel ();
		
		MainMenu.initGUI();
		Help.initGUI();
		Navigation.initGUI();
		Map.initGUI();
		Backpack.initGUI();
		Shop.initGUI();
		
		
		// temporary before save works
		// level is set to 1; 0 would be for when the tutorial is implemented		
		
		int [] temp = new int [2];
		
		player = new Player (20, 0, 0, 20, Database.getPencil(), "/resources/playerSprite.png", temp, 10, 1, 0, 0 ,10);
		
		/* constructor (int health, int defense, int maxDefense, int maxHealth, Weapon equippedWeapon,
			String imagePath, int [] position, int coins, int level, int numProducts, int numWeapons, int productCapacity) */
		
		
		
		GUIExtension1.showFirstPane(MainMenu.getPane());
	
	} // Main method

	/**
	 * @return the player
	 */
	public static Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public static void setPlayer(Player player) {
		MainExecutable.player = player;
	}
} // MainExecutable class
