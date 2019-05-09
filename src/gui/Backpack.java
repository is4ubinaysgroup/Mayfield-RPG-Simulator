// initially completed 05-08 by Matthew


/*
@contributor Carson Fujita
Update on May 9th 2019
Missing UML methods and objects.
???
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Backpack extends JPanel {

	/**
	 * Create the panel.
	 */
	public Backpack() {
		setLayout(null);
		
		JLabel Coin = new JLabel("Coin:");
		Coin.setBounds(25, 50, 100, 15);
		add(Coin);
		
		JLabel Backpack = new JLabel("Backpack");
		Backpack.setHorizontalAlignment(SwingConstants.CENTER);
		Backpack.setBounds(300, 10, 200, 50);
		add(Backpack);
		
		JLabel Defense = new JLabel("Defense:");
		Defense.setBounds(25, 70, 100, 15);
		add(Defense);
		
		JLabel HealthCurrent = new JLabel("Health Current:");
		HealthCurrent.setBounds(25, 90, 100, 15);
		add(HealthCurrent);
		
		JLabel HealthMax = new JLabel("Health Max:");
		HealthMax.setBounds(25, 110, 100, 15);
		add(HealthMax);
		
		JLabel Movement = new JLabel("Movement:");
		Movement.setBounds(25, 130, 100, 15);
		add(Movement);
		
		JLabel WeaponAttack = new JLabel("Weapon Attack:");
		WeaponAttack.setBounds(25, 150, 100, 15);
		add(WeaponAttack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 420, 237, 69);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(130, 500, 237, 69);
		add(comboBox_1);
		
		JButton btnNewButton = new JButton("Equip");
		btnNewButton.setBounds(377, 419, 124, 71);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Use");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(377, 499, 124, 70);
		add(btnNewButton_1);

	}
	
} // Backpack class