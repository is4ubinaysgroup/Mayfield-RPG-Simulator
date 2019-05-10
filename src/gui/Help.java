
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
@Author Binay
@Contributors: Binay, Mina, Carson
Help panels displays advice and tips for the user.
Version: 2
Updated 05/10/2019 By Mina and Matthew
*/

public class Help
{
	static protected JButton btn_Back;
	static protected JLabel lbl_Title;
	static protected JLabel lbl_Content;
	static protected JPanel helpPane;

	public static void initGUI()
	{
		// ------- helpPane -------
		helpPane = new JPanel ();
		helpPane.setLayout (null);

		
		// ------- label main help title -------
		lbl_Title = new JLabel("help instructions");
		lbl_Title.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		lbl_Title.setBounds(240, 51, 784, 64);
		helpPane.add(lbl_Title);
		
		// -------- lbl contents ---------------
		lbl_Content = new JLabel ("BLANK");
		lbl_Content.setBounds (85, 167, 56, 16);
		helpPane.add(lbl_Content);

		
		// ------- btn_Back -------
		btn_Back = new JButton("Back");
		btn_Back.setBounds(292, 624, 190, 80);

		btn_Back.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				btn_BackEngine();
			}
		});

		helpPane.add(btn_Back);

		
	} // initGUI method

	

	public static JPanel getPane() { return helpPane; } // getPane method

	

	public static void btn_BackEngine()
	{
		GUIExtension1.switchPane(MainMenu.getPane());

	}// btn_BackEngine method


} // Help class
