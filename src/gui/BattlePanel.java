package src.gui;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Database;


public class BattlePanel extends JPanel {

	/**
	 * 
	 */
	private static Room room0 = new Room(3,0,3,0,Room.GYMTEACHER);
	private static CombatMenu menu;
	
	private static Room room;//current updated room.
	private static final long serialVersionUID = 1427930290972166548L;
	public BattlePanel() 
	{
		setBounds(100, 100, 1000, 800);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		loadRoom();
		room.setBounds(0, 0, 800, 800);
		add(room);
		menu  = new CombatMenu( );
		add(menu);
		menu.setVisible(true);
	}

	
	
	/**
	 * Launch the application.
	 */
	public static void initGui() {
		try {
			loadRoom();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TODO
	}
	
	public static void loadRoom() 
	{
		if(MainExecutable.getPlayer().getLevel() == 0) 
		{
			room = room0;
		}
	}
	
	public static Room getRoom() 
	{
		return room;
	}

}
