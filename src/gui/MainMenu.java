package src.gui;

// --------- Binay Rana -------------
// --------- 26/04/2019 -------------
// PM3, Carson: Evaluation: 10/10 AWESOME!!

/* 
updated 05-09 by Mina
still needs Database save file configuration methods; tutorial will start at the click of new game or
continue if the player's level is 0 instead of switching to navigation
*/

// 05-17 updated by Mina

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import src.Database;

public class MainMenu
{
	static protected JPanel mainMenuPane;
	static protected JLabel lbl_Title;
	static protected JButton btn_NewGame;
	static protected JButton btn_Continue;
	static protected JButton btn_Help;
	static protected JButton btn_Quit;
	
	public static void initGUI()
	{

		// ------- mainMenuPane -------
		mainMenuPane = new JPanel ();
		mainMenuPane.setBackground(new Color(52, 52, 104));
		mainMenuPane.setLayout(null);

		
		// ------- lbl_Title -------
		lbl_Title = new JLabel("MayField RPG Simulator");
		lbl_Title.setForeground(new Color(247, 221, 0));
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		lbl_Title.setBounds(0, 167, 784, 64);
		mainMenuPane.add(lbl_Title);

        
		// ------- btn_NewGame -------
		btn_NewGame = new JButton("New Game");
		btn_NewGame.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_NewGame.setForeground(new Color(247, 221, 0));
		btn_NewGame.setBackground(new Color(14, 1, 141));
		btn_NewGame.setBounds(319, 254, 145, 55);
		mainMenuPane.add(btn_NewGame);
		
		btn_NewGame.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				//Database.updateFile(); // writes starter file
				//Database.read();
				
				//Database.writeStarterSingle();
				//Database.loadSingle();
				
				Map.updateMap(MainExecutable.getPlayer().getLevel());
				Backpack.update();
				Shop.updateCoinsLabels();
				
				GUIExtension1.switchPane (Navigation.getPane());
			}
		});

		
		// ------- btn_Continue -------
		btn_Continue = new JButton ("Continue");
		btn_Continue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Continue.setForeground(new Color(247, 221, 0));
		btn_Continue.setBackground(new Color(14, 1, 141));
		btn_Continue.setBounds(319, 320, 145, 55);
		mainMenuPane.add(btn_Continue);
		
		btn_Continue.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				Database.loadSingle();
				
				Map.updateMap(MainExecutable.getPlayer().getLevel());
				Backpack.update();
				Shop.updateCoinsLabels();
				
				GUIExtension1.switchPane (Navigation.getPane());
			}
		});

	
		// -------- btn_Quit -----------
		btn_Quit = new JButton ("Quit");
		btn_Quit.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Quit.setBackground(new Color(14, 1, 141));
		btn_Quit.setForeground(new Color(247, 221, 0));
		btn_Quit.setBounds(319, 452, 145, 55);
		mainMenuPane.add(btn_Quit);
        
		btn_Quit.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				System.exit (0);
			}
		});

		// -------- btn_Help -----------
		btn_Help = new JButton ("Help");
		btn_Help.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Help.setBackground(new Color(14, 1, 141));
		btn_Help.setForeground(new Color(247, 221, 0));
		btn_Help.setBounds(319, 386, 145, 55);
		mainMenuPane.add(btn_Help);
		
		btn_Help.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				GUIExtension1.switchPane(Help.getPane());
			}
		});
	} // initGUI method
	public static JPanel getPane() {return mainMenuPane; } //getPane method
} // MainMenu class
