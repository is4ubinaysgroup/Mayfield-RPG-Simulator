// execute was spelled wrong - Mina
// last updated 05-14-19

// 05-17 updated by Mina



package src.gui;

import src.Database;
import src.character.Player;

public class MainExecutable
{
	private static Player player;

	public static void main(String[] args)
	{
		int[] position = new int[2];
		position[0] = 0;
		position[1] = 0;
		try {
		player = new Player(100,10,10,100, Database.getPencil() , "src\\resources\\playerSprite.png", position, 0, 0, 10,10,10);//TODO set to actual data
		}
		catch(ExceptionInInitializerError e) 
		{
			try {
				throw e.getCause();
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		GUIExtension1.initFrameAndParentPanel ();
		
		MainMenu.initGUI();
		Help.initGUI();
		Navigation.initGUI();
		Map.initGUI();
		Backpack.initGUI();
		Shop.initGUI();
		
		
		// null pointer error currently exists with private static hat weapon in database
		
		// single save file is loaded on new game or continue button click on main menu
		
		// level starts at 1 for now; 0 would be for when the tutorial is implemented		
		// position starts at 0, 0	
		
		
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
