package src.gui;

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
		
		JPanel CombatPanel = new JPanel();
		CombatPanel.setBounds(800, 0, 200, 800);
		CombatPanel.setBackground(Color.LIGHT_GRAY);
		add(CombatPanel);
		CombatPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMBAT MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 13, 135, 29);
		CombatPanel.add(lblNewLabel);
		
		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHealth.setBounds(12, 80, 56, 16);
		CombatPanel.add(lblHealth);
		
		JLabel lblDefence = new JLabel("DEFENCE");
		lblDefence.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDefence.setBounds(12, 118, 66, 16);
		CombatPanel.add(lblDefence);
		
		JLabel lblMovement = new JLabel("MOVEMENT");
		lblMovement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMovement.setBounds(12, 163, 80, 16);
		CombatPanel.add(lblMovement);
		
		JButton btnAttack = new JButton("ATTACK");
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- Attack Methods --------------------------
			}
		});
		btnAttack.setBounds(33, 271, 122, 46);
		CombatPanel.add(btnAttack);
		
		JButton btnMove = new JButton("MOVE");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- Move Methods -----------------------------
				//moveTo(Point point);
			}
		});
		btnMove.setBounds(33, 369, 122, 46);
		CombatPanel.add(btnMove);
		
		JButton btnBackpack = new JButton("BACKPACK");
		btnBackpack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//-------------------------- Opens Backpack Panel ---------------------
			}
		});
		btnBackpack.setBounds(33, 464, 122, 46);
		CombatPanel.add(btnBackpack);
		
		JButton btnPause = new JButton("PAUSE");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {// ---------------------- Opens Pause Panel -------------------------
			}
		});
		btnPause.setBounds(33, 552, 122, 46);
		CombatPanel.add(btnPause);
		
		JLabel lblHealthInt = new JLabel("");
		lblHealthInt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHealthInt.setBounds(99, 80, 56, 16);
		CombatPanel.add(lblHealthInt);
		
		JLabel lblDefenceInt = new JLabel("");
		lblDefenceInt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDefenceInt.setBounds(90, 118, 56, 16);
		CombatPanel.add(lblDefenceInt);
		
		JLabel lblMovementInt = new JLabel("");
		lblMovementInt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMovementInt.setBounds(112, 163, 56, 16);
		CombatPanel.add(lblMovementInt);

	}
	public static void AttackMethod() {
		//Select Enemy and check if in range.
		
		
		
	}
}
