package src.gui;

// Mina
// updated 05-09
// PM3: Carson: Evaluated 5/9/2019, 10/10. AWESOME!! :D
// may 19th re Coloured. Carson

// Mina 05-20 back button should've been going to navigation
// Mina 05-23 shifted GUI to fill frame
// Mina 05-24 replaced shop button with jlabel with walmart image

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import src.Database;
import src.MatchExtension;


public class Map
{
	static protected JPanel mapPane;
	static protected JButton btn_Level1;
	static protected JButton btn_Level2;
	static protected JButton btn_Level3;
	static protected JButton btn_Level4;
	static protected JButton btn_Level5;
	static protected JButton btn_Level6;
	static protected JButton btn_Level7;
	static protected JLabel lbl_Shop;
	static protected JButton btn_Back;

	

	public static void initGUI ()
	{
		JPanel background = new JPanel() 
		{
			public void paint(Graphics g) 
			{
				g.drawImage(Database.MapBackground, -150, 0, 1220, 800, null);
			}
		};
		background.setBounds(0, 0, 1000, 800);
		background.setVisible(true);
		// ------- map panel --------
		mapPane = new JPanel ();
		mapPane.setBackground(Database.ALT_MAYFIELD_BLUE); 
		mapPane.setLayout(null);



		// ------- btn_Level1 -------
		btn_Level1 = new JButton("kitchen");
		btn_Level1.setBounds(162, 239, 130, 130);
		btn_Level1.setForeground(Database.MAYFIELD_YELLOW);
		btn_Level1.setBackground(Database.MAYFIELD_BLUE);
		btn_Level1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));


		btn_Level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				playSound(Database.getSelectTone1());	
				MatchExtension.runMatch(1);
			}
		});

		mapPane.add(btn_Level1);


		
		// ------- btn_Level2 -------
		btn_Level2 = new JButton("Level 2");
		btn_Level2.setBounds(334, 239, 130, 130);

		btn_Level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//playSound(Database.getSelectTone1());	
				//MatchExtension.runMatch(2);
			}
		});

		mapPane.add(btn_Level2);


		
		// ------- btn_Level3 -------
		btn_Level3 = new JButton("Level 3");
		btn_Level3.setBounds(508, 239, 130, 130);

		btn_Level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//playSound(Database.getSelectTone1());	
				//MatchExtension.runMatch(3);
			}
		});

		mapPane.add(btn_Level3);

		
		
		// ------- btn_Level4 -------

		btn_Level4 = new JButton("Level 4");
		btn_Level4.setBounds(680, 239, 130, 130);

		btn_Level4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//playSound(Database.getSelectTone1());	
				//MatchExtension.runMatch(4);
			}
		});

		mapPane.add(btn_Level4);

		

		// ------- btn_Level5 -------

		btn_Level5 = new JButton("Level 5");
		btn_Level5.setBounds(162, 417, 130, 130);

		btn_Level5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//playSound(Database.getSelectTone1());	
				//MatchExtension.runMatch(5);
			}
		});

		mapPane.add(btn_Level5);


		
		// ------- btn_Level6 -------
		btn_Level6 = new JButton("Level 6");
		btn_Level6.setBounds(334, 417, 130, 130);

		btn_Level6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//playSound(Database.getSelectTone1());	
				//MatchExtension.runMatch(6);
			}
		});

		mapPane.add(btn_Level6);

		

		// ------- btn_Level7 -------
		btn_Level7 = new JButton("Level 7");
		btn_Level7.setBounds(508, 417, 130, 130);

		btn_Level7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//playSound(Database.getSelectTone1());	
				//MatchExtension.runMatch(7);
			}
		});

		mapPane.add(btn_Level7);

		
		
		// ------- lbl_Shop -------
		lbl_Shop = new JLabel("");
		lbl_Shop.setIcon(new ImageIcon(Database.getImgWalmart()));
		lbl_Shop.setBounds(680, 417, 130, 130);

		lbl_Shop.addMouseListener(new MouseListener() {
			
			public void mouseClicked(MouseEvent arg0) {
				
				GUIExtension1.switchToShop(Shop.getTabbedPane());
				playSound(Database.getFootsteps());
			}

			// these have to be here for the code to work though they do nothing; too lazy to research more for now but please don't remove
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}

		});

		mapPane.add(lbl_Shop);



		// ------- btn_Back -------
		btn_Back = new JButton("back");
		btn_Back.setBounds(425, 620, 130, 50);
		btn_Back.setForeground(Database.MAYFIELD_YELLOW);
		btn_Back.setBackground(Database.MAYFIELD_BLUE);
		btn_Back.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));

		btn_Back.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{

				GUIExtension1.switchPane(Navigation.getPane());
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

		mapPane.add(btn_Back);
		mapPane.add(background);
	} // initGUI method

	
	public static JPanel getPane () {return mapPane;} // getPane method
		
	
	
	public static void updateMap (int level)
	{
		
		if (level == 0)
		{
			btn_Level1.setEnabled(false);
			btn_Level2.setEnabled(false);
			btn_Level3.setEnabled(false);
			btn_Level4.setEnabled(false);
			btn_Level5.setEnabled(false);
			btn_Level6.setEnabled(false);
			btn_Level7.setEnabled(false);	
		}
		
		else if (level == 1)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(false);
			btn_Level3.setEnabled(false);
			btn_Level4.setEnabled(false);
			btn_Level5.setEnabled(false);
			btn_Level6.setEnabled(false);
			btn_Level7.setEnabled(false);	
		}
		else if (level == 2)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(true);
			btn_Level3.setEnabled(false);
			btn_Level4.setEnabled(false);
			btn_Level5.setEnabled(false);
			btn_Level6.setEnabled(false);
			btn_Level7.setEnabled(false);	
		}
		else if (level == 3)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(true);
			btn_Level3.setEnabled(true);
			btn_Level4.setEnabled(false);
			btn_Level5.setEnabled(false);
			btn_Level6.setEnabled(false);
			btn_Level7.setEnabled(false);	
		}
		else if (level == 4)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(true);
			btn_Level3.setEnabled(true);
			btn_Level4.setEnabled(true);
			btn_Level5.setEnabled(false);
			btn_Level6.setEnabled(false);
			btn_Level7.setEnabled(false);	
		}
		else if (level == 5)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(true);
			btn_Level3.setEnabled(true);
			btn_Level4.setEnabled(true);
			btn_Level5.setEnabled(true);
			btn_Level6.setEnabled(false);
			btn_Level7.setEnabled(false);
		}
		else if (level == 6)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(true);
			btn_Level3.setEnabled(true);
			btn_Level4.setEnabled(true);
			btn_Level5.setEnabled(true);
			btn_Level6.setEnabled(true);
			btn_Level7.setEnabled(false);
		}
		else if (level == 7)
		{
			btn_Level1.setEnabled(true);
			btn_Level2.setEnabled(true);
			btn_Level3.setEnabled(true);
			btn_Level4.setEnabled(true);
			btn_Level5.setEnabled(true);
			btn_Level6.setEnabled(true);
			btn_Level7.setEnabled(true);
		}
		else
		{
			System.out.println("level error");
		}
		
	} // updateMap method
	
	
	
	public static void playSound (File file)
	{
		try {
			Database.playSound(file);
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} // try-catch
	} // playSound method
	

} // Map class