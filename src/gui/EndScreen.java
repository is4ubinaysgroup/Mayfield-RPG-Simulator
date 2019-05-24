/*
05-24 Mina
 */

package src.gui;

import src.character.Player;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


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
		lbl_message1.setBounds(262, 213, 165, 20);
		endPane.add(lbl_message1);
		
		
		// ------- lbl_message2 -------
		lbl_message2 = new JLabel("message2 placeholder");
		lbl_message2.setBounds(262, 299, 165, 20);
		endPane.add(lbl_message2);

		
		// ------- btn_Map -------
		btn_Map = new JButton("Back to Map");
		btn_Map.setBounds(446, 427, 134, 29);

		btn_Map.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				GUIExtension1.switchPane(Map.getPane());;
			}
		});

		endPane.add(btn_Map);
		
		
	} // initGUI method
	
	
	
	public static JPanel getPane() { return endPane; } // getPane method

	
	
	public static void update(boolean win, int coinsAmount, boolean alreadyOwnsWeapon)
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
			
			if (MainExecutable.getPlayer().getCoins() > 0)
			{
				message2 = ("You've lost " + coinsAmount + "coins.");
			}
			else
			{
				message2 = ("YOU LEVELED DOWN!!!");
			} //else player had 0 coins
			
		} // else the player has lost
		
		
		lbl_message1.setText(message1);
		lbl_message2.setText(message2);
		
	} // update method
	
	
} // EndScreen class
