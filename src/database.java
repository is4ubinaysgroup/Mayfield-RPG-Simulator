package items;
import java.io.File;
/*
Editing and contributing @Carson Fujita
Date: 
May 11th, 2019
moved criticalChange[] from weaponMethods to database and added public static
moved String names[] from weaponMethods to database and added public static
moved stats[] from weaponMethods to databaseand added public static

 */
public class Database {

	public Database() {
		// TODO Auto-generated constructor stub
		final Exception ReadIncompleteError = new Exception();
		
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
		//  [m type]      [r type]      [all type]    [damage]      [dUpgrades]   [cUpgrade]   [range]
			stats[0][0]=0;stats[0][1]=0;stats[0][2]=1;stats[0][3]=4;stats[0][4]=0;stats[0][5]=0;stats[0][6]=3;//sets the "hat" weapon damage
			stats[1][0]=1;stats[1][1]=0;stats[1][2]=0;stats[1][3]=1;stats[1][4]=0;stats[0][5]=0;stats[1][6]=1;//sets the "pencil" weapon damage
			stats[2][0]=1;stats[2][1]=0;stats[2][2]=0;stats[2][3]=2;stats[2][4]=0;stats[0][5]=0;stats[2][6]=1;//sets the "ruler" weapon damage
			stats[3][0]=0;stats[3][1]=1;stats[3][2]=0;stats[3][3]=2;stats[3][4]=0;stats[0][5]=0;stats[3][6]=3;//sets the "rubberBand" weapon damage
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
	}

