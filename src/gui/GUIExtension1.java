package src.gui;

// Mina Fang
// initially completed 04-28-2019
// updated 05-10

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
		try {
			frame.setIconImage( ImageIO.read(new File("src/resources/MayfieldSecondarySchool.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	
	
	public static void switchToShop (JTabbedPane tabbedPanel)
	{
		frame.remove(cards);
		frame.add (tabbedPanel);
		frame.revalidate();
		frame.repaint();
	
	} // switchToShop method
	
	
	
	public static void leaveShop (JPanel panel)
	{
		cards.add(panel);
		frame.remove (Shop.getTabbedPane());
		frame.add (cards);			
		frame.revalidate();
		frame.repaint();
	
	} // leaveShop method
	
	
} // GUIExtension1
