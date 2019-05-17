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
		
		
		// null pointer error currently exists with private static hat weapon in database
		
		// level starts at 1 for now; 0 would be for when the tutorial is implemented		
		// position starts at 0, 0
		Database.loadSingle();
		
		
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
