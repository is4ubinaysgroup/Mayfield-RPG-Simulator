package src.gui;

// 05-08 Matthew initially uploaded to Code repository
// 05-09 Mina updated

/*
Bug fixing @Carson Fujita
Date: 
May 12th, 2019
 */ 

/*
05-12 Mina
fixed execute spelling, removed duplicate coins labels on some tabs, edited listener engines
buying engines still need to be completed; will be done when item storage management is finalized
can't update weapon info labels yet without weapon constructor containing item inherited fields
*/

/*
may 15th
carson
changed combobox from rawtype to String
*/

/*
Bug fixing @Carson Fujita
Date: 
May 16th, 2019
 */ 

// 05-17 updated by Mina
/*
 * may 19th comboboxes are set to sStrings and not raw type. fixes to get images.
 */

/*
05-19 Mina
forgot to compare hasEnoughCoins to true
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import src.Database;
import src.items.Product;
import src.items.Weapon;


public class Shop
{

	static String selectedItemName = "Capacity Upgrade";
	
	final static String TAB1NAME = "Upgrades";
	final static String TAB2NAME = "Health Restore";
	final static String TAB3NAME = "Stat Boost";
	final static String TAB4NAME = "Weapons";

	static final String TAB1LIST [] = {"Capacity Upgrade", "Soda", "Orange Juice"};
	static final String TAB2LIST [] = {"Timbits", "McChicken", "Foot Long Sub!"};
	static final String TAB3LIST [] = {"Tylenol", "Coffee", "Cappucino", "Expresso"};
	static final String TAB4LIST [] = {"Ruler", "Rubber Band"};

	static protected JTabbedPane shopTabbedPane;
	
	// tab 1
	static protected JPanel tabPane1;
	static protected JLabel lbl_icon1;
	static protected JLabel lbl_coins1;
	static protected JLabel lbl_error1;
	static protected JLabel lbl_name1;
	static protected JLabel lbl_cost1;
	static protected JLabel lbl_description1;
	static protected JComboBox<String> comboB_tab1;
	static protected JButton btn_buy1;
	static protected JButton btn_leave1;
	
	// tab 2
	static protected JPanel tabPane2;
	static protected JLabel lbl_icon2;
	static protected JLabel lbl_coins2;
	static protected JLabel lbl_error2;
	static protected JLabel lbl_name2;
	static protected JLabel lbl_cost2;
	static protected JLabel lbl_description2;
	static protected JComboBox<String> comboB_tab2;
	static protected JButton btn_buy2;
	static protected JButton btn_leave2;
	
	// tab 3
	static protected JPanel tabPane3;
	static protected JLabel lbl_icon3;
	static protected JLabel lbl_coins3;
	static protected JLabel lbl_error3;
	static protected JLabel lbl_name3;
	static protected JLabel lbl_cost3;
	static protected JLabel lbl_description3;
	static protected JComboBox<String> comboB_tab3;
	static protected JButton btn_buy3;
	static protected JButton btn_leave3;
	
	// tab 4
	static protected JPanel tabPane4;
	static protected JLabel lbl_icon4;
	static protected JLabel lbl_coins4;
	static protected JLabel lbl_error4;
	static protected JLabel lbl_name4;
	static protected JLabel lbl_cost4;
	static protected JLabel lbl_description4;
	static protected JComboBox<String> comboB_tab4;
	static protected JButton btn_buy4;
	static protected JButton btn_leave4;
	
	

	
	public static void initGUI()
	{
		// ------------------------------------------- tabPane1 -------------------------------------------
		tabPane1 = new JPanel ();
		tabPane1.setLayout(null);
		
		lbl_error1 = new JLabel("");
		lbl_error1.setBounds(323, 535, 294, 20);
		tabPane1.add(lbl_error1);
		
		lbl_name1 = new JLabel("Name: ");
		lbl_name1.setBounds(145, 360, 254, 20);
		tabPane1.add(lbl_name1);
		
		lbl_cost1 = new JLabel("Cost: ");
		lbl_cost1.setBounds(145, 409, 160, 20);
		tabPane1.add(lbl_cost1);
		
		lbl_description1 = new JLabel("Description: ");
		lbl_description1.setBounds(145, 463, 600, 20);
		tabPane1.add(lbl_description1);
		
		lbl_coins1 = new JLabel("Coins: ");
		lbl_coins1.setBounds(636, 75, 127, 20);
		tabPane1.add(lbl_coins1);
		
		
		// ------- lbl_icon1 -------
		lbl_icon1 = new JLabel("JLabel icon");
		//lbl_icon1.setIcon(new ImageIcon(frame.class.getResource("/resources/icon.png")));
		lbl_icon1.setBounds(339, 224, 100, 100);
		tabPane1.add(lbl_icon1);
		
		
		
		// ------- comboB_tab1 -------
		comboB_tab1 = new JComboBox<String> (TAB1LIST);
		comboB_tab1.setBounds(186, 146, 400, 26);
		tabPane1.add(comboB_tab1);
		
		comboB_tab1.addActionListener (new ActionListener ()
		{	
			public void actionPerformed (ActionEvent e)
			{
				selectedItemName = comboB_tab1.getSelectedItem().toString();
				
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					updateProductInfo(1);
				} // if selected
			}});

		
		
		// ------- btn_buy1 -------
		btn_buy1 = new JButton ("Buy");
		btn_buy1.setBounds(421, 644, 115, 29);
		tabPane1.add(btn_buy1);
		
		btn_buy1.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					boolean completed = buyProductEngine();
					if (completed == false) {lbl_error1.setText("insufficient coins or storage"); }
				} // if selected
			}
		});

		
		
		// ------- btn_leave1 -------
		btn_leave1 = new JButton ("Leave");
		btn_leave1.setBounds(230, 644, 115, 29);
		tabPane1.add(btn_leave1);
				
		btn_leave1.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				leaveEngine();
			}
		});
		
		

		// ------------------------------------------- tabPane2 -------------------------------------------
		tabPane2 = new JPanel ();
		tabPane2.setLayout(null);
		
		lbl_error2 = new JLabel("");
		lbl_error2.setBounds(323, 535, 294, 20);
		tabPane2.add(lbl_error2);
		
		lbl_name2 = new JLabel("Name: ");
		lbl_name2.setBounds(145, 360, 254, 20);
		tabPane2.add(lbl_name2);
		
		lbl_cost2 = new JLabel("Cost: ");
		lbl_cost2.setBounds(145, 409, 160, 20);
		tabPane2.add(lbl_cost2);
		
		lbl_description2 = new JLabel("Description: ");
		lbl_description2.setBounds(145, 463, 600, 20);
		tabPane2.add(lbl_description2);
		
		lbl_coins2 = new JLabel("Coins: ");
		lbl_coins2.setBounds(636, 75, 127, 20);
		tabPane2.add(lbl_coins2);
		
		
		// ------- lbl_icon2 -------
		lbl_icon2 = new JLabel("JLabel icon");
		//lbl_icon2.setIcon(new ImageIcon(frame.class.getResource("/resources/icon.png")));
		lbl_icon2.setBounds(339, 224, 100, 100);
		tabPane2.add(lbl_icon2);
		
		

		// ------- comboB_tab2 -------
		comboB_tab2 = new JComboBox<String> (TAB2LIST);
		comboB_tab2.setBounds(186, 146, 400, 26);
		tabPane2.add(comboB_tab2);

		comboB_tab2.addActionListener (new ActionListener ()
		{	
			public void actionPerformed (ActionEvent e)
			{
				selectedItemName = comboB_tab2.getSelectedItem().toString();
				
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					updateProductInfo(2);
					lbl_icon2.repaint();
				} // if selected
			}});
		
		
		
		// ------- btn_buy2 -------
		btn_buy2 = new JButton ("Buy");
		btn_buy2.setBounds(421, 644, 115, 29);
		tabPane2.add(btn_buy2);
		
		btn_buy2.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					boolean completed = buyProductEngine();
					if (completed == false) {lbl_error2.setText("insufficient coins or storage"); }
				} // if selected
			}
		});

		
		
		// ------- btn_leave2 -------
		btn_leave2 = new JButton ("Leave");
		btn_leave2.setBounds(230, 644, 115, 29);
		tabPane2.add(btn_leave2);
				
		btn_leave2.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				leaveEngine();
			}
		});



		// ------------------------------------------- tabPane3 -------------------------------------------
		tabPane3 = new JPanel ();
		tabPane3.setLayout(null);
		
		lbl_error3 = new JLabel("");
		lbl_error3.setBounds(323, 535, 294, 20);
		tabPane3.add(lbl_error3);
		
		lbl_name3 = new JLabel("Name: ");
		lbl_name3.setBounds(145, 360, 254, 20);
		tabPane3.add(lbl_name3);
		
		lbl_cost3 = new JLabel("Cost: ");
		lbl_cost3.setBounds(145, 409, 160, 20);
		tabPane3.add(lbl_cost3);
		
		lbl_description3 = new JLabel("Description: ");
		lbl_description3.setBounds(145, 463, 600, 20);
		tabPane3.add(lbl_description3);
		
		lbl_coins3 = new JLabel("Coins: ");
		lbl_coins3.setBounds(636, 75, 127, 20);
		tabPane3.add(lbl_coins3);
		
		
		// ------- lbl_icon3 -------
		lbl_icon3 = new JLabel("JLabel icon");
		//lbl_icon3.setIcon(new ImageIcon(frame.class.getResource("/resources/icon.png")));
		lbl_icon3.setBounds(339, 224, 100, 100);
		tabPane3.add(lbl_icon3);



		// ------- comboB_tab3 -------
		comboB_tab3 = new JComboBox<String> (TAB3LIST);
		comboB_tab3.setBounds(186, 146, 400, 26);
		tabPane3.add(comboB_tab3);

		comboB_tab3.addActionListener (new ActionListener ()
		{	
			public void actionPerformed (ActionEvent e)
			{
				selectedItemName = (String) comboB_tab3.getSelectedItem();
				
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					updateProductInfo(3);
				} // if selected
			}});

		
		
		// ------- btn_buy3 -------
		btn_buy3 = new JButton ("Buy");
		btn_buy3.setBounds(421, 644, 115, 29);
		tabPane3.add(btn_buy3);
		
		btn_buy3.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					boolean completed = buyProductEngine();
					if (completed == false) {lbl_error3.setText("insufficient coins or storage"); }
				} // if selected
			}
		});

		
		
		// ------- btn_leave3 -------
		btn_leave3 = new JButton ("Leave");
		btn_leave3.setBounds(230, 644, 115, 29);
		tabPane3.add(btn_leave3);
				
		btn_leave3.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				leaveEngine();
			}
		});
		


		// ------------------------------------------- tabPane4 -------------------------------------------

		tabPane4 = new JPanel ();
		tabPane4.setLayout(null);
		
		lbl_error4 = new JLabel("");
		lbl_error4.setBounds(323, 535, 294, 20);
		tabPane4.add(lbl_error4);
		
		lbl_name4 = new JLabel("Name: ");
		lbl_name4.setBounds(145, 360, 254, 20);
		tabPane4.add(lbl_name4);
		
		lbl_cost4 = new JLabel("Cost: ");
		lbl_cost4.setBounds(145, 409, 160, 20);
		tabPane4.add(lbl_cost4);
		
		lbl_description4 = new JLabel("Description: ");
		lbl_description4.setBounds(145, 463, 600, 20);
		tabPane4.add(lbl_description4);
	
		lbl_coins4 = new JLabel("Coins: ");
		lbl_coins4.setBounds(636, 75, 127, 20);
		tabPane4.add(lbl_coins4);
		
		
		// ------- lbl_icon4 -------
		lbl_icon4 = new JLabel("JLabel icon");
		//lbl_icon4.setIcon(new ImageIcon(frame.class.getResource("/resources/icon.png")));
		lbl_icon4.setBounds(339, 224, 100, 100);
		tabPane4.add(lbl_icon4);
		
		
		
		// ------- comboB_tab4 -------
		comboB_tab4 = new JComboBox<String> (TAB4LIST);
		comboB_tab4.setBounds(186, 146, 400, 26);
		tabPane4.add(comboB_tab4);

		comboB_tab4.addActionListener (new ActionListener ()
		{	
			public void actionPerformed (ActionEvent e)
			{
				selectedItemName = comboB_tab4.getSelectedItem().toString();
				
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					updateWeaponInfo();
				} // if selected
			}});

		
		
		// ------- btn_buy4 -------
		btn_buy4 = new JButton ("Buy");
		btn_buy4.setBounds(421, 644, 115, 29);
		tabPane4.add(btn_buy4);
		
		btn_buy4.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				if (!selectedItemName.equals("") && null != selectedItemName)
				{
					boolean completed = buyWeaponEngine();
					if (completed == false) {lbl_error4.setText("insufficient coins or already owned"); }
				} // if selected
			}
		});
		
		
		
		// ------- btn_leave4 -------
		btn_leave4 = new JButton ("Leave");
		btn_leave4.setBounds(230, 644, 115, 29);
		tabPane4.add(btn_leave4);
				
		btn_leave4.addActionListener (new ActionListener ()   
		{
			public void actionPerformed (ActionEvent e)
			{
				leaveEngine();
			}
		});



		// ------- shopTabbedPane -------
		shopTabbedPane = new JTabbedPane();
		shopTabbedPane.setBounds(0,0,800,800);  
		shopTabbedPane.addTab(TAB1NAME, tabPane1);
		shopTabbedPane.addTab(TAB2NAME, tabPane2);
		shopTabbedPane.addTab(TAB3NAME, tabPane3);
		shopTabbedPane.addTab(TAB4NAME, tabPane4);
		//--update to set
		updateProductInfo(1);
		
	} // initGUI method
	
	
	
	public static JTabbedPane getTabbedPane() {return shopTabbedPane; } //getTabbedPane method
	
	
	
	public static void leaveEngine()
	{
		GUIExtension1.leaveShop(Map.getPane());
	} // leaveEngine method
	
	
	
	public static void updateProductInfo(int tab)
	{
		Product product =  Database.getProduct (selectedItemName);
		
		if (tab == 1)
		{
			lbl_icon1.setIcon(new ImageIcon( Database.getProductImage(selectedItemName)));
			lbl_icon1.repaint();
			lbl_name1.setText("Name: " + product.getName());
			lbl_cost1.setText("Cost: " + Integer.toString (product.getCost()));
			lbl_description1.setText ("Description: " + product.getDescription());

		} // if tab 1

		else if (tab == 2)
		{	
			lbl_icon2.setIcon(new ImageIcon(Database.getProductImage(selectedItemName)));
			lbl_icon2.repaint();
			lbl_name2.setText("Name: " + product.getName());
			lbl_cost2.setText("Cost: " + Integer.toString (product.getCost()));
			lbl_description2.setText ("Description: " + product.getDescription());

		} // else if tab 2

		else
		{
			lbl_icon3.setIcon(new ImageIcon(Database.getProductImage(selectedItemName)));
			lbl_icon3.repaint();
			lbl_name3.setText("Name: " + product.getName());
			lbl_cost3.setText("Cost: " + Integer.toString (product.getCost()));
			lbl_description3.setText ("Description: " + product.getDescription());

		} // else tab 3
		
	} // productComboBoxEngine method
	
	
	
	public static void updateWeaponInfo()
	{
		Weapon weapon = Database.getWeapon (selectedItemName);
		
		lbl_icon4.setIcon(new ImageIcon(Frame.class.getResource(weapon.getImagePath())));
		lbl_name4.setText("Name: " + weapon.getName());
		lbl_cost4.setText("Cost: " + Integer.toString (weapon.getCost()));
		lbl_description4.setText ("Description: " + weapon.getDescription());
		
	} // updateWeaponInfo method
	
	
	
	public static boolean buyProductEngine()
	{
		boolean completed = false;
		
		Product product =  Database.getProduct (selectedItemName);
		
		if (MainExecutable.getPlayer().hasEnoughCoins(product.getCost()) == true && MainExecutable.getPlayer().isProductCapacityFull() == false)
		{			
	
			int coins = MainExecutable.getPlayer().getCoins() - product.getCost();
			MainExecutable.getPlayer().setCoins(coins);
			
			MainExecutable.getPlayer().addProduct(product);
			
			completed = true;
			
			updateCoinsLabels();
			Backpack.update();
			
		} // if enough coins and capacity is not full
			
		return completed;
		
	} // buy ProductEngine method
	
	
	
	public static boolean buyWeaponEngine()
	{
		boolean completed = false;
		
		Weapon weapon = Database.getWeapon (selectedItemName);
		
		if (MainExecutable.getPlayer().hasEnoughCoins(weapon.getCost()) == true && MainExecutable.getPlayer().alreadyOwnsWeapon(weapon) == false)
		{			
	
			int coins = MainExecutable.getPlayer().getCoins() - weapon.getCost();
			MainExecutable.getPlayer().setCoins(coins);
			
			MainExecutable.getPlayer().addWeapon(weapon);
			
			completed = true;
			
			updateCoinsLabels();
			Backpack.update();
			
		} // if enough coins and capacity is not full
		
		return completed;
		
	} // buy WeaponEngine method
	
	
	
	public static void updateCoinsLabels()
	{
		lbl_coins1.setText ("Coins: " + Integer.toString( MainExecutable.getPlayer().getCoins() ));
		lbl_coins2.setText ("Coins: " + Integer.toString( MainExecutable.getPlayer().getCoins() ));
		lbl_coins3.setText ("Coins: " + Integer.toString( MainExecutable.getPlayer().getCoins() ));
		lbl_coins4.setText ("Coins: " + Integer.toString( MainExecutable.getPlayer().getCoins() ));
		
		/* not sure if this part is needed; test later
		shopTabbedPane.removeAll();
		shopTabbedPane.addTab(TAB1NAME, tabPane1);
		shopTabbedPane.addTab(TAB2NAME, tabPane2);
		shopTabbedPane.addTab(TAB3NAME, tabPane3);
		shopTabbedPane.addTab(TAB4NAME, tabPane4);
		
		GUIExtension1.switchToShop (shopTabbedPane); */
		
	} //updateCoinsLabels method
	
	
} // Shop class
