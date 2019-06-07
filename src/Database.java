package src;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import src.character.Human;
import src.character.NonPlayer;
import src.character.Player;
import src.gui.BattlePanel;
import src.gui.MainExecutable;
import src.gui.Room;
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

/*
05-20 Mina
finished single save file methods; working at this point but might need to be updated later
fixed one spelling error of espresso
 */

/*
05-21 Mina
fixed error with using == instead of .equals for String causing wrong weapon setting and rubber band to display incorrectly in shop
fixed spelling error of cappuccino causing its image to display incorrently
added descriptions for ruler and rubber band
 */


/*
05-24 and 05-25 Mina
changed spacing so everything's more organized
added walmart image (used by Map.java)
added some sound stuff
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
			//read(files[0]);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// ------------------------------------------- Image Loading -------------------------------------------

	// ------- readImg methods -------- 			pass file path, Item, or Human
	// might have to be Player or NonPlayer? - Mina

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
		imgClassroom =readImg("src/resources/room.jpg");
		imgWalmart = readImg ("src/resources/walmart.jpg");
		imgGymTeacher =readImg("src/resources/GymTeacher.png");
		//imgBinay =readImg(binay);
		imgHallMonitor =readImg("src/resources/HallMonitor.png");
		imgPlayer = readImg("src/resources/playerSprite.png"); // this method is called before user can click continue or new game
		imgGym = readImg("src/resources/Gym.png");
		imgHall = readImg("src/resources/Hall.png");
	} // LoadImages method






	// ------- imgPlayer -------
	public static BufferedImage imgPlayer;
	public static BufferedImage getImgPlayer() {return imgPlayer;}
	public static void setImgPlayer(BufferedImage imgPlayer) {Database.imgPlayer = imgPlayer;}


	// ------- imgTeacher -------
	public static BufferedImage imgTeacher;
	public static BufferedImage getImgTeacher() {return imgTeacher;}
	public static void setImgTeacher(BufferedImage imgTeacher) {Database.imgTeacher = imgTeacher;}


	// ------- MainMenuBackground -------
	public static BufferedImage MainMenuBackground;

	public static BufferedImage getMainMenuBackground() {return MainMenuBackground;}


	// ------- imgHall -------
	private static BufferedImage imgHall;

	public static Image getImgHall() {return Database.imgHall;}


	// ------- imgGyn -------
	private static BufferedImage imgGym;

	public static Image getImgGym() {return Database.imgGym;}
		
		
	// ------- imgClassroom -------
	private static BufferedImage imgClassroom;

	public static Image getClassroom() {return Database.imgClassroom;}
	
	
	//---------
	public static Image getBackground() 
	{//TODO incorporate hallways
		switch(MainExecutable.getPlayer().getLevel()) 
		{
		case 0:
			return Database.imgGym;
		default: 
			return Database.imgClassroom;
		}
	
	}
		
		
	
	// ------- MapBackground -------
	public static BufferedImage MapBackground;


	// ------- imgWalmart -------
	public static BufferedImage imgWalmart;
	public static BufferedImage getImgWalmart() {return imgWalmart;}




	
	
	// ------------------------------------------- sound effects -------------------------------------------

	public final static File HOVER_SOUND1 = new File ("src/resources/rolloverSound.wav");
	public static File getHoverSound1 () {return HOVER_SOUND1;}

	public final static File SELECT_TONE1 = new File ("src/resources/selectTone.wav");
	public static File getSelectTone1 () {return SELECT_TONE1;}

	public final static File DREAMY_MALLET_NOTIFICATION = new File ("src/resources/dreamyMallet.wav");
	public static File getDreamyMallet () {return DREAMY_MALLET_NOTIFICATION;}

	public final static File PAGE_TURN_SOUND = new File ("src/resources/pageTurnSound.wav");
	public static File getPageTurnSound () {return PAGE_TURN_SOUND;}

	public final static File MOO_SOUND = new File ("src/resources/mooSound.wav");
	public static File getMooSound () {return MOO_SOUND;}

	public final static File BACKPACK_BTN_SOUND = new File ("src/resources/zipperSound.wav");
	public static File getBackpackBtnSound () {return BACKPACK_BTN_SOUND;}
	
	public final static File ERROR_TONE = new File ("src/resources/ErrorTone.wav");
	public static File getErrorTone () {return ERROR_TONE;}
	
	public final static File LOCKER_SOUND = new File ("src/resources/LockerSound.wav");
	public static File getLockerSound () {return LOCKER_SOUND;}
	
	public final static File CASH_REGISTER_SOUND = new File ("src/resources/cashRegister.wav");
	public static File getCashRegister () {return CASH_REGISTER_SOUND;}
	
	public final static File FOOTSTEPS = new File ("src/resources/footSteps.wav");
	public static File getFootsteps () {return FOOTSTEPS;}
	
	public final static File RETRO_GUNSHOT = new File ("src/resources/retroGunshot.wav");
	public static File getGunshot () {return RETRO_GUNSHOT;}
	
	public final static File HIT = new File ("src/resources/hit.wav");
	public static File getHit () {return HIT;}
	
	public final static File MOVE_SOUND = new File ("src/resources/moveSound.wav");
	public static File getMoveSound () {return MOVE_SOUND;}
	
	public final static File MUSICAL_NEGATIVE = new File ("src/resources/retro_musical_negative.wav");
	public static File getMusicalNegative () {return MUSICAL_NEGATIVE;}
	


	public static void playSound (File file) throws UnsupportedAudioFileException, LineUnavailableException, IOException
	{
		AudioInputStream audio = AudioSystem.getAudioInputStream(file); // get the audio data from file

		Clip segment = AudioSystem.getClip();

		segment.open(audio);
		segment.setFramePosition(0); 
		segment.start();
		segment.drain();

	} // playSound method






	// ------------------------------------------- item images for shop -------------------------------------------

	public static BufferedImage imgCapacityUpgrade; 
	public static BufferedImage imgCappuccino;
	public static BufferedImage imgCoffee;
	public static BufferedImage imgEspresso;
	public static BufferedImage imgFootlongsub;
	public static BufferedImage imgMcChicken;
	public static BufferedImage imgOrangeJuice;
	public static BufferedImage imgSoda;
	public static BufferedImage imgTimbits;
	public static BufferedImage imgTylenol;

	public static BufferedImage imgRubberband;
	public static BufferedImage imgRuler;



	public static BufferedImage getProductImage (String name)
	{
		if (name.equals("Timbits")) {return Database.getImgTimbits();}
		else if (name.equals("McChicken")) {return Database.getImgMcchicken();}
		else if (name.equals("Foot Long Sub!")) {return Database.getImgFootLongSub();}
		else if (name.equals("Soda")) {return Database.getImgSoda();}
		else if (name.equals("Tylenol")) {return Database.getImgTylenol();}
		else if (name.equals("Capacity Upgrade")) {return Database.getImgCapacityUpgrade();}
		else if (name.equals("Coffee")) {return Database.getImgCoffee();}
		else if (name.equals("Cappuccino")) {return Database.getImgCappuccino();}
		else if (name.equals("Espresso")) {return Database.getImgEspresso();}

		else if (name.equals("Rubber Band")) {return Database.getImgRubberband();}
		else if (name.equals("Ruler")) {return Database.getImgRuler();}

		else {return Database.getImgOrangeJuice();} // "Orange Juice"
	} // getProductImage method



	// weapon image gets and sets
	public static BufferedImage getImgRubberband() {return imgRubberband;}
	public static void setImgRubberband(BufferedImage imgRubberband) {Database.imgRubberband = imgRubberband;}

	public static BufferedImage getImgRuler() {return imgRuler;}
	public static void setImgRuler(BufferedImage imgRuler) {Database.imgRuler = imgRuler;}

	// product image gets and sets
	public static BufferedImage getImgCapacityUpgrade() {return imgCapacityUpgrade;}
	public static void setImgCapacityUpgrade(BufferedImage imgCapacityUpgrade) {Database.imgCapacityUpgrade = imgCapacityUpgrade;}

	public static BufferedImage getImgCappuccino() {return imgCappuccino;}
	public static void setImgCappuccino(BufferedImage imgCappuccino) {Database.imgCappuccino = imgCappuccino;}

	public static BufferedImage getImgCoffee() {return imgCoffee;}
	public static void setImgCoffee(BufferedImage imgCoffee) {Database.imgCoffee = imgCoffee;}

	public static BufferedImage getImgEspresso() {return imgEspresso;}
	public static void setImgEspresso(BufferedImage imgEspresso) {Database.imgEspresso = imgEspresso;}

	public static BufferedImage getImgFootLongSub() {return imgFootlongsub;}
	public static void setImgFootlongsub(BufferedImage imgFootlongsub) {Database.imgFootlongsub = imgFootlongsub;}

	public static BufferedImage getImgMcchicken() {return imgMcChicken;}
	public static void setImgMcchicken(BufferedImage imgMcChicken) {Database.imgMcChicken = imgMcChicken;}

	public static BufferedImage getImgOrangeJuice() {return imgOrangeJuice;}
	public static void setImgOrangejuice(BufferedImage imgOrangeJuice) {Database.imgOrangeJuice = imgOrangeJuice;}

	public static BufferedImage getImgTimbits() {return imgTimbits;}
	public static void setImgTimbits(BufferedImage imgTimbits) {Database.imgTimbits = imgTimbits;}

	public static BufferedImage getImgTylenol() {return imgTylenol;}
	public static void setImgTylenol(BufferedImage imgTylenol) {Database.imgTylenol = imgTylenol;}

	public static BufferedImage getImgSoda() {return Database.imgSoda;}
	public static void setImgSoda(BufferedImage imgSoda) {Database.imgSoda = imgSoda;}






	// ------------------------------------------- weapon object stuff -------------------------------------------

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
	private static Weapon ruler  = new Weapon("Ruler", 10, "measuring tool", "src/resources/ruler.png", stats[2][0],stats[2][1],criticalChance[0],Weapon.ALLTYPE, 1 );
	private static Weapon rubberband = new Weapon("Rubber Band", 5, "stretchy", "src/resources/rubberband.png", stats[3][0],stats[3][1],criticalChance[0],Weapon.RANGEDTYPE, 2);


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






	// ------------------------------------------- product object stuff -------------------------------------------

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






	// ------------------------------------------- save file configuration stuff ------------------------------------------- 

	public final Exception ReadIncompleteError = new Exception("Reading file was incomplete: Some data may be lost.");// this will throw if reading a file and obtains only part of the information.


	private static File[] files =
		{
				new File("src/saves/Save1.txt"),
				new File("src/saves/Save2.txt"),
				new File("src/saves/Save3.txt"),
		};		



	public static void loadSingle ()
	{
		try
		{
			BufferedReader input = new BufferedReader (new FileReader ("src/saves/Save1.txt"));

			String line = input.readLine (); // read a line of data
			int health = Integer.parseInt(line);

			line = input.readLine ();       //read next line
			int defense = Integer.parseInt(line);

			line = input.readLine ();       //read next line
			int maxDefense = Integer.parseInt(line);

			line = input.readLine ();       //read next line
			int maxHealth = Integer.parseInt(line);

			line = input.readLine ();       //read next line
			Weapon equippedWeapon;

			String [] EWParts = line.split("-"); 

			String EWName = EWParts[0];				

			if (EWName.equals("Pencil") || EWName.equals("Hat"))
			{

				int EWDamage = Integer.parseInt(EWParts[1]);
				int EWRange = Integer.parseInt(EWParts[2]);
				double EWCriticalChance = Double.parseDouble(EWParts[3]);
				int EWType = Integer.parseInt(EWParts[4]);
				int EWRangedDamage = Integer.parseInt(EWParts[5]);

				equippedWeapon = new Weapon(EWName, EWDamage, EWRange, EWCriticalChance, EWType, EWRangedDamage);
			} // if
			else
			{
				int EWCost = Integer.parseInt(EWParts[1]);
				String EWDescription = EWParts[2];
				String EWImagePath = EWParts[3];
				int EWDamage = Integer.parseInt(EWParts[4]);
				int EWRange = Integer.parseInt(EWParts[5]);
				double EWCriticalChance = Double.parseDouble(EWParts[6]);
				int EWType = Integer.parseInt(EWParts[7]);
				int EWRangedDamage = Integer.parseInt(EWParts[8]);

				equippedWeapon = new Weapon(EWName, EWCost, EWDescription, EWImagePath, EWDamage, EWRange, EWCriticalChance, EWType, EWRangedDamage);
			} // else shop weapon


			if (EWName.equals ("Pencil")){setPencil(equippedWeapon);}
			else if (EWName.equals ("Hat")){setHat(equippedWeapon);}
			else if (EWName.equals ("Ruler")){setRuler (equippedWeapon);}
			else{setRubberband(equippedWeapon);} // "Rubber Band"

			equippedWeapon = Database.getWeapon(EWName);



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
			Point tempPosition = new Point(0,0);

			MainExecutable.setPlayer(new Player (health, defense, maxDefense, maxHealth, equippedWeapon, imagePath, tempPosition, coins, level, numProducts, numWeapons,productCapacity));



			// ----------------------- read next line for products -----------------------

			line = input.readLine ();       //read next line for products

			if (!line.equals("0"))
			{
				String [] productParts = line.split("-"); 

				for (int i=0; i< numProducts; i++)
				{
					MainExecutable.getPlayer().loadProduct(Database.getProduct(productParts[i]), i);
				} // for 0...numProducts-1
			} // if not empty



			// ----------------------- read next line for weapons -----------------------

			line = input.readLine ();       

			if (!line.equals("0"))
			{
				for (int i=0; i<numWeapons; i++)
				{
					String [] WParts = line.split("-"); 
					Weapon weapon;

					String WName = WParts[0];

					if (WName.equals("Pencil") || WName.equals("Hat"))
					{

						int WDamage = Integer.parseInt(WParts[1]);
						int WRange = Integer.parseInt(WParts[2]);
						double WCriticalChance = Double.parseDouble(WParts[3]);
						int WType = Integer.parseInt(WParts[4]);
						int WRangedDamage = Integer.parseInt(WParts[5]);

						weapon = new Weapon(WName, WDamage, WRange, WCriticalChance, WType, WRangedDamage);
					} // if
					else
					{
						int WCost = Integer.parseInt(WParts[1]);
						String WDescription = WParts[2];
						String WImagePath = WParts[3];
						int WDamage = Integer.parseInt(WParts[4]);
						int WRange = Integer.parseInt(WParts[5]);
						double WCriticalChance = Double.parseDouble(WParts[6]);
						int WType = Integer.parseInt(WParts[7]);
						int WRangedDamage = Integer.parseInt(WParts[8]);

						weapon = new Weapon(WName, WCost, WDescription, WImagePath, WDamage, WRange, WCriticalChance, WType, WRangedDamage);
					} // else shop weapon


					if (WName.equals ("Pencil")){setPencil(weapon);}
					else if (WName.equals ("Hat")){setHat(weapon);}
					else if (WName.equals ("Ruler")){setRuler (weapon);}
					else{setRubberband(weapon);} // "Rubber Band"

					MainExecutable.getPlayer().loadWeapon(Database.getWeapon(WName), i);

					line = input.readLine ();  // would be an extra readLine at the end but it's also at the end of the method     

				} // for 0...numWeapons-1
			} // if not empty



			input.close();
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

			PrintWriter output = new PrintWriter (new FileWriter ("src/saves/Save1.txt"));

			output.println("20");
			output.println("0");
			output.println("0");
			output.println("20");
			output.println("Pencil-1-1-0.20-0-0");
			output.println("src/resources/playerSprite.png");
			output.println("10");
			output.println("0");
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



	public static void writeSingle ()
	{
		try
		{

			PrintWriter output = new PrintWriter (new FileWriter ("src/saves/Save1.txt"));

			output.println(MainExecutable.getPlayer().getHealth());
			output.println(MainExecutable.getPlayer().getDefense());
			output.println(MainExecutable.getPlayer().getMaxDefense());
			output.println(MainExecutable.getPlayer().getMaxHealth());

			Weapon equippedWeapon = MainExecutable.getPlayer().getEquippedWeapon();
			String name = equippedWeapon.getName();

			if (name.equals("Pencil") || name.equals("Hat"))
			{
				output.print(equippedWeapon.getName()+"-");
				output.print(equippedWeapon.getDamage()+"-");
				output.print(equippedWeapon.getRange()+"-");
				output.print(equippedWeapon.getCriticalChance()+"-");
				output.print(equippedWeapon.getType()+"-");
				output.print(equippedWeapon.getRangedDamage());
				output.println("");	

			} // if pencil or hat
			else
			{
				output.print(equippedWeapon.getName()+"-");
				output.print(equippedWeapon.getCost()+"-");
				output.print(equippedWeapon.getDescription()+"-");
				output.print(equippedWeapon.getImagePath()+"-");
				output.print(equippedWeapon.getDamage()+"-");
				output.print(equippedWeapon.getRange()+"-");
				output.print(equippedWeapon.getCriticalChance()+"-");
				output.print(equippedWeapon.getType()+"-");
				output.print(equippedWeapon.getRangedDamage());
				output.println("");	

			} // else shop weapons


			output.println(MainExecutable.getPlayer().getImagePath());
			output.println(MainExecutable.getPlayer().getCoins());
			output.println(MainExecutable.getPlayer().getLevel());
			output.println(MainExecutable.getPlayer().getNumProducts());
			output.println(MainExecutable.getPlayer().getNumWeapons());
			output.println(MainExecutable.getPlayer().getProductCapacity());


			// ------- products -------

			int numProducts = MainExecutable.getPlayer().getNumProducts();

			if (numProducts >0)
			{
				Product products[] = MainExecutable.getPlayer().getProductsArray();

				if (numProducts>1)
				{
					for (int i=0; i <= numProducts-2; i++)
					{
						output.print(products[i].getName()+"-");
					} // for 0...numProducts-2
				}

				output.print(products[numProducts-1].getName());

				output.println("");

			} // if there are products in storage

			else
			{
				output.println("0");
			} // else no products in storage



			// ------- weapons -------

			int numWeapons = MainExecutable.getPlayer().getNumWeapons();

			if (numWeapons>0)
			{

				Weapon weapons[] = MainExecutable.getPlayer().getWeaponsArray();

				for (int i=0; i< numWeapons; i++)
				{
					Weapon weapon = weapons[i];
					String name1 = weapon.getName();

					if (name1.equals("Pencil") || name1.equals("Hat"))
					{
						output.print(weapon.getName()+"-");
						output.print(weapon.getDamage()+"-");
						output.print(weapon.getRange()+"-");
						output.print(weapon.getCriticalChance()+"-");
						output.print(weapon.getType()+"-");
						output.print(weapon.getRangedDamage());
						output.println("");	


					} // if pencil or hat
					else
					{
						output.print(weapon.getName()+"-");
						output.print(weapon.getCost()+"-");
						output.print(weapon.getDescription()+"-");
						output.print(weapon.getImagePath()+"-");
						output.print(weapon.getDamage()+"-");
						output.print(weapon.getRange()+"-");
						output.print(weapon.getCriticalChance()+"-");
						output.print(weapon.getType()+"-");
						output.print(weapon.getRangedDamage());
						output.println("");	

					} // else shop weapons

				} // for 0...numWeapons-1

			} // if at least 1 weapon in storage
			else
			{
				output.println("0");
			} // else no weapons in storage



			output.close (); // Close file.

		} // try
		catch (Exception e) 
		{
			System.out.println ("exception in writeSingle");
		} // catch


	} // writeSingle method

	
	

	
	
	// ------------------------------------------- npc Stuff -------------------------------------------

	// ------- imgBinay -------
	public static BufferedImage imgBinay;
	public static BufferedImage getImgBinay() {return imgBinay;}
	public static void setImgBinay(BufferedImage imgBinay) {Database.imgBinay = imgBinay;}


	// ------- imgHallMonitor -------
	public static BufferedImage imgHallMonitor;
	public static BufferedImage getImgHallMonitor() {return imgHallMonitor;}
	public static void setImgHallMonitor(BufferedImage imgHallMonitor) {Database.imgHallMonitor = imgHallMonitor;}

	
	// ------- imgGymTeacher -------
	public static BufferedImage imgGymTeacher;
	public static BufferedImage getImgGymTeacher() {return imgGymTeacher;}
	public static void setImgGymTeacher(BufferedImage imgGymTeacher) {Database.imgGymTeacher = imgGymTeacher;}
	static Point gymPos = new Point(14, 14);
	
	
	
	public static NonPlayer hallMonitor = new NonPlayer("<name>", false, getRuler(),3,15, gymPos, Room.HALLMONITOR);
	public static NonPlayer binay = new NonPlayer("Binay", true, getHat(),5,20, gymPos, Room.BINAY);
	public static NonPlayer gymTeacher = new NonPlayer("<gymteachersname>", false, getRubberband(),0,9, gymPos, Room.GYMTEACHER);
	
	
	public static BufferedImage getSprite (int enemyID) throws Exception
	{
		switch(enemyID) 
		{
		case Room.BINAY : //Binay
			return Database.getImgBinay();
		case Room.GYMTEACHER: //GymTeacher
			return Database.getImgGymTeacher();
		case Room.HALLMONITOR://HallMonitor
			return Database.getImgHallMonitor();
		default:
			throw new Exception("No enemy");
		}
		
	} // getSprite method


	
	public static BattlePanel battlePanel;

	
} // Database class