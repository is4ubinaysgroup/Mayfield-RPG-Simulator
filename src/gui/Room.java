package src.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
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
import src.MatchExtension;
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
	public static final int HALLMONITOR = -1;
	public static final int CARSON = 2;
	public static final int KOLBY = 3;
	public static final int MATTHEW = 4;
	public static final int MINA = 5;
	public static final int ZAC = 6;
	public static final int MRJONE = 7;
	/**
	 * Create the Variables
	 **/
	private boolean attacked = false;
	private boolean moved = false;
	
	private Point popupLocation = new Point();
	private NonPlayer enemy;
	private boolean showingMovement = true;//if true this will show movement if false this will show range.
	private int north = 0;
	private int south = 0;
	private int west = 0;
	private int east = 0;
	/**
	 * Create the  frame.
	 */
	private ImageFrame board[][]; //labels
	
	private JButton btn = new JButton(); // uses btnFunction
	
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
	
	// ------- constructors -------
	
	public Room(int north, int east, int south, int west, int enemyID)
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
				
					g.drawImage(Database.getBackground(), 0, 0, 800, 800, null); // gets background based on player level; would need to adjust for hall sequence
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
	} // Room constructor
	
	
	
	public Room(int north, int east, int south, int west, NonPlayer enemy) 
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
	} // Room constructor
	
	
	
	// ------- gets and sets -------
	public NonPlayer getEnemy() {return this.enemy;} // getEnemy method
	
	public boolean hasAttacked() {return attacked;}
	public void setAttacked(boolean attacked) {this.attacked = attacked;}

	public boolean hasMoved() {return moved;}
	public void setMoved(boolean moved) {this.moved = moved;}
	
	public Point getPopupLocation() {return popupLocation;}
	public void setPopupLocation(Point popupLocation) {this.popupLocation = popupLocation;}

	public int getNorth() {return north;}
	public void setNorth(int north) {this.north = north;}
	public int getSouth() {return south;}
	public void setSouth(int south) {this.south = south;}
	public int getWest() {return west;}
	public void setWest(int west) {this.west = west;}
	public int getEast() {return east;}
	public void setEast(int east) {this.east = east;}

	public JPanel[][] getBoard() {return board;}
	public void setBoard(ImageFrame board[][]) {this.board =  board;}
	
	public int getBoardWidth() 
	{
		return (19-(getEast()+getWest()));
	}
	
	public int getBoardHeight() 
	{
		return (19-(getSouth()+getNorth()));
	}

	public JButton getBtn() {return btn;}
	public void setBtn(JButton btn) {this.btn = btn;}

	public JPopupMenu getPopupMenu() {return popupMenu;}
	public void setPopupMenu(JPopupMenu popupMenu) {this.popupMenu = popupMenu;}

	public boolean isShowingMovement() {return showingMovement;}

	public void setShowingMovement(boolean showingMovement) {
		this.showingMovement = showingMovement;
		this.setVisible(false);
		cleanBoard();
		updateBoard();
		this.setVisible(true);
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

	} // placeLabels method
	
	
	
	private static NonPlayer getEnemy(int enemyID) throws Exception
	{
		/*
		 	public static final int BINAY = 0;
	public static final int GYMTEACHER = 1;
	public static final int HALLMONITOR = -1;
	public static final int CARSON = 2;
	public static final int KOLBY = 3;
	public static final int MATTHEW = 4;
	public static final int MINA = 5;
	public static final int ZAC = 6;
	public static final int MRJONE = 7;
		  
		  */
		switch(enemyID) 
		{
		case -1://HallMonitor
			return Database.hallMonitor;
		case 0 : //Binay
			return Database.binay;
		case 1: //GymTeacher
			return Database.gymTeacher;
		case 2:
			return Database.carson;
		case 3:
			return Database.kolby;
		case 4:
			return Database.matthew;
		case 5:
			return Database.mina;
		case 6:
			return Database.zac;
		case 7:
			return Database.mrJone;
		default:
			throw new Exception("No enemy");
		}
	} // getEnemy method; perhaps better placed in Database?
	
	

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
		
	} // cleanBoard method
	
	
	
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
					
					if (MainExecutable.getPlayer().getHealth() > 0 && this.enemy.getHealth() > 0) {
					board[xPos][yPos].setColor( mixColors(color, board[xPos][yPos].getColor() ));
					}
					
					board[xPos][yPos].removeImage();
				}
			}
		}
	}
	 
	
	
	protected void btnFunction() {
		
		if(isShowingMovement() && hasMoved() == false) {move();} // moves if the player hasn't moved and the button is in move mode.
		else if(isShowingMovement() && hasMoved() == true) 
		{
			try 
			{
				throw new Exception("Already moved");
			}
			catch(Exception e) 
			{
				new ErrorFrame(e).notifyIssue();
			}//TODO Disable move mode once user moved
		} // button is in Move mode; user already moved - would be better to optimize for disabling move once it's used in a turn
		else if(hasAttacked() == false)// it would be nearly impossible for the player to get move mode on and get here.
		{
			if(this.enemy.inRangeOf(MainExecutable.getPlayer())) 
			{
				attack();
			}
			else 
			{
				try 
				{
					throw new Exception("not in range");
				}
				catch(Exception e) 
				{
					new ErrorFrame(e).notifyIssue();//tells the player they're not in range by sending a notification.
				}
			}
		} // else if user hasn't attacked
		else //else means the player has moved and the player has attacked
		{
				new ErrorFrame(new Exception("You cannot do sanything so end your turn.")).notifyIssue();	
		} // else has attacked and not in Move mode?
		
		cleanBoard();
		updateBoard();	
		
	} // btnFunction method
	
	public void attack()
	{
		try 
		{
			MainExecutable.getPlayer().attack(this.enemy);
			healthCheckEnemy();
			setAttacked(true);
			
			BattlePanel.getCombatMenu().disableBackpack();
			Database.playSound(Database.getGunshot());
			
			if (hasMoved() == true) {skipTurn();} // end turn if moved and attacked already
		}
		catch(Exception e) 
		{
			new ErrorFrame(e).error();
		}	
	}
	
	public void move() 
	{
		try 
		{
			MainExecutable.getPlayer().moveTo(this.popupLocation, false);
			setMoved(true);
			BattlePanel.getCombatMenu().disableBackpack();
			Database.playSound(Database.getMoveSound());
			
			// end turn if attacked or can't attack and already moved
			if (hasAttacked() == true || this.enemy.inRangeOf(MainExecutable.getPlayer()) == false)  {skipTurn();}
		}
		catch(Exception e) 
		{
			new ErrorFrame(e).notifyIssue();
		}
	}
	
	
	/*
	public void faceAnother()
	{
		//this equation will give the direction in degrees: f= 45(By-Ay)/(Bx-Ax)
		
		
		double rotationRequired = Math.toRadians ((45*(enemy.getY() - MainExecutable.getPlayer().getY() )*(enemy.getX()- MainExecutable.getPlayer().getX())));
		double locationX = image.getWidth() / 2;
		double locationY = image.getHeight() / 2;
		AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		op.filter(image, null);
		// Drawing the rotated image at the required drawing locations
	}*/

	
	
	public void updateBoard()  // sets the panel to update to the ranges of both players and players
	{
		setVisible(false);
		draw(this.enemy, Color.BLACK, false);
		draw(MainExecutable.getPlayer(),Color.BLUE, true);

		try {
			board[this.enemy.getX()][this.enemy.getY()].setImage(Database.getSprite(this.enemy.getID()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// need to make image correspond to any enemy

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

	} // updateBoard method
	
	
	
	private static Color mixColors(Color color1, Color color2)
	{
		float factor = /*Alpha factor ->*/130 / 255f;/* <-- 225 is completely invisible to the eye.*/
		int red = (int) (color1.getRed() * (1 - factor) + color2.getRed() * factor);
		int green = (int) (color1.getGreen() * (1 - factor) + color2.getGreen() * factor);
		int blue = (int) (color1.getBlue() * (1 - factor) + color2.getBlue() * factor);
		int alpha = (int) (color1.getAlpha() * (1 - factor) + color2.getAlpha() * factor);
		return new Color(red, green, blue, alpha);
	} // mixColors method
 
	
	
	private static void addPopup(final Room room, final Component component, final JPopupMenu popup) {
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
				room.popupLocation.setLocation((component.getX() - (room.getEast()*40))/40, (component.getY()-(room.getSouth()*40))/40);
				System.out.println("X:"+(component.getX() - (room.getEast()*40))/40+", Y:"+ (component.getY()-(room.getSouth()*40))/40);
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	

	public void skipTurn() {

		try {
			enemy.runTurn(this);
			setAttacked(false);
			setMoved(false);
			BattlePanel.getCombatMenu().enableBackpack();
			
			healthCheckPlayer();

			cleanBoard();
			updateBoard();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			new ErrorFrame(e).notifyIssue();
		}
		
	} // skipTurn method
	

	
	public void resetLevel()
	{
		setAttacked(false);
		setMoved(false);
		BattlePanel.getCombatMenu().enableBackpack();
		showingMovement = true;
		//setShowingMovement(true);
		
		this.enemy.setPosition(new Point(19-(east+west),19-(south+north)));
		this.enemy.setHealth(this.enemy.getMaxHealth());
		this.enemy.setDefense(this.enemy.getMaxDefense());
		
		MainExecutable.getPlayer().setPosition(new Point(0,0)); // player's starting position
		MainExecutable.getPlayer().setDefense(MainExecutable.getPlayer().getMaxDefense()); // reset player's defense (i wasn't sure how recharging would work)
		MainExecutable.getPlayer().setHealth(MainExecutable.getPlayer().getMaxHealth());
		
		cleanBoard();
		updateBoard();
	
	} // resetLevel method

	
	
	public void healthCheckEnemy()
	{
		if(this.enemy.getHealth() <= 0)
		{
			resetLevel();
			MatchExtension.endResult(getEnemy(), true);	
		} // if the player wins
	} // healthCheckEnemy method
	
	
	
	public void healthCheckPlayer()
	{
		MainExecutable.getPlayer().setDefense(MainExecutable.getPlayer().getDefense()+1);
		if(MainExecutable.getPlayer().getHealth() <= 0) 
		{ 
			resetLevel();
			MatchExtension.endResult(getEnemy(), false);
		} // else the player loses
	}// healthCheckPlayer method
	
	
} // Room class