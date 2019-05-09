// initially completed 05-08 by Matthew
// edited 05-09 by Mina


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Navigation{

	static protected JPanel NavigationPanel;
	 

	public static void initGUI() {
		NavigationPanel = new JPanel();
		NavigationPanel.setBackground(Color.BLACK);
		NavigationPanel.setLayout(null);
		
		JButton Save = new JButton("Save");
		Save.setBackground(new Color(0, 0, 204));
		Save.setForeground(Color.WHITE);
		Save.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		Save.setBounds(250, 350, 300, 100);
		NavigationPanel.add(Save);
		
		JButton Backpack = new JButton("Backpack");
		Backpack.setForeground(Color.WHITE);
		Backpack.setBackground(new Color(0, 0, 204));
		Backpack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		Backpack.setBounds(250, 500, 300, 100);
		NavigationPanel.add(Backpack);
		
		JButton Map = new JButton("Map");
		Map.setForeground(Color.WHITE);
		Map.setBackground(new Color(0, 0, 204));
		Map.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		Map.setBounds(250, 200, 300, 100);
		NavigationPanel.add(Map);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.setBackground(new Color(0, 0, 204));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(600, 750, 200, 50);
		NavigationPanel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Navigation");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 10, 350, 100);
		NavigationPanel.add(lblNewLabel);

	} // initGUI method
	
	public static JPanel getPane() {return NavigationPanel; } //getPane method
	

} // Navigation class