package src.gui;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Database;
import src.MatchExtension;


public class BattlePanel  {

	// rooms for levels
	private static Room room0 = new Room(3,0,3,0,Room.GYMTEACHER);
	private static Room room1 = new Room(3,3,3,0,Room.BINAY);
	private static Room hall = new Room(3,0,3,0,Room.HALLMONITOR);
	
	private static Room room;//current updated room.
	private static CombatMenu menu;
	private static JPanel panel;
	
	
	public static void RunBattlePanel(int level) 
	{
		panel = new JPanel();
		panel.setBounds(100, 100, 1000, 800);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);

		// load and add the appropriate room
		try {

			loadRoom(level);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (null == getRoom()) {System.out.println ("null room");}
		
		room.setBounds(0, 0, 800, 800);
		panel.add(room);
		
		// add a combat menu
		menu  = new CombatMenu( );
		panel.add(menu);
		
		menu.setVisible(true); // show the combat menu
		
	} // RunBattlePanel method


	
	public static void loadRoom(int level) 
	{
		if(level == 0 && MatchExtension.run == true) 
		{
			room = room0;
		}
		else if(level == 0)
		{
			
		}
		if(level == 1 && MatchExtension.run == true) 
		{
			room = room1;
		}
		else if(level == 1)
		{
			
		}
	} // loadRoom method
	
	
	
	// ------- gets and sets -------
	
	public static Room getRoom() {return room;}

	public static JPanel getPanel() {return panel;}
	public static void setPanel(JPanel panel) {BattlePanel.panel = panel;}

	
	public static Room getRoom1() {return room1;}
	public static void setRoom1(Room room1) {BattlePanel.room1 = room1;}

	public static Room getHall() {return hall;}
	public static void setHall(Room hall) {BattlePanel.hall = hall;}
	
	public static CombatMenu getCombatMenu() {return menu;}

	
} // BattlePanel class