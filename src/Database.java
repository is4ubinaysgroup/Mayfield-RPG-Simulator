package src;
import java.io.File;

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
public class Database {

		// TODO Auto-generated constructor stub
		//final Exception ReadIncompleteError = new Exception();
		private static final Weapon hat = new Weapon(stats[0][3], stats[0][6], Weapon.RANGEDTYPE);
		private static final Weapon pencil = new Weapon(null, null, 0, 0);
		private static final Weapon ruler  = new Weapon(null, null, 0, 0);
		private static final Weapon rubberband = new Weapon(null, null, 0, 0);
		
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
		
		public static int stats[][]=new int[3][6];{//this array stores all the information for the weapon's beside critical chance and weapon names
		//  [damage]  [range]
			stats[0][0]=4; stats[0][2]=3;//sets the "hat" weapon damage
			stats[1][0]=1; stats[1][2]=1;//sets the "pencil" weapon damage
			stats[2][0]=2; stats[2][2]=1;//sets the "ruler" weapon damage
			stats[3][0]=2; stats[3][2]=3;//sets the "rubberBand" weapon damage
			}
		
		public static void save(File file) throws Exception
		{
			
		}
		
		public static void read(File file) throws Exception
		{

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
	}

