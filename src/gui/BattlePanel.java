package src.gui;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Database;


public class BattlePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1427930290972166548L;
	public BattlePanel() 
	{
		setBounds(100, 100, 1000, 800);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		room0.setBounds(0, 0, 800, 800);
		add(room0);
		menu.setBounds(800, 0, 200, 800);
		add(menu);
		room0.updatePlayer();
	}

	private CombatMenu menu = new CombatMenu();
	private Room room0 = new Room(Database.gymTeacher);
	/**
	 * Launch the application.
	 */
	public void initGui() {
		//TODO
	}

}
