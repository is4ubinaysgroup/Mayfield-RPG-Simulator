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

	/**
	 * Create the frame.
	 */
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		
		try {//(int x, int y,int width, int height, int north, int east, int south, int west, int enemyID
			room = new Room(3,3,3,3,Room.GYMTEACHER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		room.setBounds(0, 0, 800, 800);

	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		contentPane.add(room);

		menu.setBounds(800, 0, 200, 800);
		contentPane.add(menu);
		
		setContentPane(contentPane);

		
		try {
			room = new Room(3,3,3,3,Room.GYMTEACHER);
			//room.setBounds(0, 0, 800, 800);
			contentPane.add(room);
			room.updateBoard();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("setting visible");
		setVisible(true);
		try {
			room.updateBoard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
		
	} // TestFrame constructor
	
	
} // TestFrame class

