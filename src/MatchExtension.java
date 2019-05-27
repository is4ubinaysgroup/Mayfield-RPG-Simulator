package src;

import src.gui.TestFrame;

public class MatchExtension
{

	public static boolean turn = false; // true if player's turn
	public static boolean run = false; // if the game is ongoing
	public static boolean win = false; // true if player wins


	public static void runMatch (int level)
	{
		turn = true;
		run = true;
		win = false;
		
		
		if (level == 0)
		{
			// tutorial
		}

		else if (level == 1)
		{
		
			//TEST
			TestFrame frame = new TestFrame();
			frame.initGui(frame);


		} // level 1

		else
		{
		}

	} // runMatch method
	
	
	
	
} // Match Extension class
