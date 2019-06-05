package src.gui;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Database;


public class BattlePanel  {

	/**
	 * 
	 */
	private static Room room0 = new Room(3,0,3,0,Room.GYMTEACHER);
	private static Room room1 = new Room(3,3,3,0,Room.BINAY);
	private static Room hall = new Room(3,0,3,0,Room.HALLMONITOR);
	private static CombatMenu menu;
	private static JPanel panel;
	private static Room room;//current updated room.
	
	public static void RunBattlePanel() 
	{
		panel = new JPanel();
		panel.setBounds(100, 100, 1000, 800);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		loadRoom();
		room.setBounds(0, 0, 800, 800);
		panel.add(room);
		menu  = new CombatMenu( );
		panel.add(menu);
		menu.setVisible(true);
	}

	
	
	/**
	 * Launch the application.
	 */
	public static void initGui() {
		try {
			
			loadRoom();
			GUIExtension1.InBattle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TODO
	}
	
	public static void loadRoom() 
	{
		if(MainExecutable.getPlayer().getLevel() == 0 && GUIExtension1.isinBattle()) 
		{
			
		}
		else if(MainExecutable.getPlayer().getLevel() == 0)
		{
			room = room0;
		}
		if(MainExecutable.getPlayer().getLevel() == 1 && GUIExtension1.isinBattle()) 
		{
			
		}
		else if(MainExecutable.getPlayer().getLevel() == 1)
		{
			room = room1;
		}
	}
	
	public static Room getRoom() 
	{
		return room;
	}



	public static JPanel getPanel() {
		return panel;
	}



	public static void setPanel(JPanel panel) {
		BattlePanel.panel = panel;
	}



	public static Room getRoom1() {
		return room1;
	}



	public static void setRoom1(Room room1) {
		BattlePanel.room1 = room1;
	}



	public static Room getHall() {
		return hall;
	}



	public static void setHall(Room hall) {
		BattlePanel.hall = hall;
	}

}
