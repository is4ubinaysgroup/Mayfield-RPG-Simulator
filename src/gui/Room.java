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
import java.util.ArrayList;

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

public class Room extends JPanel 
{
	private static final long serialVersionUID = 3276708249872258005L; //Serial Version. 
	public static final int BINAY = 0;
	public static final int GYMTEACHER = 1;
	public static final int HALLMONITOR = 2;
	
	/**
	 * Create the Variables
	 **/
	private Point popupLocation = new Point();
	private int enemy;
	private Image enemyImg;
	
	private int north = 0;
	private int south = 0;
	private int west = 0;
	private int east = 0;
	/**
	 * Create the  frame.
	 */
	private JPanel board[][]=  new JPanel[20][20]; //labels
	private JButton btn = new JButton();
	private JPopupMenu popupMenu = new JPopupMenu();
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param north
	 * @param east
	 * @param south
	 * @param west
	 * @param enemyID
	 * @throws Exception
	 */
	public Room( int north, int east, int south, int west, int enemyID) throws Exception 
	{

		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		this.enemy = enemyID;

		
		if(getEnemy().getX()+west > 20-east || getEnemy().getX() < 0 ) 
		{
			throw new Exception("Enemy X position out of range:" + (20 - getEnemy().getX()) );
		}
		if(getEnemy().getY()+north > 20-south || getEnemy().getY() < 0) 
		{
			throw new Exception("Enemy Y position out of range:" + (20 - getEnemy().getY()) );
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

					g.drawImage(Database.getBackground(), 0, 0, 800, 800, null);//TODO
				
			}
		};
		background.setBounds(0, 0, 800, 800);
		background.setVisible(true);
		
