package src.gui;

// initially completed 05-08 by Matthew
// edited 05-09 by Mina
/* will be finalized when Database.save method is complete; possibly change to pop-up
in a blank room/"overworld" where the user clicks on their character sprite */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
		NavigationPane.setBackground(Color.BLACK);
		NavigationPane.setLayout(null);
		
		
		
		// ------- btn_Map -------
		btn_Map = new JButton("Map");
		btn_Map.setForeground(Color.WHITE);
		btn_Map.setBackground(new Color(0, 0, 204));
		btn_Map.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Map.setBounds(250, 100, 300, 100);
		NavigationPane.add(btn_Map);
		
		btn_Map.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				GUIExtension1.switchPane(Map.getPane());
			}
		});
		
		
		
		// ------- btn_Backpack -------
		btn_Backpack = new JButton("Backpack");
		btn_Backpack.setForeground(Color.WHITE);
		btn_Backpack.setBackground(new Color(0, 0, 204));
		btn_Backpack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Backpack.setBounds(250, 400, 300, 100);
		NavigationPane.add(btn_Backpack);
		
		btn_Backpack.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				GUIExtension1.switchPane(Backpack.getPane());
			}
		});
		
		
		
		// ------- btn_Save -------
		btn_Save = new JButton("Save");
		btn_Save.setBackground(new Color(0, 0, 204));
		btn_Save.setForeground(Color.WHITE);
		btn_Save.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Save.setBounds(250, 250, 300, 100);
		NavigationPane.add(btn_Save);
		
		btn_Save.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				//Database.save();
			}
		});
		
		
		
		// ------- btn_Return -------
		btn_Return = new JButton("Return");
		btn_Return.setBackground(new Color(0, 0, 204));
		btn_Return.setForeground(Color.WHITE);
		btn_Return.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		btn_Return.setBounds(250, 550, 300, 100);
		NavigationPane.add(btn_Return);
		
		btn_Return.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				GUIExtension1.switchPane(MainMenu.getPane());
			}
		});
		
	} // initGUI method
	
	
	
	public static JPanel getPane() {return NavigationPane; } //getPane method
	
	
} // Navigation class
