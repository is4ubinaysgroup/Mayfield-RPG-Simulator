package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

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
 */
public class Database {
	
		private static File[] files = new File[2];
		{
			files[0] = new File("saves\\Save1.txt");
			files[1] = new File("saves\\Save2.txt");
			files[2] = new File("saves\\Save3.txt");
		}
		private static BufferedReader reader;
		
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
		
		
		
		
		
		public static void save(File file) throws Exception
		{
			
		}
		
		public static void read(File file) throws Exception
		{
			reader = new BufferedReader(new FileReader(files[0]));
		}
		
		public static void updateFile(File file)throws  Exception
		{
			
		}

		public static Product getProduct (String name)
		{
			if (name.equals("Timbits")) {return Database.getTimbits();}
			else if (name.equals("McChicken")) {return Database.getMcChicken();}
			else if (name.equals("Foot Long Sub!")) {return Database.getFootLongSub();}
			else if (name.equals("Soda")) {return Database.getSoda();}
			else if (name.equals("Tylenol")) {return Database.getTylenol();}
			else if (name.equals("Capacity Upgrade")) {return Database.getCapacityUpgrade();}
			else if (name.equals("Coffee")) {return Database.getCoffee();}
			else if (name.equals("Cappuccino")) {return Database.getCappuccino();}
			else if (name.equals("Expresso")) {return Database.getExpresso();}
			else {return Database.getOrangeJuice();} // "Orange Juice"
		}
		
		public static Product getTimbits() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getMcChicken() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getFootLongSub() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getSoda() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getTylenol() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getCapacityUpgrade() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getCoffee() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getCappuccino() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getExpresso() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Product getOrangeJuice() {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		 * @return the hat
		 */
		public static Weapon getHat() 
		{
			return hat;
		}

		/**
		 * @return the pencil
		 */
		public static Weapon getPencil() {
			return pencil;
		}

		/**
		 * @return the ruler
		 */
		public static Weapon getRuler() {
			return ruler;
		}

		/**
		 * @return the rubberband
		 */
		public static Weapon getRubberband() {
			return rubberband;
		}

	}

