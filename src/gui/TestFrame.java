package src.gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import src.Database;
import src.character.NonPlayer;

public class TestFrame extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private CombatMenu menu = new CombatMenu();
	private Room room;
	/**
	 * Launch the application.
	 */
	public static void initGui(TestFrame frame) 
	{
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {

		try {//(int x, int y,int width, int height, int north, int east, int south, int west, int enemyID
			room = new Room(0,0,800,800,0,0,0,0,Room.GYMTEACHER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		room.setBounds(0, 0, 800, 800);
		contentPane.add(room);
		menu.setBounds(800, 0, 200, 800);
		contentPane.add(menu);
		try {
			room.updateBoard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("setting visible");
		setVisible(true);
		System.out.println("done");
	}
}
