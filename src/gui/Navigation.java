package src.gui;
import src.Database;

// initially completed 05-08 by Matthew
// edited 05-09 by Mina
/* will be finalized when Database.save method is complete; possibly change to pop-up
in a blank room/"overworld" where the user clicks on their character sprite */
//may 19th carson: recoloured

// Mina 05-10 added Backpack.update() to backpack button listener
// Mina 05-20 added Database.writeSingle();
// Mina 05-23 shifted GUI to fill frame
// Mina 05-25 sound effects

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Navigation
{

	static protected JPanel NavigationPane;
	static protected JButton btn_Map;
	static protected JButton btn_Backpack;
	static protected JButton btn_Save;
	static protected JButton btn_Return;
	

	public static void initGUI()
	{
		
		// ------- navigationPane -------
		NavigationPane = new JPanel();
		NavigationPane.setBackground(Database.ALT_MAYFIELD_BLUE);
		NavigationPane.setLayout(null);
				
				
				
		// ------- local background -------
		JPanel background = new JPanel() 
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = 8668472623396553721L;

			public void paint(Graphics g) 
			{
				g.drawImage(Database.getMainMenuBackground(), 0, 0, 1314, 878, null);
			}
		};
		background.setBounds(0, 0, 1000, 800);
		background.setVisible(true);
		
		
		
		// ------- btn_Map -------
		btn_Map = new JButton("Map");
		btn_Map.setForeground(Database.ALT_MAYFIELD_YELLOW);
		btn_Map.setBackground(Database.MAYFIELD_BLUE);
		btn_Map.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Map.setBounds(350, 100, 300, 100);
		NavigationPane.add(btn_Map);
		
		btn_Map.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				GUIExtension1.switchPane(Map.getPane());
				playSound(Database.getPageTurnSound());
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				playSound(Database.getHoverSound1());
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		
		
		
		// ------- btn_Backpack -------
		btn_Backpack = new JButton("Backpack");
		btn_Backpack.setForeground(Database.MAYFIELD_YELLOW);
		btn_Backpack.setBackground(Database.MAYFIELD_BLUE);
		btn_Backpack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Backpack.setBounds(350, 400, 300, 100);
		NavigationPane.add(btn_Backpack);
		
		btn_Backpack.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				GUIExtension1.switchPane(Backpack.getPane());
				Backpack.update();
				
				playSound(Database.getBackpackBtnSound());
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				playSound(Database.getHoverSound1());
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		
		
		
		// ------- btn_Save -------
		btn_Save = new JButton("Save");
		btn_Save.setBackground(Database.MAYFIELD_BLUE);
		btn_Save.setForeground(Database.MAYFIELD_YELLOW);
		btn_Save.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Save.setBounds(350, 250, 300, 100);
		NavigationPane.add(btn_Save);
		
		btn_Save.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				Database.writeSingle();
				playSound(Database.getMooSound());
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				playSound(Database.getHoverSound1());
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		
		
		
		// ------- btn_Return -------
		btn_Return = new JButton("Return");
		btn_Return.setBackground(Database.MAYFIELD_BLUE);
		btn_Return.setForeground(Database.MAYFIELD_YELLOW);
		btn_Return.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Return.setBounds(350, 550, 300, 100);
		NavigationPane.add(btn_Return);
		
		btn_Return.addMouseListener (new MouseListener()   
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

		
		
		// add the background
		NavigationPane.add(background);

	} // initGUI method
	
	
	
	public static JPanel getPane() {return NavigationPane; } //getPane method

	
	
	public static void playSound (File file)
	{
		try {
			Database.playSound(file);
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} // try-catch
	} // playSound method
	
	
} // Navigation class
