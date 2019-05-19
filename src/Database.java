package src;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

import src.character.Human;
import src.character.NonPlayer;
import src.character.Player;
import src.gui.MainExecutable;
import src.items.Item;
import src.items.Product;
import src.items.Weapon;


/*
Editing and contributing @Carson Fujita
Date: 
May 11th, 2019
moved criticalChange[] from weaponMethods to database and added public static
moved String names[] from weaponMethods to database and added public static
moved stats[] from weaponMethods to databaseand added public static
super confused
 */
/*
Coding @Carson Fujita
Date: 
May 12th, 2019
Tasks: Create weapons, and Products.
design saving for upgrades.
Completed:
Created Weapons.
created the save1,save2,save3 files and the file[] files
created hat, pencil, ruler, rubbber band, timbits, mcchicken,footlongsub, soda, tylenol,capacityupgrade, coffee,cappuccino, expresso, and orange juice.
 */ 

/*
05-12 Mina
fixed spelling of espresso, filled in getWeapon method, edited descriptions and added imagePaths for products
need to ask about what increase field is for damage upgrade (orange juice)
changed spacing / code grouping
*/

// 05-17 updated by Mina

/*
 * Carson
 * May 19th
 * worked on loadAssets of which I created and added loadImages and all bufferedImages needed.
 */

public class Database {
	
	public static final Color MAYFIELD_BLUE = new Color(14, 1, 141);
	public static final Color MAYFIELD_YELLOW = new Color(247, 221, 0);
	public  static final Color ALT_MAYFIELD_BLUE = new Color(52, 52, 104);
	public  static final Color ALT_MAYFIELD_YELLOW = new Color(246, 235 ,22);
	
