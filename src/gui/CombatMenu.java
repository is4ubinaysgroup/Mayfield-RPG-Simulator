package src.gui;

/* Zac 5/27/19
 * added button color and font
 */

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import Human.java;

public class CombatMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public CombatMenu() {
		
		
		setBackground(Color.GRAY);
		setLayout(null);
		
		// ------- CombatPanel -------
		JPanel CombatPanel = new JPanel();
		CombatPanel.setBounds(800, 0, 200, 800);
		CombatPanel.setBackground(Color.LIGHT_GRAY);
		CombatPanel.setLayout(null);
		
		add(CombatPanel);
		
		
		// labels
		
		JLabel lblNewLabel = new JLabel("COMBAT MENU");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 13, 135, 29);
		CombatPanel.add(lblNewLabel);
		
		
		// health
		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblHealth.setBounds(12, 80, 56, 16);
		CombatPanel.add(lblHealth);
		
		JLabel lblHealthInt = new JLabel("");
		lblHealthInt.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblHealthInt.setBounds(99, 80, 56, 16);
		CombatPanel.add(lblHealthInt);
		
		
		// defense
		JLabel lblDefense = new JLabel("DEFENSE");
		lblDefense.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblDefense.setBounds(12, 118, 66, 16);
		CombatPanel.add(lblDefense);
		
		JLabel lblDefenseInt = new JLabel("");
		lblDefenseInt.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblDefenseInt.setBounds(90, 118, 56, 16);
		CombatPanel.add(lblDefenseInt);
		
		
		// movement
		JLabel lblMovement = new JLabel("MOVEMENT");
		lblMovement.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblMovement.setBounds(12, 163, 80, 16);
		CombatPanel.add(lblMovement);
		
		JLabel lblMovementInt = new JLabel("");
		lblMovementInt.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblMovementInt.setBounds(112, 163, 56, 16);
		CombatPanel.add(lblMovementInt);
		
		
		
		// ------- btnAttack -------
		JButton btnAttack = new JButton("ATTACK");
		btnAttack.setBounds(33, 271, 122, 46);
		btnAttack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btnAttack.setForeground(new Color(247, 221, 0));
		btnAttack.setBackground(new Color(14, 1, 141));
		CombatPanel.add(btnAttack);
		
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- Attack Methods --------------------------
			}
		});
		
		
		
		// ------- btnBackpack -------
		JButton btnBackpack = new JButton("BACKPACK");
		btnBackpack.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btnBackpack.setForeground(new Color(247, 221, 0));
		btnBackpack.setBackground(new Color(14, 1, 141));
		btnBackpack.setBounds(33, 464, 122, 46);
		CombatPanel.add(btnBackpack);
		
		btnBackpack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- go to Backpack Panel ---------------------
			
				//GUIExtension1.switchPane(Backpack.getPane());
			
			}
		});
		
		

		JButton btnMove = new JButton("MOVE");
		btnMove.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 17));
		btnMove.setForeground(new Color(247, 221, 0));
		btnMove.setBackground(new Color(14, 1, 141));
		btnMove.setBounds(33, 369, 122, 46);
		CombatPanel.add(btnMove);
		
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- Move Methods -----------------------------
				//moveTo(Point point);
			}
		});
		
		
	} // CombatMenu constructor
	
	
	
	public static void AttackMethod() {
		//Select Enemy and check if in range.
		
		
		
	} // AttackMethod method
	
	
	
} // CombatMenu class