		/**
		 * Setup
		 */
		setBounds(0, 0, 800, 800);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		popupMenu.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				btnFunction();
			}

			}); 
		 
		 /**
		  * placing Labels
		  */
		for(int xPos = 0 + west; xPos != board.length - east; xPos++) 
		{
			for(int yPos = 0 + north; yPos != board.length - south; yPos++ ) 
			{
				//labels[i][yPos] = new JLabel("label["+i+"]["+yPos+"]");
				board[xPos][yPos] = new JPanel();
				board[xPos][yPos].setBackground(new Color(225,225,225,0));
				board[xPos][yPos].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
				board[xPos][yPos].setBounds(0+40*xPos, +40*yPos, 40, 40);
				addPopup(this,board[xPos][yPos], popupMenu); 
				add(board[xPos][yPos]);
			}
		}
		
		//Finally adding the background Image.
		add(background);
		System.out.println("finished");
	}
	
	private NonPlayer getEnemy() throws Exception
	{
		switch(this.enemy) 
		{
		case 0 : //Binay
			return Database.binay;
		case 1: //GymTeacher
			return Database.gymTeacher;
		case 2://HallMonitor
			return Database.hallMonitor;
		default:
			throw new Exception("No enemy");
		}
	}
	
	private void enemyTurn() 
	{
		 try 
		 {
			getEnemy().runTurn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	protected void cleanBoard() 
	{
		for(int x = 20-this.west; x< 20-this.east; x++) 
		{
			for(int y = 20 -getNorth(); y< 20-getSouth(); y++) 
			{
				this.board[x][y].setBackground(new Color(225,225,225,0));
			}
		}
	}
	
	private void draw(Human human, Color color, boolean player) throws Exception 
	{
		if(!(human.getEquippedWeapon() != null)) 
		{
			throw new Exception("Human contains no EquippedWeapon. ");
		}
		if(getEnemy().getX()+west > 20-east || getEnemy().getX() < 0 ) 
		{
			throw new Exception("Enemy X position out of range:" + (20 - getEnemy().getX()) );
		}
		if(getEnemy().getY()+north > 20-south || getEnemy().getY() < 0) 
		{
			throw new Exception("Enemy Y position out of range:" + (20 - getEnemy().getY()) );
		}

		int range = human.getEquippedWeapon().getRange();
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
					board[x][y].setBackground( mixColors(color, board[x][y].getBackground()));
				}
			}
		}
		if(!player) 
		{
			board[npcX][npcY] = new JPanel() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public void paint (Graphics g) 
				{
					g.drawImage(Database.getImgPlayer(), 0, 0, 40, 40, null);
				}
			};
			board[npcX][npcY].setBackground(new Color(225,225,225,0));
			board[npcX][npcY].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
			board[npcX][npcY].setBounds(0+40*npcX, 0+40*npcY, 40, 40);
		}
		else 
		{
			board[npcX][npcY] = new JPanel() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public void paint (Graphics g) 
				{
					g.drawImage(Database.getImgGymTeacher(), 0, 0, 40, 40, null);
				}
			};
			board[npcX][npcY].setBackground(new Color(225,225,225,0));
			board[npcX][npcY].setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 5));
			board[npcX][npcY].setBounds(0+40*npcX, 0+40*npcY, 40, 40);
		}


	}

	 public void updateBoard() throws Exception // sets the panel to update to the ranges of both players and players
	 {
		System.out.println("Updating Board");
		 draw(MainExecutable.getPlayer(),Color.BLUE, true);
		 System.out.println("Updating Enemy");
		 draw(getEnemy(), Color.BLACK, false);
		 System.out.println("Updating complete");
	 }
	 
	protected void btnFunction() {
		try 
		{
			this.btn.getParent().setVisible(false);
			Point location = this.popupLocation;
			try 
			{
				MainExecutable.getPlayer().moveTo(location, false);
				enemyTurn();
				cleanBoard();
				updateBoard();
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
				room.popupLocation.setLocation(component.getX()/(room.getWidth()/20),component.getY()/(room.getHeight()/20));
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	/**
	 * @return the popupLocation
	 */
	public Point getPopupLocation() {
		return popupLocation;
	}
	/**
	 * @param popupLocation the popupLocation to set
	 */
	public void setPopupLocation(Point popupLocation) {
		this.popupLocation = popupLocation;
	}
	/**
	 * @return the enemy
	 */
	public int getEnemyID() {
		return enemy;
	}
	/**
	 * @param enemy the enemyID to set
	 */
	public void setEnemyID(int enemy) {
		this.enemy = enemy;
	}
	/**
	 * @return the enemyImg
	 */
	public Image getEnemyImg() {
		return enemyImg;
	}
	/**
	 * @param enemyImg the enemyImg to set
	 */
	public void setEnemyImg(Image enemyImg) {
		this.enemyImg = enemyImg;
	}
	/**
	 * @return the north
	 */
	public int getNorth() {
		return north;
	}
	/**
	 * @param north the north to set
	 */
	public void setNorth(int north) {
		this.north = north;
	}
	/**
	 * @return the south
	 */
	public int getSouth() {
		return south;
	}
	/**
	 * @param south the south to set
	 */
	public void setSouth(int south) {
		this.south = south;
	}
	/**
	 * @return the west
	 */
	public int getWest() {
		return west;
	}
	/**
	 * @param west the west to set
	 */
	public void setWest(int west) {
		this.west = west;
	}
	/**
	 * @return the east
	 */
	public int getEast() {
		return east;
	}
	/**
	 * @param east the east to set
	 */
	public void setEast(int east) {
		this.east = east;
	}
	/**
	 * @return the board
	 */
	public JPanel[][] getBoard() {
		return board;
	}
	/**
	 * @param board the board to set
	 */
	public void setBoard(JPanel board[][]) {
		this.board = board;
	}
	/**
	 * @return the btn
	 */
	public JButton getBtn() {
		return btn;
	}
	/**
	 * @param btn the btn to set
	 */
	public void setBtn(JButton btn) {
		this.btn = btn;
	}
	/**
	 * @return the popupMenu
	 */
	public JPopupMenu getPopupMenu() {
		return popupMenu;
	}
	/**
	 * @param popupMenu the popupMenu to set
	 */
	public void setPopupMenu(JPopupMenu popupMenu) {
		this.popupMenu = popupMenu;
	}

	

}
	