		public static void loadAssets() throws Exception//loads all assets
		{
			try 
			{
				read(files[0]);
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			LoadImages();
		}//Assets
	
	
		//-------------------------------------------Image Loading.-------------------------
		
		public static BufferedImage getProductImage (String name) //mina created Database.
		{
			if (name.equals("Timbits")) {return Database.getImgTimbits();}
			else if (name.equals("McChicken")) {return Database.getImgMcchicken();}
			else if (name.equals("Foot Long Sub!")) {return Database.getImgFootLongSub();}
			else if (name.equals("Soda")) {return Database.getImgSoda();}
			else if (name.equals("Tylenol")) {return Database.getImgTylenol();}
			else if (name.equals("Capacity Upgrade")) {return Database.getImgCapacityUpgrade();}
			else if (name.equals("Coffee")) {return Database.getImgCoffee();}
			else if (name.equals("Cappucino")) {return Database.getImgCappuccino();}
			else if (name.equals("Expresso")) {return Database.getImgEspresso();}
			else {return Database.getImgOrangeJuice();} // "Orange Juice"
		} // getProduct method
		

		public static BufferedImage imgCapacityUpgrade; 
		public static BufferedImage imgCappuccino;
		public static BufferedImage imgCoffee;
		public static BufferedImage imgEspresso;
		public static BufferedImage imgFootlongsub;
		public static BufferedImage imgMcChicken;
		public static BufferedImage imgOrangeJuice;
		public static BufferedImage imgPlayer;
		public static BufferedImage imgRubberband;
		public static BufferedImage imgRuler;
		public static BufferedImage imgSoda;
		public static BufferedImage imgTimbits;
		public static BufferedImage imgTylenol;
		public static BufferedImage imgTeacher;
		public static BufferedImage imgBinay;
		public static BufferedImage imgHallMonitor;
		public static BufferedImage imgGymTeacher;
		public static BufferedImage MainMenuBackground;
		public static BufferedImage MapBackground;

		public static BufferedImage readImg(String filepath) throws Exception
		{
			return ImageIO.read(new File(filepath)); 
		}
		
		public static BufferedImage readImg(Item item) throws Exception
		{
			return ImageIO.read(new File(item.getImagePath()));
		}
		
		public static BufferedImage readImg(Human human) throws Exception
		{
			return ImageIO.read(new File(human.getImagePath()));
		}
		
		public static void LoadImages() throws Exception
		{
			imgCapacityUpgrade = readImg(capacityUpgrade);
			imgCappuccino =readImg(cappuccino);
			imgCoffee =readImg(coffee);
			imgEspresso =readImg(espresso);
			imgFootlongsub =readImg(footLongSub);
			imgSoda = readImg(soda);
			imgMcChicken =readImg(mcChicken);
			imgOrangeJuice =readImg(orangeJuice);
			imgRubberband =readImg(rubberband);
			imgRuler =readImg(ruler); 
			imgTimbits =readImg(timbits);
			imgTylenol =readImg(tylenol);
			MainMenuBackground =readImg("src/resources/Background.jpeg");
			MapBackground =readImg("src/resources/background2.png");
			//imgGymTeacher =readImg(gymTeacher);
			//imgBinay =readImg(binay);
			//imgHallMonitor =readImg(hallMonitor);
			//imgPlayer =readImg(MainExecutable.getPlayer());
		}
		


		// ------------------------------------------- save file configuration stuff ------------------------------------------- 
		
		public final Exception ReadIncompleteError = new Exception("Reading file was incomplete: Some data may be lost.");// this will throw if reading a file and obtains only part of the information.

	
		private static File[] files = new File[2];
		{
			files[0] = new File("src/saves/Save1.txt");
			files[1] = new File("src/saves/Save2.txt");
			files[2] = new File("src/saves/Save3.txt");
		}		
		

		public static void save(File file) throws Exception
		{
			
		} // save method
		
	
		public static void read(File file) throws Exception
		{
			BufferedReader reader = new BufferedReader(new FileReader(files[0]));
			for(int i = 0; i < files[0].length(); i++) //reads the document.
			{
				//TODO
			}
		} // read method
		
	
		public static void updateFile(File file)throws  Exception
		{
			
		} // updateFile method
	
	
	
		public static void loadSingle ()
		{
			try
			{
				BufferedReader input = new BufferedReader (new FileReader (files[0]));
				
				String line = input.readLine (); // read a line of data
				int health = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				int defense = Integer.parseInt(line);

				line = input.readLine ();       //read next line
				int maxDefense = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				int maxHealth = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				Weapon equippedWeapon = Database.getWeapon(line);
				
				line = input.readLine ();       //read next line
				String imagePath = line;


				// position always starts at 0,0
				
				line = input.readLine ();       //read next line
				int coins = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				int level = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				int numProducts = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				int numWeapons = Integer.parseInt(line);
				
				line = input.readLine ();       //read next line
				int productCapacity = Integer.parseInt(line);
				
				
				/* Player constructor (int health, int defense, int maxDefense, int maxHealth, Weapon equippedWeapon, String imagePath, int [] position, int coins, int level, int numProducts, int numWeapons, int productCapacity) */

				// position always starts at 0,0 (see constructor)
				int [] tempPosition = new int [2];
				
				MainExecutable.setPlayer(new Player (health, defense, maxDefense, maxHealth, equippedWeapon, imagePath, tempPosition, coins, level, numProducts, numWeapons,productCapacity));
				
				
				
				// ----------------------- read next line for products -----------------------
				
				line = input.readLine ();       //read next line for products
				String [] parts1 = line.split("-"); // split the line into parts for the fields

				if (!parts1 [0].equals("0"))
				{
					for (int i=0; i< numProducts; i++)
					{
						MainExecutable.getPlayer().addProduct(Database.getProduct(parts1[i]));
					} // for 0...numProducts-1
				} // if not empty
				
				
				
				// ----------------------- read next line for weapons -----------------------
				
				line = input.readLine ();       
				String [] parts2 = line.split("-"); // split the line into parts for the fields
				
				if (!parts2 [0].equals("0"))
				{
					for (int i=0; i< numWeapons; i++)
					{
						MainExecutable.getPlayer().addWeapon(Database.getWeapon(parts2[i]));
					} // for 0...numProducts-1
				} // if not empty
				
				
			} // try
			
			catch (Exception e)
			{
				System.out.println ("exception in loadSingle()" + "\n");
				
			} // catch
			
		} // loadSingle method
	
	
	
			
		public static void writeStarterSingle()
		{
			
			try
			{
				
				PrintWriter output = new PrintWriter (new FileWriter ("files[0]"));
				
				output.println("20");
				output.println("0");
				output.println("0");
				output.println("20");
				output.println("Pencil");
				output.println("resources/playerSprite.png");
				output.println("10");
				output.println("1");
				output.println("0");
				output.println("0");
				output.println("10");
				output.println("0");
				output.println("0");
							
				output.close (); // Close file.

			} // try
			catch (Exception e) 
			{
				System.out.println ("exception in writeStarterSingle");
			} // catch
			
			
		} // writeStarterSingle method
		
	
	
	//-------------------------npc Stuff
		public static NonPlayer hallMonitor = new NonPlayer("<name>", false);
		public static NonPlayer binay = new NonPlayer("Binay", true);
		public static NonPlayer gymTeacher = new NonPlayer("<gymteachersname>", false);
	
		// ------------------------------------------- weapon stuff -------------------------------------------
			
		public static int stats[][]= {//this array stores all the information for the weapon's beside critical chance and weapon names
			//  [damage]  [range]
			{4, 3},//sets the "hat" weapon damage
			{1, 1},//sets the "pencil" weapon damage
			{2, 1},//sets the "ruler" weapon damage
			{2, 3}//sets the "rubberBand" weapon damage
			};
		
		public static double criticalChance[] = {.20,.05,.15,.10};//sets the array and the values in the array for critical chances
		
		private static Weapon hat = new Weapon("Hat", stats[0][0],stats[0][1],criticalChance[0],Weapon.RANGEDTYPE, 0 );
		private static Weapon pencil = new Weapon("Pencil", stats[1][1],stats[1][1],criticalChance[0],Weapon.MELEETYPE, 0 );
		private static Weapon ruler  = new Weapon("Ruler", 10, "description", "src/resources/ruler.png", stats[2][0],stats[2][1],criticalChance[0],Weapon.ALLTYPE, 1 );
		private static Weapon rubberband = new Weapon("Rubber Band", 5, "description", "src/resources/rubberband.png", stats[3][0],stats[3][1],criticalChance[0],Weapon.RANGEDTYPE, 2);
	
	
		// gets and sets
		public static Weapon getHat() {return hat;}
		public static void setHat(Weapon hat) {Database.hat = hat;}

		public static Weapon getPencil() {return pencil;}
		public static void setPencil(Weapon pencil) {Database.pencil = pencil;}

		public static Weapon getRuler() {return ruler;}
		public static void setRuler(Weapon ruler) {Database.ruler = ruler;}
	
		public static Weapon getRubberband() {return rubberband;}
		public static void setRubberband(Weapon rubberband) {Database.rubberband = rubberband;}

	
	
		public static Weapon getWeapon(String name)
		{
			if (name.equals("Pencil")) {return Database.getPencil();}
			else if (name.equals("Hat")) {return Database.getHat();}
			else if (name.equals("Ruler")) {return Database.getRuler();}
			else {return Database.getRubberband();} // "Rubber Band"
	
		} //getWeapon method
	
	
	
		// ------------------------------------------- product stuff -------------------------------------------
	
		private static Product timbits = new Product("Timbits", Product.HEALTH, 10, 10,"+10 Health", "src/resources/timbits.png");
		private static Product mcChicken = new Product("McChicken", Product.HEALTH, 15, 20, "+15 Health", "src/resources/mcchicken.png");
		private static Product footLongSub = new Product("Foot Long Sub!", Product.HEALTH, 30, 50, "+30 Health", "src/resources/footlongsub.png");
		private static Product soda = new Product("Soda", Product.CRITICALCHANCE, 1, 20,"upgrades critical chance", "src/resources/soda.png");
		private static Product tylenol = new Product("Tylenol", Product.ARMOR, 5, 15,"+5 defense", "src/resources/tylenol.png");
		private static Product capacityUpgrade = new Product("Capacity Upgrade", Product.CAPACITY, 5, 50,"+5 product storage", "src/resources/capacityupgrade.png");
		private static Product coffee = new Product("Coffee", Product.MAXHEALTH, 20,32, "+20 Max Health", "src/resources/coffee.png");
		private static Product cappuccino = new Product("Cappuccino",Product.MAXHEALTH,40, 75,"+40 Max Health", "src/resources/cappuccino.png");
		private static Product espresso = new Product("Espresso",Product.MAXHEALTH,60,100,"+60 Max Health", "src/resources/espresso.png");
		private static Product orangeJuice = new Product("Orange Juice",Product.DAMAGE, 1, 30, "damage upgrade", "src/resources/orangejuice.png"); // not sure what increase would be for this

		// gets
		public static Product getTimbits() {return timbits;}
		public static Product getMcChicken() {return mcChicken;}
		public static Product getFootLongSub() {return footLongSub;}
		public static Product getSoda() {return soda;}
		public static Product getTylenol() {return tylenol;}
		public static Product getCapacityUpgrade() {return capacityUpgrade;}
		public static Product getCoffee() {return coffee;}
		public static Product getCappuccino() {return cappuccino;}
		public static Product getEspresso() {return espresso;}
		public static Product getOrangeJuice() {return orangeJuice;}



		public static Product getProduct (String name) //mina created Database.
		{
			if (name.equals("Timbits")) {return Database.getTimbits();}
			else if (name.equals("McChicken")) {return Database.getMcChicken();}
			else if (name.equals("Foot Long Sub!")) {return Database.getFootLongSub();}
			else if (name.equals("Soda")) {return Database.getSoda();}
			else if (name.equals("Tylenol")) {return Database.getTylenol();}
			else if (name.equals("Capacity Upgrade")) {return Database.getCapacityUpgrade();}
			else if (name.equals("Coffee")) {return Database.getCoffee();}
			else if (name.equals("Cappuccino")) {return Database.getCappuccino();}
			else if (name.equals("Espresso")) {return Database.getEspresso();}
			else {return Database.getOrangeJuice();} // "Orange Juice"
		} // getProduct method


		/**
		 * @return the imgCapacityUpgrade
		 */
		public static BufferedImage getImgCapacityUpgrade() {
			return imgCapacityUpgrade;
		}


		/**
		 * @param imgCapacityUpgrade the imgCapacityUpgrade to set
		 */
		public static void setImgCapacityUpgrade(BufferedImage imgCapacityUpgrade) {
			Database.imgCapacityUpgrade = imgCapacityUpgrade;
		}


		/**
		 * @return the imgCappuccino
		 */
		public static BufferedImage getImgCappuccino() {
			return imgCappuccino;
		}


		/**
		 * @param imgCappuccino the imgCappuccino to set
		 */
		public static void setImgCappuccino(BufferedImage imgCappuccino) {
			Database.imgCappuccino = imgCappuccino;
		}


		/**
		 * @return the imgCoffee
		 */
		public static BufferedImage getImgCoffee() {
			return imgCoffee;
		}


		/**
		 * @param imgCoffee the imgCoffee to set
		 */
		public static void setImgCoffee(BufferedImage imgCoffee) {
			Database.imgCoffee = imgCoffee;
		}


		/**
		 * @return the imgEspresso
		 */
		public static BufferedImage getImgEspresso() {
			return imgEspresso;
		}


		/**
		 * @param imgEspresso the imgEspresso to set
		 */
		public static void setImgEspresso(BufferedImage imgEspresso) {
			Database.imgEspresso = imgEspresso;
		}


		/**
		 * @return the imgFootlongsub
		 */
		public static BufferedImage getImgFootLongSub() {
			return imgFootlongsub;
		}


		/**
		 * @param imgFootlongsub the imgFootlongsub to set
		 */
		public static void setImgFootlongsub(BufferedImage imgFootlongsub) {
			Database.imgFootlongsub = imgFootlongsub;
		}

		/**
		 * @return the imgMcChicken
		 */
		public static BufferedImage getImgMcchicken() {
			return imgMcChicken;
		}


		/**
		 * @param imgMcChicken the imgMcChicken to set
		 */
		public static void setImgMcchicken(BufferedImage imgMcChicken) {
			Database.imgMcChicken = imgMcChicken;
		}


		/**
		 * @return the imgOrangeJuice
		 */
		public static BufferedImage getImgOrangeJuice() {
			return imgOrangeJuice;
		}


		/**
		 * @param imgOrangeJuice the imgOrangeJuice to set
		 */
		public static void setImgOrangejuice(BufferedImage imgOrangeJuice) {
			Database.imgOrangeJuice = imgOrangeJuice;
		}


		/**
		 * @return the imgPlayer
		 */
		public static BufferedImage getImgPlayer() {
			return imgPlayer;
		}


		/**
		 * @param imgPlayer the imgPlayer to set
		 */
		public static void setImgPlayer(BufferedImage imgPlayer) {
			Database.imgPlayer = imgPlayer;
		}


		/**
		 * @return the imgRubberband
		 */
		public static BufferedImage getImgRubberband() {
			return imgRubberband;
		}


		/**
		 * @param imgRubberband the imgRubberband to set
		 */
		public static void setImgRubberband(BufferedImage imgRubberband) {
			Database.imgRubberband = imgRubberband;
		}


		/**
		 * @return the imgTimbits
		 */
		public static BufferedImage getImgTimbits() {
			return imgTimbits;
		}


		/**
		 * @param imgTimbits the imgTimbits to set
		 */
		public static void setImgTimbits(BufferedImage imgTimbits) {
			Database.imgTimbits = imgTimbits;
		}


		/**
		 * @return the imgRuler
		 */
		public static BufferedImage getImgRuler() {
			return imgRuler;
		}


		/**
		 * @param imgRuler the imgRuler to set
		 */
		public static void setImgRuler(BufferedImage imgRuler) {
			Database.imgRuler = imgRuler;
		}


		/**
		 * @return the imgTylenol
		 */
		public static BufferedImage getImgTylenol() {
			return imgTylenol;
		}


		/**
		 * @param imgTylenol the imgTylenol to set
		 */
		public static void setImgTylenol(BufferedImage imgTylenol) {
			Database.imgTylenol = imgTylenol;
		}


		/**
		 * @return the imgTeacher
		 */
		public static BufferedImage getImgTeacher() {
			return imgTeacher;
		}


		/**
		 * @param imgTeacher the imgTeacher to set
		 */
		public static void setImgTeacher(BufferedImage imgTeacher) {
			Database.imgTeacher = imgTeacher;
		}


		/**
		 * @return the imgBinay
		 */
		public static BufferedImage getImgBinay() {
			return imgBinay;
		}


		/**
		 * @param imgBinay the imgBinay to set
		 */
		public static void setImgBinay(BufferedImage imgBinay) {
			Database.imgBinay = imgBinay;
		}


		/**
		 * @return the imgHallMonitor
		 */
		public static BufferedImage getImgHallMonitor() {
			return imgHallMonitor;
		}


		/**
		 * @param imgHallMonitor the imgHallMonitor to set
		 */
		public static void setImgHallMonitor(BufferedImage imgHallMonitor) {
			Database.imgHallMonitor = imgHallMonitor;
		}


		/**
		 * @return the imgGymTeacher
		 */
		public static BufferedImage getImgGymTeacher() {
			return imgGymTeacher;
		}


		/**
		 * @param imgGymTeacher the imgGymTeacher to set
		 */
		public static void setImgGymTeacher(BufferedImage imgGymTeacher) 
		{
			Database.imgGymTeacher = imgGymTeacher;
		}
		
		public static BufferedImage getImgSoda() {
			return Database.imgSoda;
		}
		
		public static void setImgSoda(BufferedImage imgSoda) {
			Database.imgSoda = imgSoda;
		}


		public static BufferedImage getMainMenuBackground() {
			return MainMenuBackground;
		}
				 
				 
				 
	} // Database class
