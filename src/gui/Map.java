package src.gui;

// Mina
// updated 05-09
// PM3: Carson: Evaluated 5/9/2019, 10/10. AWESOME!! :D
// may 19th re Coloured. Carson
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import src.Database;

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
	static protected JButton btn_Shop;
	static protected JButton btn_Back;

	

	public static void initGUI ()
	{
		// ------- map panel --------
		mapPane = new JPanel ();
		mapPane.setBackground(Database.ALT_MAYFIELD_BLUE);
		mapPane.setLayout(null);



		// ------- btn_Level1 -------
		btn_Level1 = new JButton("kitchen");
		btn_Level1.setBounds(62, 239, 130, 130);
		btn_Level1.setForeground(Database.MAYFIELD_YELLOW);
		btn_Level1.setBackground(Database.MAYFIELD_BLUE);
		btn_Level1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));


		btn_Level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn_Level1Engine();
			}
		});

		mapPane.add(btn_Level1);


		
		// ------- btn_Level2 -------
		btn_Level2 = new JButton("Level 2");
		btn_Level2.setBounds(234, 239, 130, 130);

		btn_Level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mapPane.add(btn_Level2);


		
		// ------- btn_Level3 -------
		btn_Level3 = new JButton("Level 3");
		btn_Level3.setBounds(408, 239, 130, 130);

		btn_Level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mapPane.add(btn_Level3);

		
		
		// ------- btn_Level4 -------

		btn_Level4 = new JButton("Level 4");
		btn_Level4.setBounds(580, 239, 130, 130);

		btn_Level4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mapPane.add(btn_Level4);

		

		// ------- btn_Level5 -------

		btn_Level5 = new JButton("Level 5");
		btn_Level5.setBounds(62, 417, 130, 130);

		btn_Level5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mapPane.add(btn_Level5);


		
		// ------- btn_Level6 -------
		btn_Level6 = new JButton("Level 6");
		btn_Level6.setBounds(234, 417, 130, 130);

		btn_Level6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mapPane.add(btn_Level6);

		

		// ------- btn_Level7 -------
		btn_Level7 = new JButton("Level 7");
		btn_Level7.setBounds(408, 417, 130, 130);

		btn_Level7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mapPane.add(btn_Level7);


		
		// ------- btn_Shop -------
		btn_Shop = new JButton("Shop");
		btn_Shop.setBounds(580, 417, 130, 130);
		btn_Shop.setForeground(Database.MAYFIELD_YELLOW);
		btn_Shop.setBackground(Database.MAYFIELD_BLUE);
		btn_Shop.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));

		btn_Shop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GUIExtension1.switchToShop(Shop.getTabbedPane());
			}
		});

		mapPane.add(btn_Shop);



		// ------- btn_Back -------
		btn_Back = new JButton("back");
		btn_Back.setBounds(325, 620, 130, 50);
		btn_Back.setForeground(Database.MAYFIELD_YELLOW);
		btn_Back.setBackground(Database.MAYFIELD_BLUE);
		btn_Back.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));

		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GUIExtension1.switchPane(MainMenu.getPane());
			}
		});

		mapPane.add(btn_Back);

	} // initGUI method

	
	public static JPanel getPane () {return mapPane;} // getPane method
	
	
	
	public static void btn_Level1Engine ()
	{
		// start the battle with boss 1
		// switch to the battle panel
		
	} // btn_Level1Engine method
		
	
	
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
	
	
} // Map class
