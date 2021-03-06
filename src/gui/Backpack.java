package src.gui;

import java.awt.Color;

// initially uploaded 05-08 by Matthew to Code repository

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


/*
05-12 Mina
fixed execute spelling
previously equipped weapon would need to be put into storage when switching weapons
*/

/*
05-13 Mina
added comments to button engines for what would happen in-battle
added static methods that will remove and add strings to combobox
edited equip button engine to use the switchWeapon method of Player
*/

// Mina 05-20 added removeAll method for if the user clicks new game
/*
 * Carson may 21st
 * made the backpack equip and use tell player that it cannot use an item if there is none.
 * turned error label red for attention.
 */


// Mina 05-21 added comparison to "" for selectedItemName for comboboxes
// Mina 05-23 shifted GUI to accomodate frame size
// Mina 05-25 was using removeAll instead of removeAllItems

import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import src.*;
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
		lbl_coins.setBounds(255, 131, 181, 20);
		backpackPane.add(lbl_coins);
		
		// ------- lbl_defense -------
		lbl_defense = new JLabel ("Defense: ");
		lbl_defense.setBounds(523, 131, 212, 20);
		backpackPane.add(lbl_defense);
		
		// ------- lbl_health -------
		lbl_health = new JLabel ("Health: ");
		lbl_health.setBounds(255, 183, 162, 20);
		backpackPane.add(lbl_health);
		
		// ------- lbl_maxHealth -------
		lbl_maxHealth = new JLabel ("Max Health: ");
		lbl_maxHealth.setBounds(523, 183, 181, 20);
		backpackPane.add(lbl_maxHealth);
		
		// ------- lbl_damage -------
		lbl_damage = new JLabel ("Damage: ");
		lbl_damage.setBounds(255, 238, 162, 20);
		backpackPane.add(lbl_damage);
		
		// ------- lbl_criticalChance -------
		lbl_criticalChance = new JLabel ("Critical Chance: ");
		lbl_criticalChance.setBounds(523, 238, 224, 20);
		backpackPane.add(lbl_criticalChance);
		
		// ------- lbl_rangedDamage -------
		lbl_rangedDamage = new JLabel("Ranged Damage: ");
		lbl_rangedDamage.setBounds(255, 289, 181, 20);
		backpackPane.add(lbl_rangedDamage);
		
		// ------- lbl_movement -------
		lbl_movement = new JLabel("Movement: 3");
		lbl_movement.setBounds(523, 289, 124, 20);
		backpackPane.add(lbl_movement);
		
		// ------- lbl_error -------
		lbl_error = new JLabel ("");
		lbl_error.setForeground(Color.RED);//
		lbl_error.setBounds(367, 485, 294, 20);
		backpackPane.add(lbl_error);
		
		// ------- comboB_weapons ------- 
		comboB_weapons = new JComboBox<String>();
		comboB_weapons.setBounds(255, 337, 352, 26);
		backpackPane.add(comboB_weapons);
		
		// ------- comboB_products ------- 
		comboB_products = new JComboBox<String>();
		comboB_products.setBounds(255, 406, 352, 26);
		backpackPane.add(comboB_products);
		
		
		// ------- btn_Equip ------- 
		btn_Equip = new JButton("Equip");
		btn_Equip.setBounds(622, 336, 115, 29);
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
		btn_Use.setBounds(622, 405, 115, 29);
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
		btn_Back.setBounds(428, 572, 115, 29);
		backpackPane.add(btn_Back);
		
		btn_Back.addMouseListener (new MouseListener()   
		{
			public void mouseClicked(MouseEvent arg0)
			{
				lbl_error.setText(null);
				playSound(Database.getSelectTone1());
				
				if (MatchExtension.run == true)
				{
					GUIExtension1.switchPane(BattlePanel.getPanel());
				}
				else
				{
					GUIExtension1.switchPane (Navigation.getPane());
				} // else out of battle
			}
			
			public void mouseEntered(MouseEvent arg0)
			{
				playSound(Database.getHoverSound1());
			}

			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
		
	} // initGUI method
	
	
	
	public static JPanel getPane() { return backpackPane; } // getPane method
	
	

	public static void btn_EquipEngine()
	{
		if(null != comboB_weapons.getSelectedItem()) 
		{
			lbl_error.setText(null);
			String weaponName = (String) comboB_weapons.getSelectedItem();
			Weapon weapon = Database.getWeapon (weaponName);

			MainExecutable.getPlayer().switchWeapon (weapon);
			playSound(Database.getLockerSound());

			if (MatchExtension.run == true)
			{

				GUIExtension1.switchPane(BattlePanel.getPanel());
				
				BattlePanel.getRoom().skipTurn();
				
			} // go back if a battle is happening

		}
		else
		{
			lbl_error.setText("Cannot equip nothing");
			playSound(Database.getErrorTone());
		}
		update();
	} // btn_EquipEngine method
	
	
	
	public static void btn_UseEngine()
	{
		boolean used = false;
		if(null != comboB_products.getSelectedItem())
		{
			lbl_error.setText(null);
			String productName = (String) comboB_products.getSelectedItem();
			Product product = Database.getProduct(productName);//fixed by carson

			used = Product.use(product);
			if (used == false) {lbl_error.setText("using product error");}
			else
			{
				update();
				playSound(Database.getDreamyMallet());
				
				if (MatchExtension.run == true)
				{

					GUIExtension1.switchPane(BattlePanel.getPanel());
					
					BattlePanel.getRoom().skipTurn();
					
				} // go back if a battle is happening
			} // else
		}
		else
		{
			lbl_error.setText("Cannot use nothing");
			playSound(Database.getErrorTone());
		}
		
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
	
	
	
	public static void removeProduct (String productName)
	{
		comboB_products.removeItem (productName);
	} // removeProduct method
	
	public static void addProduct (String productName)
	{
		comboB_products.addItem (productName);
	} // addProduct method
	
	public static void removeWeapon (String weaponName)
	{
		comboB_weapons.removeItem (weaponName);
	} // removeProduct method
	
	public static void addWeapon (String weaponName)
	{
		comboB_weapons.addItem (weaponName);
	} // addProduct method
	
	public static void removeAll()
	{
		comboB_products.removeAllItems();
		comboB_weapons.removeAllItems();
	} // removeAll method
	
	
	
	public static void playSound (File file)
	{
		try {
			Database.playSound(file);
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		} // try-catch
	} // playSound method
	
	
} // Backpack class