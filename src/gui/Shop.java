// initially completed 05-08 by Matthew
// edited 05-09 by Mina


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shop{

	static protected JPanel Shop;
	static protected JFrame Frame;

	public static void initGUI() {
		Frame = new JFrame();
		Frame.setBackground(Color.BLACK);
		Frame.getContentPane().setLayout(null);
		
		Shop = new JPanel();
		Shop.setBackground(Color.BLACK);
		Shop.setLayout(null);
		
		
		JMenuBar Menu = new JMenuBar();
		Menu.setBackground(new Color(0, 0, 204));
		Menu.setBounds(10, 80, 600, 40);
		Shop.add(Menu);
		
		JMenuItem HealthRestore = new JMenuItem("Health Restore");
		HealthRestore.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		HealthRestore.setBackground(new Color(0, 0, 204));
		Menu.add(HealthRestore);
		HealthRestore.setForeground(new Color(255, 255, 255));
		
		JMenuItem ItemUpgrades = new JMenuItem("Item Upgrades");
		ItemUpgrades.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		ItemUpgrades.setBackground(new Color(0, 0, 204));
		Menu.add(ItemUpgrades);
		ItemUpgrades.setForeground(new Color(255, 255, 255));
		
		JMenuItem StatBoost = new JMenuItem("StatBoost");
		StatBoost.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		StatBoost.setForeground(new Color(255, 255, 255));
		StatBoost.setBackground(new Color(0, 0, 204));
		Menu.add(StatBoost);
		
		JComboBox Items = new JComboBox();
		Items.setForeground(new Color(255, 255, 255));
		Items.setBackground(new Color(0, 0, 204));
		Items.setBounds(200, 200, 400, 50);
		Shop.add(Items);
		
		JButton btnBuy = new JButton("BUY");
		btnBuy.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(0, 0, 204));
		btnBuy.setBounds(300, 700, 200, 50);
		Shop.add(btnBuy);
		
		//--- Lable------
		JLabel lblShop = new JLabel("Shop");
		lblShop.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		lblShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblShop.setForeground(new Color(255, 255, 255));
		lblShop.setBackground(new Color(0, 0, 204));
		lblShop.setBounds(200, 10, 400, 50);
		Shop.add(lblShop);
		
		//--- Lable------
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(new Color(255, 255, 255));
		lblDescription.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDescription.setBackground(new Color(0, 0, 204));
		lblDescription.setBounds(10, 620, 200, 20);
		Shop.add(lblDescription);
		
		//--- Lable------
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblName.setBackground(new Color(0, 0, 204));
		lblName.setBounds(10, 600, 200, 20);
		Shop.add(lblName);
		
		//--- Lable------
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setForeground(new Color(255, 255, 255));
		lblCost.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblCost.setBackground(new Color(0, 0, 204));
		lblCost.setBounds(10, 640, 200, 20);
		Shop.add(lblCost);
		
	} // initGUI method
	
	public static JPanel getPane() {return Shop; } //getPane method
}