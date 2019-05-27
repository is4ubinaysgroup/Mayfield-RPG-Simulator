package src;

import src.gui.TestFrame;

public class MatchExtension
{

	static boolean turn; // true if player's turn
	static boolean run; // if the game is ongoing
	static boolean win; // true if player wins


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
