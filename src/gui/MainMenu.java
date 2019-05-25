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

// Mina 05-23 shifted GUI to fill frame

// Mina 05-24 new game or continue would only go to navigation if the user has completed the tutorial
// Mina 05-25 implemented mouse hover sound effect


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

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
	public static BufferedImage background;
	
	public static void initGUI()
	{

		// ------- mainMenuPane -------
		mainMenuPane = new JPanel ();
		mainMenuPane.setBackground(new Color(52, 52, 104));
		mainMenuPane.setLayout(null);
		
		JPanel background = new JPanel() 
		{
			public void paint(Graphics g) 
			{
				g.drawImage(Database.getMainMenuBackground(), 0, 0, 1314, 878, null);
			}
		};
		background.setBounds(0, 0, 1000, 800);
		background.setVisible(true);
		
		
		// ------- lbl_Title -------
		lbl_Title = new JLabel("MayField RPG Simulator");
		lbl_Title.setForeground(new Color(247, 221, 0));
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		lbl_Title.setBounds(100, 167, 784, 64);
		mainMenuPane.add(lbl_Title);

        
		// ------- btn_NewGame -------
		btn_NewGame = new JButton("New Game");
		btn_NewGame.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_NewGame.setForeground(new Color(247, 221, 0));
		btn_NewGame.setBackground(new Color(14, 1, 141));
		btn_NewGame.setBounds(419, 254, 145, 55);
		mainMenuPane.add(btn_NewGame);
		
		btn_NewGame.addMouseListener (new MouseListener()   
		{
			
			public void mouseClicked(MouseEvent arg0)
			{
				
				Backpack.removeAll();
				
				Database.writeStarterSingle();
				Database.loadSingle();
				
				Map.updateMap(MainExecutable.getPlayer().getLevel());
				Backpack.update();
				Shop.updateCoinsLabels();
				
				if (MainExecutable.getPlayer().getLevel() > 0)
				{
					GUIExtension1.switchPane (Navigation.getPane());
				} // if completed tutorial
				
			}

			public void mouseEntered(MouseEvent arg0)
			{
				try {
					Database.playSound("src/resources/rolloverSound.wav");
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					e1.printStackTrace();
				}
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			
		});

		
		// ------- btn_Continue -------
		btn_Continue = new JButton ("Continue");
		btn_Continue.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Continue.setForeground(new Color(247, 221, 0));
		btn_Continue.setBackground(new Color(14, 1, 141));
		btn_Continue.setBounds(419, 320, 145, 55);
		mainMenuPane.add(btn_Continue);
		
		btn_Continue.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				Database.loadSingle();
				
				Map.updateMap(MainExecutable.getPlayer().getLevel());
				Backpack.update();
				Shop.updateCoinsLabels();
				
				if (MainExecutable.getPlayer().getLevel() > 0)
				{
					GUIExtension1.switchPane (Navigation.getPane());
				} // if completed tutorial
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				try {
					Database.playSound("src/resources/rolloverSound.wav");
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					e1.printStackTrace();
				}
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			
		});

	
		// -------- btn_Quit -----------
		btn_Quit = new JButton ("Quit");
		btn_Quit.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Quit.setBackground(new Color(14, 1, 141));
		btn_Quit.setForeground(new Color(247, 221, 0));
		btn_Quit.setBounds(419, 452, 145, 55);
		mainMenuPane.add(btn_Quit);
        
		btn_Quit.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				System.exit (0);
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				try {
					Database.playSound("src/resources/rolloverSound.wav");
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					e1.printStackTrace();
				}
			}
			
			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			
		});

		// -------- btn_Help -----------
		btn_Help = new JButton ("Help");
		btn_Help.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btn_Help.setBackground(new Color(14, 1, 141));
		btn_Help.setForeground(new Color(247, 221, 0));
		btn_Help.setBounds(419, 386, 145, 55);
		mainMenuPane.add(btn_Help);
		
		btn_Help.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				GUIExtension1.switchPane(Help.getPane());
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				try {
					Database.playSound("src/resources/rolloverSound.wav");
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					e1.printStackTrace();
				}
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			
		});
		
		
		mainMenuPane.add(background);
		
	} // initGUI method
	
	
	
	public static JPanel getPane() {return mainMenuPane; } //getPane method
	
	
} // MainMenu class
