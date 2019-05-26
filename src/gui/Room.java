package src.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import src.Database;
import src.character.Human;
import src.character.NonPlayer;
/*

Editor: Carson 
Date:May 19th-26th
fixed errors and debuged a whole ton of code
huge face lift and overhaul.
----------------------------------------------
Editor: Carson
Date: May 19th-26th
Task: facelift to code.
*/

public class Room extends JPanel {
	private static final long serialVersionUID = 3276708249872258003L; //Serial Version. 
	
	/**
	 * Create the Variables
	 **/
	private Point pntPopup = new Point();
	private NonPlayer enemy;
	private int x = 0;
	private int y = 0;
	private int width = 20;
	private int height = 20;
	private Image image;
	
	private boolean northBlockade = false;
	private boolean southBlockade = false;
	private boolean eastBlockade = false;
	private boolean westBlockade = false;
	private byte blockadeThickness = 3;//three units
	/**
	 * Create the frame.
	 */
	private JPanel labels[][]=  new JPanel[width][height]; //labels
	private JButton btn = new JButton();
	private JPopupMenu popupMenu = new JPopupMenu();
    
	
	/**
	 * Initializers
	 * @param enemy
	 * @throws Exception 
	 */
	public Room(int width, int height, boolean hasNorthBlockade, boolean hasSouthBlockade, boolean hasEastBlockade, boolean hasWestBlockade, NonPlayer enemy, Image image) throws Exception {
		/**
		 * Enemy
		 */
		this.enemy = enemy;
		enemy.setRoom(this);
		this.width = width;
		this.height = height;
		this.northBlockade = hasNorthBlockade;
		this.southBlockade = hasSouthBlockade;
		this.eastBlockade = hasEastBlockade;
		this.westBlockade = hasWestBlockade;
		//blockadeThickness = 3;
		/**
		 * Exceptions
		 */
		if(enemy.getX() > width || enemy.getX() < 0 ) 
		{
			throw new Exception("Enemy X position out of range:" + (width - enemy.getX()) );
		}
		if(enemy.getY() > height || enemy.getY() < 0) 
		{
			throw new Exception("Enemy Y position out of range:" + (height - enemy.getY()) );

		}
		
		/**
		 * JPanel
		 */
		JPanel background = new JPanel() 
		{
			/**
			 * 
			 */
			private static final long serialVersionUID = -6563003679240602762L;

			public void paint(Graphics g) 
			{
				if(hasNorthBlockade && hasSouthBlockade) 
				{
					g.drawImage(Database.getBackground(), 0, 0, 800, 800, null);
				}
				
			}
		};
		background.setBounds(0, 0, 800, 800);
		background.setVisible(true);
		
		
		/**
		 * Setup
		 */
		setBounds(x, y, width, height);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		popupMenu.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnFunction();
			}

			}); 
		 
		 /**
		  * placing Labels
		  */
		for(int i = 0; i != labels.length; i++) 
		{
			for(int counter = 0; counter != labels[i].length; counter++ ) 
			{
				//labels[i][counter] = new JLabel("label["+i+"]["+counter+"]");
				labels[i][counter] = new JPanel();
				labels[i][counter].setBackground(new Color(225,225,225,0));
				labels[i][counter].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				labels[i][counter].setBounds(0+40*i, 0+40*counter, 40, 40);
				addPopup(this,labels[i][counter], popupMenu);
				add(labels[i][counter]);
				
			}
		}
		
		//Finally adding the background Image.
		add(background);
	}
	
	protected void btnFunction() {
		try 
		{
			btn.getParent().setVisible(false);
			Point location = pntPopup;
			try 
			{
				MainExecutable.getPlayer().moveTo(location, false);
				runEnemyTurn();
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

/**
 * Methods	
 */
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
		
		
		/**
		 * 
		 * @param human
		 * @param color
		 * @param player
		 */
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
						labels[x][y].setBackground( mixColors(color, labels[x][y].getBackground()));
					}
				}
			}
			if(!player) 
			{
				labels[npcX][npcY] = new JPanel() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					public void paint (Graphics g) 
					{
						g.drawImage(Database.getImgPlayer(), 0, 0, 40, 40, null);
					}
				};
				labels[npcX][npcY].setBackground(new Color(225,225,225,0));
				labels[npcX][npcY].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				labels[npcX][npcY].setBounds(0+40*npcX, 0+40*npcY, 40, 40);
			}
			else 
			{
				labels[npcX][npcY] = new JPanel() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					public void paint (Graphics g) 
					{
						g.drawImage(Database.getImgGymTeacher(), 0, 0, 40, 40, null);
					}
				};
				labels[npcX][npcY].setBackground(new Color(225,225,225,0));
				labels[npcX][npcY].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				labels[npcX][npcY].setBounds(0+40*npcX, 0+40*npcY, 40, 40);
			}
			
			}
		}
		 
		 
		public void updateNonPlayer()
		 {
			 draw(enemy, Color.BLACK, false);
		 }
		 
		 public void updatePlayer()
		 {
			draw(MainExecutable.getPlayer(),Color.BLUE, true);
		 }
		 
		 private static Color mixColors(Color color1, Color color2)
		 {
			 
		     float factor = /*Alpha factor ->*/90 / 255f;/* <-- 225 is completely invisible to the eye.*/
		     int red = (int) (color1.getRed() * (1 - factor) + color2.getRed() * factor);
		     int green = (int) (color1.getGreen() * (1 - factor) + color2.getGreen() * factor);
		     int blue = (int) (color1.getBlue() * (1 - factor) + color2.getBlue() * factor);
		     int alpha = (int) (color1.getAlpha() * (1 - factor) + color2.getAlpha() * factor);
		     return new Color(red, green, blue, alpha);
		 }
		 
		 private static void addPopup(Room room, Component component, final JPopupMenu popup) {
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
						room.pntPopup.setLocation(component.getX()/(room.getWidth()/20),component.getY()/(room.getHeight()/20));
						popup.show(e.getComponent(), e.getX(), e.getY());
					}
				});
			}
		 

		//Getters and settersss
		 public void setNonPlayer(NonPlayer enemy)
		 {
			this.enemy = enemy;
		 }
		 
		 public void update() // sets the panel to update to the ranges of both players and players
		 {
			 if(this.enemy != null) 
			 {
			 updatePlayer();
			 updateNonPlayer();
			 }
			 else 
			 {
				 System.out.println("Could not update nonplayer since nonplayer is null");
			 }
		 }

		 public JButton getButton() 
		 {
			JButton newButton = this.btn; 
			return newButton;
		 }
	
		private void runEnemyTurn() {
			 try {
				enemy.runTurn();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}

		/**
		 * @return the image
		 */
		public Image getImage() {
			return image;
		}

		/**
		 * @param image the image to set
		 */
		public void setImage(Image image) {
			this.image = image;
		}

		/**
		 * @return the northBlockade
		 */
		public boolean hasNorthBlockade() {
			return northBlockade;
		}

		/**
		 * @param northBlockade the northBlockade to set
		 */
		public void setNorthBlockade(boolean northBlockade) {
			this.northBlockade = northBlockade;
		}

		/**
		 * @return the southBlockade
		 */
		public boolean hasSouthBlockade() {
			return southBlockade;
		}

		/**
		 * @param southBlockade the southBlockade to set
		 */
		public void setSouthBlockade(boolean southBlockade) {
			this.southBlockade = southBlockade;
		}

		/**
		 * @return the eastBlockade
		 */
		public boolean hasEastBlockade() {
			return eastBlockade;
		}

		/**
		 * @param eastBlockade the eastBlockade to set
		 */
		public void setEastBlockade(boolean eastBlockade) {
			this.eastBlockade = eastBlockade;
		}

		/**
		 * @return the westBlockade
		 */
		public boolean hasWestBlockade() {
			return westBlockade;
		}

		/**
		 * @param westBlockade the westBlockade to set
		 */
		public void setWestBlockade(boolean westBlockade) {
			this.westBlockade = westBlockade;
		}

		/**
		 * @return the blockadeThickness
		 */
		public byte getBlockadeThickness() {
			return blockadeThickness;
		}

		/**
		 * @param blockadeThickness the blockadeThickness to set
		 */
		public void setBlockadeThickness(byte blockadeThickness) {
			this.blockadeThickness = blockadeThickness;
		}
}
	
	