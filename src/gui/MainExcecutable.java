package src.gui;
// last updated 05-09-19

import src.character.Player;

public class MainExcecutable
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
		MainExcecutable.player = player;
	}
} // Main class
