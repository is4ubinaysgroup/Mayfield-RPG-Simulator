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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import src.Database;
import src.character.Human;
import src.character.NonPlayer;


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
	private int popupX;
	private int popupY;
	private NonPlayer nonPlayer;
	private static final long serialVersionUID = 3276708249872258003L;
	private JPanel labels[][]=  new JPanel[20][20];
	private JButton btnNewButton = new JButton("Move Here");
	private JButton btnNewButton_1;
	private JLabel Newlabel = new JLabel("Click on a space to move closer to the enemy.");
  
	/**
	 * Create the frame.
	 */
	public  JPopupMenu popupMenu = new JPopupMenu();
    
	public JPopupMenu popupins= new JPopupMenu();
	public void instruction() 
	{
		JFrame instruction= new JFrame();
		instruction.add(popupins);
		popupins.add(Newlabel);
		popupins.add(btnNewButton_1);
	}
	
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
					btnNewButton.getParent().setVisible(false);
					Point location = new Point(popupX, popupY);
					try 
					{
					  MainExecutable.getPlayer().moveTo(location, false);
					  runEnemy();
					  cleanBoard();
						update();
					}
					catch(Exception e) 
					{
						
					e.printStackTrace();
					}
					
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}

			}); 
		for(int i = 0; i != labels.length; i++) 
		{
			for(int counter = 0; counter != labels[i].length; counter++ ) 
			{
				//labels[i][counter] = new JLabel("label["+i+"]["+counter+"]");
				labels[i][counter] = new JPanel();
				addPopup(this,labels[i][counter], popupMenu);
				labels[i][counter].setBackground(new Color(225,225,225,0));
				labels[i][counter].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				labels[i][counter].setBounds(0+40*i, 0+40*counter, 40, 40);
				add(labels[i][counter]);
			}
		}
		
		add(background);
	}
	
		protected void cleanBoard() 
		{
			for(int x =0; x<20; x++) 
			{
				for(int y = 0; y<20; y++) 
				{
					labels[x][y].setBackground(new Color(225,225,225,0));
				}
			}
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
						popupMenu.getComponent().setVisible(player);
						labels[x][y].setBackground( mixColorsWithAlpha(color, labels[x][y].getBackground()));
					}
				}
			}
			labels[npcX][npcY].setBackground(Color.YELLOW);
			}
		}
		 
		 
		public void updateNonPlayer()
		 {
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
		 
		 private void addPopup(Room room, Component component, final JPopupMenu popup) {
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
						room.setPopupX((component.getX())/40);
						room.setPopupY((component.getY())/40);
						popup.show(e.getComponent(), e.getX(), e.getY());
					}
				});
			}

		 public JButton getButton() 
		 {
			JButton newButton = this.btnNewButton; 
			return newButton;
		 }
		public int getPopupX() {
			return popupX;
		}

		public void setPopupX(int popupX) {
			this.popupX = popupX;
		}

		public int getPopupY() {
			return popupY;
		}

		public void setPopupY(int popupY) {
			this.popupY = popupY;
		}
	
		public void runEnemy() {
			 try {
				nonPlayer.runTurn(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
}
	
	