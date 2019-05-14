// execute was spelled wrong - Mina

package src.gui;
// last updated 05-09-19

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
		
		// level is set to 1; 0 would be for when the tutorial is implemented
		// not sure if this is right
		player = new Player (20, 0, 0, 20, Database.getPencil(), "/resources/playerSprite.png", new int [] position = int [2], 10, 1, 0, 0 ,10);
		
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
