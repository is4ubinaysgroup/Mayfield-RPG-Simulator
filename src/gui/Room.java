package src.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import src.character.NonPlayer;
import src.character.Player;


/*
Carson may 19th
fixed errors and debuged a whole ton of code
huge face lift and overhaul.
 */

public class Room extends JPanel {
	public static final Dimension size = new Dimension(20,20); 
	/**
	 * 
	 */
	private static int mouseX;
	private static int mouseY;
	private NonPlayer nonPlayer;
	private static final long serialVersionUID = 3276708249872258003L;
	private JLabel labels[][]=  new JLabel[20][20];
	private JButton btnNewButton = new JButton("Move Here");
  
	/**
	 * Create the frame.
	 */
	public  JPopupMenu popupMenu = new JPopupMenu();
    
	
	
	public Room() {
		setBounds(0, 0, 800, 800);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		 popupMenu.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					MainExecutable.getPlayer().moveTo(new Point ( Math.round(mouseX/800) ,Math.round(mouseY/800) ));
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}});
		for(int i = 0; i != labels.length; i++) 
		{
			for(int counter = 0; counter != labels[i].length; counter++ ) 
			{
				//labels[i][counter] = new JLabel("label["+i+"]["+counter+"]");
				labels[i][counter] = new JLabel();
				labels[i][counter].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				labels[i][counter].setBounds(0+40*i, 0+40*counter, 40, 40);
				add(labels[i][counter]);
			}
		}
	}
	
		public void setRoom(JLabel[][] labels)
		{
			this.labels = labels;	
		}
		
		 public void updateNonPlayer()
		 {
			int range =nonPlayer.getEquippedWeapon().getRange();
			int npcX = nonPlayer.getX();
			int npcY = nonPlayer.getY();
			for(int x = npcX; x != npcX+range; x++) 
			{
				for(int y = npcY; y != npcY+range; y++ ) 
				{

					labels[x][y].setBackground(mixColorsWithAlpha(labels[x][y].getBackground(),Color.RED, 155));
				}
			}
			labels[npcX][npcY].setBackground(Color.BLACK);
		 }
		 
		 public void updatePlayer()
		 {
			 int range =MainExecutable.getPlayer().getEquippedWeapon().getRange();
			int npcX = MainExecutable.getPlayer().getX();
			int npcY = MainExecutable.getPlayer().getY();
			for(int x = npcX; x != npcX+range; x++) 
				{
					for(int y = npcY; y != npcY+range; y++ ) 
					{
						 addPopup(labels[x][y], popupMenu);
						labels[x][y].setBackground(mixColorsWithAlpha(labels[x][y].getBackground(),Color.BLUE, 155));
					}
				}
			labels[npcX][npcY].setBackground(Color.YELLOW);
			//labels[npcX][npcY].setIcon(new ImageIcon(
		 }
		 
		 public void setNonPlayer(NonPlayer nonPlayer)
		 {
			this.nonPlayer = nonPlayer;
		 }
		 
		 public void update() // sets the panel to update to the ranges of both players and players
		 {
			 updatePlayer();
			 updateNonPlayer();
		 }
		 
		 public static Color mixColorsWithAlpha(Color color1, Color color2, int alpha)
		 {
		     float factor = alpha / 255f;
		     int red = (int) (color1.getRed() * (1 - factor) + color2.getRed() * factor);
		     int green = (int) (color1.getGreen() * (1 - factor) + color2.getGreen() * factor);
		     int blue = (int) (color1.getBlue() * (1 - factor) + color2.getBlue() * factor);
		     return new Color(red, green, blue);
		 }
		 
		 private static void addPopup(Component component, final JPopupMenu popup) {
				component.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						if (e.isPopupTrigger()) {
							showMenu(e);
						}
					}
					public void mouseReleased(MouseEvent e) {
						if (e.isPopupTrigger()) {
							showMenu(e);
						}
					}
					private void showMenu(MouseEvent e) {
						mouseX = e.getX();
						mouseY = e.getY();
						popup.show(e.getComponent(), e.getX(), e.getY());
					}
				});
			}
	
}
	
	