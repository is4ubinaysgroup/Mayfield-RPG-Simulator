package src.gui;

// Mina 05-29 updated


import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
/*
@Author Binay
@Contributors: Binay, Mina, Carson
Help panels displays advice and tips for the user.
Version: 2
Updated 05/10/2019 By Mina and Matthew
Updated 05/27/19 by Zac
*/

import src.Database;

public class Help
{
	static protected JButton btn_Back;
	static protected JLabel lbl_Title;
	static protected JPanel helpPane;
	
	static protected JLabel line1;
	static protected JLabel line2;
	static protected JLabel line3;
	static protected JLabel line4;
	static protected JLabel line5;
	static protected JLabel line6;
	static protected JLabel line7;
	static protected JLabel line8;
	static protected JLabel line9;
	static protected JLabel line10;

	
	public static void initGUI()
	{
		// ------- helpPane -------
		helpPane = new JPanel ();
		helpPane.setLayout (null);
		
		
		// local background
		JPanel background = new JPanel() 
		{

			private static final long serialVersionUID = -2339005568596082953L;

			public void paint(Graphics g) 
			{
				g.drawImage(Database.getMainMenuBackground(), 0, 0, 1314, 878, null);
			}
		};
		background.setBounds(0, 0, 1000, 800);
		background.setVisible(true);

		
		// ------- label main help title -------
		lbl_Title = new JLabel("How to Play");
		lbl_Title.setForeground(new Color(247, 221, 0));
		lbl_Title.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		lbl_Title.setBounds(400, 51, 784, 64);
		helpPane.add(lbl_Title);
		
		
		// -------- line1 ---------------
		line1 = new JLabel ("Welcome to highschool! In Mayfield RPG Simulator, you will traverse all themed areas to defeat");
		line1.setForeground(new Color(247, 221, 0));
		line1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line1.setBounds (100, 140, 800, 20);
		helpPane.add(line1);
		
		// -------- line2 ---------------
		line2 = new JLabel ("students and teachers. Beat the gym teacher first; then use the map to head to your first class, or");
		line2.setForeground(new Color(247, 221, 0));
		line2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line2.setBounds (100, 170, 800, 20);
		helpPane.add(line2);
		
		// -------- line3 ---------------
		line3 = new JLabel ("walk across to the plaza to see what items you can buy with coins.");
		line3.setForeground(new Color(247, 221, 0));
		line3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line3.setBounds (100, 200, 800, 20);
		helpPane.add(line3);
		
		// -------- line4 ---------------
		line4 = new JLabel ("Win coins and weapons by defeating the bosses. For each turn in battle, you can move and/or");
		line4.setForeground(new Color(247, 221, 0));
		line4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line4.setBounds (100, 260, 800, 20);
		helpPane.add(line4);
		
		// -------- line5 ---------------
		line5 = new JLabel ("attack, use an item, or switch your weapon.");
		line5.setForeground(new Color(247, 221, 0));
		line5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line5.setBounds (100, 290, 800, 20);
		helpPane.add(line5);
		
		// -------- line6 ---------------
		line6 = new JLabel ("To move or attack, left-click on the top right button to shift to move or attack mode, then");
		line6.setForeground(new Color(247, 221, 0));
		line6.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line6.setBounds (100, 350, 800, 20);
		helpPane.add(line6);
		
		// -------- line7 ---------------
		line7 = new JLabel ("right-click on a tile within your movement or attack range.");
		line7.setForeground(new Color(247, 221, 0));
		line7.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line7.setBounds (100, 380, 800, 20);
		helpPane.add(line7);
		
		// -------- line8 ---------------
		line8 = new JLabel ("If you fail a class you will lose coins. If you're broke you will be locked out.");
		line8.setForeground(new Color(247, 221, 0));
		line8.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line8.setBounds (100, 440, 800, 20);
		helpPane.add(line8);
		
		// -------- line9 ---------------
		line9 = new JLabel ("Out of battle, you can view your stats, switch your weapon, and use items from your backpack.");
		line9.setForeground(new Color(247, 221, 0));
		line9.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line9.setBounds (100, 500, 800, 20);
		helpPane.add(line9);
		
		// -------- line9 ---------------
		line10 = new JLabel ("Good luck. And don't die.");
		line10.setForeground(new Color(247, 221, 0));
		line10.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		line10.setBounds (100, 530, 800, 20);
		helpPane.add(line10);
		

		
		// ------- btn_Back -------
		btn_Back = new JButton("Back");
		btn_Back.setBounds(392, 580, 190, 80);
		btn_Back.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Back.setBackground(new Color(14, 1, 141));
		btn_Back.setForeground(new Color(247, 221, 0));
		btn_Back.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{

				GUIExtension1.switchPane(MainMenu.getPane());
				playSound(Database.getSelectTone1());
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				playSound(Database.getHoverSound1());
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});

		helpPane.add(btn_Back);
		
		
		helpPane.add(background);

		
	} // initGUI method

	

	public static JPanel getPane() { return helpPane; } // getPane method
	
	
	
	public static void playSound (File file)
	{
		try {
			Database.playSound(file);
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} // try-catch
	} // playSound method


} // Help class