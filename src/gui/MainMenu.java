// --------- Binay Rana -------------
// --------- 26/04/2019 -------------
// PM3, Carson: Evaluation: 10/10 AWESOME!!
// updated 05-09 by Mina

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
		mainMenuPane.setBackground(new Color(0, 0, 0));
		mainMenuPane.setLayout(null);

		
		// ------- lbl_Title -------
		lbl_Title = new JLabel("MayField RPG Simulator");
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		lbl_Title.setBounds(0, 167, 784, 64);
		mainMenuPane.add(lbl_Title);

        
		// ------- btn_NewGame -------
		btn_NewGame = new JButton("New Game");
		btn_NewGame.setForeground(Color.WHITE);
		btn_NewGame.setBackground(new Color(0, 0, 204));
		btn_NewGame.setBounds(319, 254, 145, 55);
		mainMenuPane.add(btn_NewGame);
		
		btn_NewGame.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				//Database.updateFile(); // writes starter file
				//Database.read();
				GUIExtension1.switchPane (Navigation.getPane());
			}
		});

		
		// ------- btn_Continue -------
		btn_Continue = new JButton ("Continue");
		btn_Continue.setForeground(Color.WHITE);
		btn_Continue.setBackground(new Color(0, 0, 204));
		btn_Continue.setBounds(319, 320, 145, 55);
		mainMenuPane.add(btn_Continue);
		
		btn_Continue.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				//Database.read();
				GUIExtension1.switchPane (Navigation.getPane());
			}
		});

	
		// -------- btn_Quit -----------
		btn_Quit = new JButton ("Quit");
		btn_Quit.setBackground(new Color(0, 0, 204));
		btn_Quit.setForeground(Color.WHITE);
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
		btn_Help.setBackground(new Color(0, 0, 204));
		btn_Help.setForeground(Color.WHITE);
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
