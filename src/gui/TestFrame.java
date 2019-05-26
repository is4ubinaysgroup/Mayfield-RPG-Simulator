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
	public void initGui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {

		try {
			room = new Room(20,20, true, true, false, false, Database.gymTeacher, Database.getImgGymTeacher());
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
		room.update();
	}
}
