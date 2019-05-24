// execute was spelled wrong - Mina
// 05-17 updated by Mina



package src.gui;

import src.Database;
import src.character.Player;

public class MainExecutable
{
	private static Player player;

	public static void main(String[] args)
	{
		try {
			Database.LoadImages();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		// single save file is loaded on new game or continue button click on main menu
		// level starts at 1 for now; 0 would be for when the tutorial is implemented		
		// position starts at 0, 0	
		
		
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
		MainExecutable.player = player;
	}
} // MainExecutable class
