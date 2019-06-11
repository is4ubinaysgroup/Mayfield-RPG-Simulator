/*
05-24 Mina
removed temporary player "loading/default"
added EndScreen
*/



package src.gui;
import src.Database;
import src.character.Player;

public class MainExecutable
{
	
	// ------- player -------
	private static Player player;
	public static Player getPlayer() {return player;}
	public static void setPlayer(Player player) {
		MainExecutable.player = player;		}

	
	public static void main(String[] args)
	{
		
		try {
			Database.LoadImages();
		} catch (Exception e2) {
			new ErrorFrame(e2).error();
		} // try-catch loading images
		
	
		// single save file is loaded on new game or continue button click on main menu
		// level starts at 0 for when the tutorial	
		// player position starts at 0, 0 (???outdated comment)
		
		GUIExtension1.initFrameAndParentPanel ();
		MainMenu.initGUI();
		Help.initGUI();
		Navigation.initGUI();
		Map.initGUI();
		Backpack.initGUI();
		Shop.initGUI();
		EndScreen.initGUI();
		
		

		GUIExtension1.showFirstPane(MainMenu.getPane()); // shows the main menu at the start of the program
		
		// for testing level 1
		/*
		
		BufferedImage test = Database.getImgBinay();
		if (null == test) {System.out.println("null image");}
		
		Database.loadSingle();
		MainExecutable.getPlayer().setLevel(1);
		Map.updateMap(1);
		Backpack.update();
		Shop.updateCoinsLabels();
		MatchExtension.runMatch(1);
		*/
		
	} // Main method

} // MainExecutable class