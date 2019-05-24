package src.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
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

import src.Database;
import src.character.Human;
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
	private JPanel labels[][]=  new JPanel[20][20];
	private JButton btnNewButton = new JButton("Move Here");
  
	/**
	 * Create the frame.
	 */
	public  JPopupMenu popupMenu = new JPopupMenu();
    
	
	
	public Room(NonPlayer nonPlayer) {
		JPanel background = new JPanel() 
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = -6563003679240602762L;

			public void paint(Graphics g) 
			{
				g.drawImage(Database.getBackground(), 0, 0, 800, 800, null);
			}
		};
		
		background.setBounds(0, 0, 800, 800);
		background.setVisible(true);
		this.nonPlayer = nonPlayer;
		setBounds(0, 0, 800, 800);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		 popupMenu.add(btnNewButton);
		 btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					MainExecutable.getPlayer().moveTo(new Point ( Math.round(mouseX/800) ,Math.round(mouseY/800) ), false);
					update();
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
				labels[i][counter] = new JPanel();
				labels[i][counter].setBackground(new Color(225,225,225,0));
				labels[i][counter].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				labels[i][counter].setBounds(0+40*i, 0+40*counter, 40, 40);
				add(labels[i][counter]);
			}
		}
		
		add(background);
	}
	
		public void setRoom(JPanel[][] labels)
		{
			this.labels = labels;	
		}
		
		
		private void draw(Human human, Color color, boolean player) 
		{
			if(human.getEquippedWeapon() != null) 
			{
			int range =human.getEquippedWeapon().getRange();
			int npcX = human.getX();
			int npcY = human.getY();
			for(int x = npcX-range; x != npcX+range*2; x++) 
			{
				for(int y = npcY-range; y != npcY+range*2; y++ ) 
				{
					if( (x>=0 && y>= 0) &&  (x<=19 && y<= 19))
					{
						//System.out.println("Player:" + player +", x:" + x +", y:" + y);
						if(player) 
						{
								addPopup(labels[x][y], popupMenu);
						}
						labels[x][y].setBackground( mixColorsWithAlpha(color, labels[x][y].getBackground()));
					}
				}
			}
			labels[npcX][npcY].setBackground(Color.YELLOW);
			}
		}
		
		 public void updateNonPlayer()
		 {
			 //System.out.print("Runned nonplayer");
			 draw(nonPlayer, Color.BLACK, false);
		 }
		 
		 public void updatePlayer()
		 {
			draw(MainExecutable.getPlayer(),Color.BLUE, true);
		 }
		 
		 public void setNonPlayer(NonPlayer nonPlayer)
		 {
			this.nonPlayer = nonPlayer;
		 }
		 
		 public void update() // sets the panel to update to the ranges of both players and players
		 {
			 if(this.nonPlayer != null) 
			 {
			 updatePlayer();
			 updateNonPlayer();
			 }
			 else 
			 {
				 System.out.println("Could not update nonplayer since nonplayer is null");
			 }
		 }
		 
		 public static Color mixColorsWithAlpha(Color color1, Color color2)
		 {
			 
		     float factor = 45 / 255f;
		     int red = (int) (color1.getRed() * (1 - factor) + color2.getRed() * factor);
		     int green = (int) (color1.getGreen() * (1 - factor) + color2.getGreen() * factor);
		     int blue = (int) (color1.getBlue() * (1 - factor) + color2.getBlue() * factor);
		     int alpha = (int) (color1.getAlpha() * (1 - factor) + color2.getAlpha() * factor);
		     return new Color(red, green, blue, alpha);
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
	
	