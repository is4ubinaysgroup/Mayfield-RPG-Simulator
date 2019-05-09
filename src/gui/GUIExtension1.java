// Mina Fang
// initially completed 04-28-2019

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUIExtension1
{

	static protected JFrame frame;
	static protected JPanel cards;
	
	
	public static void initFrameAndParentPanel ()
	{
		frame = new JFrame ("Mayfield RPG Simulator");
		frame.setSize (800, 800); // sets size 
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		cards = new JPanel(new CardLayout());
		
	} // initFrameAndParentPanel method
	
	
	
	public static void showFirstPane (JPanel panel)
	{
		cards.add (panel);
		frame.add (cards);			
		frame.validate();
		frame.setVisible (true);
		
	} // showFirstPane method
	
	
	
	public static void switchPane (JPanel panel)
	{
		cards.removeAll();
		cards.add(panel);
		frame.revalidate();
		frame.repaint();
	
	} // switchPane method
	
	
	
} // GUIExtension1
