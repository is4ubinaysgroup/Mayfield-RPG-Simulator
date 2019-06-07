/*
05-24 Mina
not sure if any additional imports are needed because in my IDE put everying in one folder
 */

package src.gui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import src.Database;


public class EndScreen
{

	static protected JPanel endPane;
	static protected JLabel lbl_message1;
	static protected JLabel lbl_message2;
	static protected JButton btn_Map;

	
	
	public static void initGUI()
	{
		
		// ------- endPane -------
		endPane = new JPanel();
		endPane.setLayout (null);
		
		
		// ------- lbl_message1 -------
		lbl_message1 = new JLabel("message1 placeholder");
		lbl_message1.setBounds(262, 213, 800, 20);
		endPane.add(lbl_message1);
		
		
		// ------- lbl_message2 -------
		lbl_message2 = new JLabel("message2 placeholder");
		lbl_message2.setBounds(262, 299, 800, 20);
		endPane.add(lbl_message2);

		
		// ------- btn_Map -------
		btn_Map = new JButton("Back to Map");
		btn_Map.setBounds(446, 427, 134, 29);

		btn_Map.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				if (MainExecutable.getPlayer().getLevel() > 0)
				{
					GUIExtension1.switchPane(Map.getPane());
				}
				else
				{
					GUIExtension1.switchPane(MainMenu.getPane()); // go back to mainmenu if lost tutorial
					btn_Map.setText("Back to Map");
				}
			}
		});

		endPane.add(btn_Map);
		
		
	} // initGUI method
	
	
	
	public static JPanel getPane() { return endPane; } // getPane method

	
	
	public static void updateForTutorial (boolean win)
	{
		if (win == true)
		{
			MainExecutable.getPlayer().setLevel(1);
			MainExecutable.getPlayer().setCoins(MainExecutable.getPlayer().getCoins() + 10);
			
			lbl_message1.setText("You've passed your first test!");
			lbl_message2.setText("Here's 10 more coins.");
			
		} // if won tutorial
		else
		{
			MainExecutable.getPlayer().setHealth(20);
			btn_Map.setText("Back to Start");
			
			lbl_message1.setText("You've been beaten by the gym teacher...");
			lbl_message2.setText("TRY AGAIN!!!");
			playSound(Database.getMusicalNegative());
			
		} // else lost tutorial
	} // updateForTutorial method

	
	
	public static void update(boolean win, int coinsAmount, boolean alreadyOwnsWeapon, boolean had0Coins)
	{
		
		String message1;
		String message2;
		
		if (win == true)
		{
			message1 = "Congrats! You've won!";
			
			if (alreadyOwnsWeapon == false)
			{
				message2 = ("You've won " + coinsAmount + "coins and the boss's weapon");
			} // if winning weapon
			else
			{
				message2 = ("You've won " + coinsAmount + "coins.");
			} // else already owns boss weapon
		} // if the player has won
		
		
		
		else
		{
			message1 = "YOU'VE LOST!!!";
			
			if (had0Coins == false)
			{
				message2 = ("You've lost " + coinsAmount + "coins.");
			}
			else
			{
				message2 = ("YOU LEVELED DOWN!!!");
			} //else player had 0 coins
			
			playSound(Database.getMusicalNegative());
		} // else the player has lost
		
		
		lbl_message1.setText(message1);
		lbl_message2.setText(message2);
		
	} // update method
	
	
	
	public static void playSound (File file)
	{
		try {
			Database.playSound(file);
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} // try-catch
	} // playSound method
	
	
} // EndScreen class