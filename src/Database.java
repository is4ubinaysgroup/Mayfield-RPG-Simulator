package src;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;

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



public class Database {
		
		// ------------------------------------------- save file configuration stuff ------------------------------------------- 
		
		public final Exception ReadIncompleteError = new Exception("Reading file was incomplete: Some data may be lost.");// this will throw if reading a file and obtains only part of the information.

	
		private static File[] files = new File[2];
		{
			files[0] = new File("saves\\Save1.txt");
			files[1] = new File("saves\\Save2.txt");
			files[2] = new File("saves\\Save3.txt");
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

				for (int i=0; i< numProducts; i++)
				{
					MainExecutable.getPlayer().addProduct(Database.getProduct(parts1[i]));
				} // for 0...numProducts-1
				
				
				// ----------------------- read next line for weapons -----------------------
				
				line = input.readLine ();       
				String [] parts2 = line.split("-"); // split the line into parts for the fields
				
				for (int i=0; i< numWeapons; i++)
				{
					MainExecutable.getPlayer().addWeapon(Database.getWeapon(parts2[i]));
				} // for 0...numProducts-1
				
				
			} // try
			
			catch (Exception e)
			{
				System.out.println ("exception in loadSingle()" + "\n");
				
			} // catch
			
		} // loadSingle method
	
	
	
		// ------------------------------------------- weapon stuff -------------------------------------------
	
		// Zac's work that was moved from Weapon class: Stats[][], criticalChance[], and names[]
	
		public static int stats[][]=new int[3][2];{//this array stores all the information for the weapon's beside critical chance and weapon names
			//  [damage]  [range]
			stats[0][0]=4; stats[0][1]=3;//sets the "hat" weapon damage
			stats[1][0]=1; stats[1][1]=1;//sets the "pencil" weapon damage
			stats[2][0]=2; stats[2][1]=1;//sets the "ruler" weapon damage
			stats[3][0]=2; stats[3][1]=3;//sets the "rubberBand" weapon damage
		}
		
		public static double criticalChance[];{//sets the array and the values in the array for critical chances 
			criticalChance[0]=.20;
			criticalChance[1]=.05;
			criticalChance[2]=.15;
			criticalChance[3]=.10;
		}
		
		public static String names[]=new String[4];{ //this array stores all the names of the weapons and is used to find which row the weapon's stats in 
			names[0]="hat";
			names[1]="pencil";
			names[2]="ruler";
			names[3]="rubberBand";
		}
		
	
			
		private static Weapon hat = new Weapon("Hat", stats[0][0],stats[0][1],criticalChance[0],Weapon.RANGEDTYPE, 0 );
		private static Weapon pencil = new Weapon("Pencil", stats[0][1],stats[0][1],criticalChance[0],Weapon.MELEETYPE, 0 );

		private static Weapon ruler  = new Weapon("Ruler", 10, "description", "resources/ruler.png", stats[0][2],stats[0][1],criticalChance[0],Weapon.ALLTYPE, 1 );
		private static Weapon rubberband = new Weapon("Rubber Band", 5, "description", "resources/rubberband.png", stats[0][3],stats[0][1],criticalChance[0],Weapon.RANGEDTYPE, 2);
	
	
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
	
		private static Product timbits = new Product("Timbits", Product.HEALTH, 10, 10,"+10 Health", "/resources/timbits.png");
		private static Product mcChicken = new Product("McChicken", Product.HEALTH, 15, 20, "+15 Health", "/resources/mcchicken.png");
		private static Product footLongSub = new Product("Foot Long Sub!", Product.HEALTH, 30, 50, "+30 Health", "/resources/footlongsub.png");
		private static Product soda = new Product("Soda", Product.CRITICALCHANCE, 1, 20,"upgrades critical chance", "/resources/soda.png");
		private static Product tylenol = new Product("Tylenol", Product.ARMOR, 5, 15,"+5 defense", "/resources/tylenol.png");
		private static Product capacityUpgrade = new Product("Capacity Upgrade", Product.CAPACITY, 5, 50,"+5 product storage", "/resources/capacityupgrade.png");
		private static Product coffee = new Product("Coffee", Product.MAXHEALTH, 20,32, "+20 Max Health", "/resources/coffee.png");
		private static Product cappuccino = new Product("Cappuccino",Product.MAXHEALTH,40, 75,"+40 Max Health", "/resources/cappuccino.png");
		private static Product espresso = new Product("Espresso",Product.MAXHEALTH,60,100,"+60 Max Health", "/resources/espresso.png");
		private static Product orangeJuice = new Product("Orange Juice",Product.DAMAGE, 1, 30, "damage upgrade", "/resources/orangejuice.png"); // not sure what increase would be for this

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



		public static Product getProduct (String name) //mina created this.
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
				 
				 
				 
	} // Database class
