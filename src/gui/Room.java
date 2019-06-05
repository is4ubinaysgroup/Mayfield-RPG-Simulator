package src.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

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
	private boolean attacked = false;
	private boolean moved = false;
	private Point popupLocation = new Point();
	private NonPlayer enemy;
	private boolean showingMovement =true;//if true this will show movement if false this will show range.
	private int north = 0;
	private int south = 0;
	private int west = 0;
	private int east = 0;
	/**
	 * Create the  frame.
	 */
	private ImageFrame board[][]; //labels
	private JButton btn = new JButton();
	
	private JPopupMenu popupMenu = new JPopupMenu();
	
	/**
	 * 					System.out.println("Player X:" + MainExecutable.getPlayer().getX()+", Player Y:"+ MainExecutable.getPlayer().getY());

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
	public Room( int north, int east, int south, int west, int enemyID)
	{
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		
		
		
		try 
		{
			this.enemy = getEnemy(enemyID);
		} catch (Exception e) 
		{// TODO There is no valid enemy
			new ErrorFrame(e).error();
		}
		
		this.enemy.setPosition(new Point(19-(east+west),19-(south+north)));
		MainExecutable.getPlayer().setPosition(new Point(0,0));
		
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
		this.btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				btnFunction();
			}

			}); 
		 
		 /**
		  * placing Labels
		  */
		popupMenu.add(this.btn);
		placeLabels();
		add(background);
		System.out.println("finished");
		try 
		{
			cleanBoard();
			updateBoard();
		} 
		catch (Exception e) 
		{
			new ErrorFrame(e).notifyIssue();
		}
	}
	
	public Room( int north, int east, int south, int west, NonPlayer enemy) 
	{
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		this.enemy = enemy;

		
		this.enemy.setPosition(new Point(19-(east+west),19-(south+north)));
		MainExecutable.getPlayer().setPosition(new Point(0,0));
		
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
		this.btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				btnFunction();
			}

			}); 
		 
		 /**
		  * placing Labels
		  */
		popupMenu.add(this.btn);
		placeLabels();
		add(background);
		System.out.println("finished");
		try 
		{
			cleanBoard();
			updateBoard();
		} 
		catch (Exception e) 
		{
			new ErrorFrame(e).notifyIssue();
		}
	}
	
	private void placeLabels() 
	{ 
		this.board = new ImageFrame[20 - (getEast()+getWest())][ 20 - (getSouth()+getNorth())] ;
		
		for(int xPos = 0 ; xPos != 20 - (getEast()+getWest()); xPos++) 
		{
			for(int yPos = 0 ; yPos != 20 - (getSouth()+getNorth()); yPos++ ) 
			{//TODO
				this.board[xPos][yPos] = new ImageFrame();
				this.board[xPos][yPos].setColor(new Color(55,55,55,40));
				this.board[xPos][yPos].setBounds(0+40*getEast()+40*xPos,0+40*getSouth() +40*yPos, 40, 40);
				addPopup(this,this.board[xPos][yPos], this.popupMenu); 
				add(this.board[xPos][yPos]);
			}
		}		

	}
	
	
	public NonPlayer getEnemy()
	{
		return this.enemy;
	}
	
	private static NonPlayer getEnemy(int enemyID) throws Exception
	{
		switch(enemyID) 
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
	
	

	
	
	protected void cleanBoard() 
	{
			for(int xPos = 0 ; xPos != 20 - (east+west); xPos++) 
			{
			for(int yPos = 0 ; yPos != 20 - (south+north); yPos++ ) 
			{
				board[xPos][yPos].setColor(new Color(225,225,225,0));
				board[xPos][yPos].removeImage();
			}
		}
		
	}
	
	private void draw(Human human, Color color, boolean player)  
	{
		/*if(!(human.getEquippedWeapon() != null)) 
		{
			throw new Exception("Human contains no EquippedWeapon. ");
		}*/

		popupMenu.getComponent().setVisible(false);
		int range = human.getEquippedWeapon().getRange();
		int npcX = human.getX();
		int npcY = human.getY();
		if(isShowingMovement()) 
		{
			range = Human.MOVEMENT;
		}
		
		for(int xPos = npcX-range; xPos!= npcX+range+1; xPos++) 
		{
			for(int yPos = npcY+range; yPos != npcY-range-1; yPos-- ) 
			{
				if(xPos >= 20-(getWest()+getEast()) || yPos>= 20-(getNorth()+getSouth()) || yPos < 0 || xPos <0) 
				{
					//System.out.println("Cannot place tile at: Player:" + player +", x:" + xPos +", y:" + yPos);
				}
				else 
				{
					board[xPos][yPos].setColor( mixColors(color, board[xPos][yPos].getColor() ));
					board[xPos][yPos].removeImage();
				}
			}
		}
	}
	 
	protected void btnFunction() {
		Point location = this.popupLocation;
		if(isShowingMovement() && hasMoved() == false) 
		{
			try 
			{
				MainExecutable.getPlayer().moveTo(location, false);
				setMoved(true);
			}
			catch(Exception e) 
			{
				new ErrorFrame(e).notifyIssue();
			}

			cleanBoard();
			updateBoard();
			/*
			 * 
			 * 
			 */
		}
		else if(isShowingMovement() && hasMoved() == true) 
		{
			try 
			{
				throw new Exception("Already moved");
			}
			catch(Exception e) 
			{
				new ErrorFrame(e).notifyIssue();
			}//TODO
		}
		else if(hasAttacked() == false)
		{
			if(this.enemy.inRangeOf(MainExecutable.getPlayer())) 
			{

				try 
				{
					MainExecutable.getPlayer().attack(this.enemy);

					setAttacked(true);
				}
				catch(Exception e) 
				{
					new ErrorFrame(e).error();
				}
				cleanBoard();
				updateBoard();	//TODO
			}
			else 
			{
				try 
				{
					throw new Exception("not in range");
				}
				catch(Exception e) 
				{
					new ErrorFrame(e).notifyIssue();
				}
			}
		}
		else 
		{
		
			try {
				enemy.runTurn(this);
				setAttacked(false);
				setMoved(false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				new ErrorFrame(e).notifyIssue();
			}
			
		}

	}
	
	public void updateBoard()  // sets the panel to update to the ranges of both players and players
	{
		if(this.enemy.getHealth() == 0) 
		{
			MainExecutable.getPlayer().setLevel(0);
			GUIExtension1.endBattle();
			GUIExtension1.switchPane(Navigation.getPane());
		}
		else if(MainExecutable.getPlayer().getHealth() == 0) 
		{
			MainExecutable.getPlayer().setLevel(1);
			MainExecutable.getPlayer().setCoins(MainExecutable.getPlayer().getCoins()+10);
			MainExecutable.getPlayer().addWeapon(enemy.getEquippedWeapon());
			GUIExtension1.endBattle();
			GUIExtension1.switchPane(Navigation.getPane());

		}
		else {
		
		setVisible(false);
		draw(this.enemy, Color.BLACK, false);
		draw(MainExecutable.getPlayer(),Color.BLUE, true);
		board[this.enemy.getX()][this.enemy.getY()].setImage(Database.getImgGymTeacher());
		board[MainExecutable.getPlayer().getX()][MainExecutable.getPlayer().getY()].setImage(Database.getImgPlayer() );
		if(isShowingMovement()) 
		{
			this.btn.setText("Move here");
		}
		else 
		{
			this.btn.setText("Attack here");
		}
		CombatMenu.update(this.enemy); 
		setVisible(true);

		}
	}
	
	private static Color mixColors(Color color1, Color color2)
	{
		float factor = /*Alpha factor ->*/130 / 255f;/* <-- 225 is completely invisible to the eye.*/
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
				room.popupLocation.setLocation((component.getX() - (room.getEast()*40))/40, (component.getY()-(room.getSouth()*40))/40);//TODO
				System.out.println("X:"+(component.getX() - (room.getEast()*40))/40+", Y:"+ (component.getY()-(room.getSouth()*40))/40);
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
	public void setBoard(ImageFrame board[][]) {
		this.board =  board;
	}
	public int getBoardWidth() 
	{
		return (19-(getEast()+getWest()));
	}
	public int getBoardHeight() 
	{
		return (19-(getSouth()+getNorth()));
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

	public boolean isShowingMovement() {
		return showingMovement;
	}

	public void setShowingMovement(boolean showingMovement) {
		this.showingMovement = showingMovement;
		this.setVisible(false);
		cleanBoard();
		updateBoard();
		this.setVisible(true);
	}

	/**
	 * @return the attacked
	 */
	public boolean hasAttacked() {
		return attacked;
	}

	/**
	 * @param attacked the attacked to set
	 */
	public void setAttacked(boolean attacked) {
		this.attacked = attacked;
	}

	/**
	 * @return the moved
	 */
	public boolean hasMoved() {
		return moved;
	}

	/**
	 * @param moved the moved to set
	 */
	public void setMoved(boolean moved) {
		this.moved = moved;
	}

	public void skipTurn() {

		try {
			enemy.runTurn(this);
			setAttacked(false);
			setMoved(false);
			cleanBoard();
			updateBoard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			new ErrorFrame(e).notifyIssue();
		}
		
	}

	
	

}



	
