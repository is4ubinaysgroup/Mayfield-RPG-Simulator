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



// 05-12 spelling of espresso - Mina


public class Database {
	
		
		private static File[] files = new File[2];
		{
			files[0] = new File("saves\\Save1.txt");
			files[1] = new File("saves\\Save2.txt");
			files[2] = new File("saves\\Save3.txt");
		}		
		//Zac's work that was moved from Weapon class: Stats[][], criticalChance[], and names[]
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
		
		// TODO Auto-generated constructor stub
		public final Exception ReadIncompleteError = new Exception("Reading file was incomplete: Some data may be lost.");// this will throw if reading a file and obtains only part of the information.
		private static Weapon hat = new Weapon(stats[0][0],stats[0][1],criticalChance[0],Weapon.RANGEDTYPE );
		private static Weapon pencil = new Weapon(stats[0][1],stats[0][1],criticalChance[0],Weapon.MELEETYPE );
		private static Weapon ruler  = new Weapon(stats[0][2],stats[0][1],criticalChance[0],Weapon.ALLTYPE );
		private static Weapon rubberband = new Weapon(stats[0][3],stats[0][1],criticalChance[0],Weapon.RANGEDTYPE);
		private static Product timbits = new Product("Timbits", Product.HEALTH, 10, 10,"Timbits are good, eh. Have som' maple syrup with it, yeah.");
		private static Product mcChicken = new Product("McChicken", Product.HEALTH, 15, 20, "Cheap and American. YEEEEHAAA!!!");
		private static Product footLongSub = new Product("Foot Long Sub!", Product.HEALTH, 30, 50, "yum yum!");
		private static Product soda = new Product("Soda", Product.CRITICALCHANCE, 1, 20,"OwO gwimme dawt swoda pwease UwU");
		private static Product tylenol = new Product("Tylenol", Product.DEFENSE, 5, 15,"Yee");
		private static Product capacityUpgrade = new Product("Capacity Upgrade", Product.CAPACITY, 5, 50,"bored of making crappy discriptions");
		private static Product coffee = new Product("Coffee", Product.MAXHEALTH, 20,32, "Probs should talk about getting offical discriptions");
		private static Product cappuccino = new Product("Cappuccino",Product.MAXHEALTH,40, 75,"WE got no discription so");
		private static Product espresso = new Product("Espresso",Product.MAXHEALTH,60,100,"WE got no discription for this either so");
		private static Product orangeJuice = null;//Couldn't find the thingy

		public static void save(File file) throws Exception
		{
			
		}
		
		public static void read(File file) throws Exception
		{
			BufferedReader reader = new BufferedReader(new FileReader(files[0]));
			for(int i = 0; i < files[0].length(); i++) //reads the document.
			{
				//TODO
			}
		}
		
		public static void updateFile(File file)throws  Exception
		{
			
		}

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
		}
		
		public static Product getTimbits() {
			return timbits;
		}

		public static Product getMcChicken() {
			return mcChicken;
		}

		public static Product getFootLongSub() {
			return footLongSub;
		}

		public static Product getSoda() {
			return soda;
		}

		public static Product getTylenol() {
			return tylenol;
		}

		public static Product getCapacityUpgrade() {
			return capacityUpgrade;
		}

		public static Product getCoffee() {
			return coffee;
		}

		public static Product getCappuccino() {
			return cappuccino;
		}

		public static Product getEspresso() {
			return espresso;
		}

		public static Product getOrangeJuice() {
			return orangeJuice;
		}

		/**
		 * @return the hat
		 */
		public static Weapon getHat() {
			return hat;
		}

		/**
		 * @param hat the hat to set
		 */
		public static void setHat(Weapon hat) {
			Database.hat = hat;
		}

		/**
		 * @return the pencil
		 */
		public static Weapon getPencil() {
			return pencil;
		}

		/**
		 * @param pencil the pencil to set
		 */
		public static void setPencil(Weapon pencil) {
			Database.pencil = pencil;
		}

		/**
		 * @return the ruler
		 */
		public static Weapon getRuler() {
			return ruler;
		}

		/**
		 * @param ruler the ruler to set
		 */
		public static void setRuler(Weapon ruler) {
			Database.ruler = ruler;
		}

		/**
		 * @return the rubberband
		 */
		public static Weapon getRubberband() {
			return rubberband;
		}

		/**
		 * @param rubberband the rubberband to set
		 */
		public static void setRubberband(Weapon rubberband) {
			Database.rubberband = rubberband;
		}

		public static Weapon getWeapon(String weaponName) {
			// TODO Auto-generated method stub
			return null;
		}



	}

