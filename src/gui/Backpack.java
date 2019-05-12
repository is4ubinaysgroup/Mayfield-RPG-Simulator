package src.gui;

// initially completed 05-08 by Matthew

/* 
   edited 05-09 by Mina
   - still needs save configuration done for loading the player object (also
     not sure where the player object will be instantiated) and more on how
     product and weapons will work and will be stored
*/


/*
@contributor Carson Fujita
Update on May 9th 2019
Missing UML methods and objects.
???
*/
/*
bug fixing @Carson Fujita
Date: 
May 12th, 2019
removed rawtypes from JComboBox
bugs fixed
*/


// 05-12 fixed execute spelling - Mina


import java.awt.event.*;
import javax.swing.*;
import src.*;
import src.character.Player;
import src.items.Product;
import src.items.Weapon;


public class Backpack
{
	static protected JPanel backpackPane;
	static protected JLabel lbl_coins;
	static protected JLabel lbl_defense;
	static protected JLabel lbl_health;
	static protected JLabel lbl_maxHealth;
	static protected JLabel lbl_damage;
	static protected JLabel lbl_rangedDamage;
	static protected JLabel lbl_criticalChance;
	static protected JLabel lbl_movement;
	static protected JLabel lbl_error;
	static protected JComboBox<String> comboB_weapons;
	static protected JComboBox<String> comboB_products;
	static protected JButton btn_Equip;
	static protected JButton btn_Use;
	static protected JButton btn_Back;
	
	
	public static void initGUI()
	{
	
		// ------- mainMenuPane -------
		backpackPane = new JPanel ();
		backpackPane.setLayout(null);
		
		// ------- lbl_coins -------
		lbl_coins = new JLabel ("Coins: ");
		lbl_coins.setBounds(155, 131, 181, 20);
		backpackPane.add(lbl_coins);
		
		// ------- lbl_defense -------
		lbl_defense = new JLabel ("Defense: ");
		lbl_defense.setBounds(423, 131, 212, 20);
		backpackPane.add(lbl_defense);
		
		// ------- lbl_health -------
		lbl_health = new JLabel ("Health: ");
		lbl_health.setBounds(155, 183, 162, 20);
		backpackPane.add(lbl_health);
		
		// ------- lbl_maxHealth -------
		lbl_maxHealth = new JLabel ("Max Health: ");
		lbl_maxHealth.setBounds(423, 183, 181, 20);
		backpackPane.add(lbl_maxHealth);
		
		// ------- lbl_damage -------
		lbl_damage = new JLabel ("Damage: ");
		lbl_damage.setBounds(155, 238, 162, 20);
		backpackPane.add(lbl_damage);
		
		// ------- lbl_criticalChance -------
		lbl_criticalChance = new JLabel ("Critical Chance: ");
		lbl_criticalChance.setBounds(423, 238, 224, 20);
		backpackPane.add(lbl_criticalChance);
		
		// ------- lbl_rangedDamage -------
		lbl_rangedDamage = new JLabel("Ranged Damage: ");
		lbl_rangedDamage.setBounds(155, 289, 181, 20);
		backpackPane.add(lbl_rangedDamage);
		
		// ------- lbl_movement -------
		lbl_movement = new JLabel("Movement: 3");
		lbl_movement.setBounds(423, 289, 124, 20);
		backpackPane.add(lbl_movement);
		
		// ------- lbl_error -------
		lbl_error = new JLabel ("");
		lbl_error.setBounds(267, 485, 294, 20);
		backpackPane.add(lbl_error);
		
		// ------- comboB_weapons ------- 
		comboB_weapons = new JComboBox<String>();
		comboB_weapons.setBounds(155, 337, 352, 26);
		backpackPane.add(comboB_weapons);
		
		// ------- comboB_products ------- 
		comboB_products = new JComboBox<String>();
		comboB_products.setBounds(155, 406, 352, 26);
		backpackPane.add(comboB_products);
		
		
		// ------- btn_Equip ------- 
		btn_Equip = new JButton("Equip");
		btn_Equip.setBounds(522, 336, 115, 29);
		backpackPane.add(btn_Equip);
		
		btn_Equip.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				btn_EquipEngine();
			}
		});
		
		
		// ------- btn_Use ------- 
		btn_Use = new JButton("Use");
		btn_Use.setBounds(522, 405, 115, 29);
		backpackPane.add(btn_Use);
		
		btn_Use.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				btn_UseEngine();
			}
		});
				
		
		// ------- btn_Back ------- 
		btn_Back = new JButton("Back");
		btn_Back.setBounds(328, 572, 115, 29);
		backpackPane.add(btn_Back);
		
		btn_Back.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				lbl_error.setText(null);
				GUIExtension1.switchPane (Navigation.getPane());
			}
		});
		
	} // initGUI method
	
	
	
	public static JPanel getPane() { return backpackPane; } // getPane method
	
	

	public static void btn_EquipEngine()
	{
		lbl_error.setText(null);
		String weaponName = (String) comboB_weapons.getSelectedItem();
		
		//WIP
		Weapon weapon = Database.getWeapon (weaponName);
		MainExecutable.getPlayer().equipWeapon (weapon); // switches the weapon; previously equipped gets put back into storage
		
		update();
	} // btn_EquipEngine method
	
	
	
	public static void btn_UseEngine()
	{
		lbl_error.setText(null);
		String productName = (String) comboB_products.getSelectedItem();
		Product product = Database.getProduct(productName);//fixed by carson
		Product.use(product);
		
		update();
	} // btn_UseEngine method
	
	
	
	public static void update()
	{		
		lbl_coins.setText("Coins: " + MainExecutable.getPlayer().getCoins());
		lbl_defense.setText("Defense: " + MainExecutable.getPlayer().getDefense());
		lbl_health.setText("Health: " + MainExecutable.getPlayer().getHealth());
		lbl_maxHealth.setText("Max Health : " + MainExecutable.getPlayer().getMaxHealth());
		
		Weapon equippedWeapon = MainExecutable.getPlayer().getEquippedWeapon();
			
		lbl_damage.setText("Damage: " + Integer.toString(equippedWeapon.getDamage()));
		lbl_rangedDamage.setText("Ranged Damage: " + Integer.toString(equippedWeapon.getRangedDamage() ));
		lbl_criticalChance.setText("Critical Chance: " + Double.toString(equippedWeapon.getCriticalChance()));

	} // update method
	
} // Backpack class
