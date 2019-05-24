package src.gui;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


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
		room.setBounds(0, 0, 800, 800);
		add(room);
		menu.setBounds(800, 0, 200, 800);
		add(menu);
		room.updatePlayer();
	}

	private CombatMenu menu = new CombatMenu();
	private Room room = new Room();
	/**
	 * Launch the application.
	 */
	public void initGui() {
		//TODO
	}

}
