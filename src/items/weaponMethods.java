//weapon methods made by zac 5/2/19

//the names are stored in the "names" array and is in the following order:
//
//These names will be used to check which row the particular weapon's stats are in

//The "stats" array is set up like this

//[    1    ][     2    ][   3   ][     4      ][      5       ][     6     ]
//[MELEETYPE][RANGEDTYPE][ALLTYPE][weaponDamage][upgradeCounter][weaponRange]

//The critical chance is set up so each weapon has a certain position in the array, these positions are
//the same as the vertical order for the weapons in the "names" array 

//The 1, 2 and 3 positions act as check lists for the kind weapon that is selected

//for ease of simplicity, the array can be visualized like this

//{"names" array}{                                         "stats" array                                                 }{"criticalChance" array} -respective arrays
//[      0      ][    1    ][     2    ][   3   ][     4      ][         5          ][           6          ][     7     ][          8           ] -position
//[weapon's name][MELEETYPE][RANGEDTYPE][ALLTYPE][weaponDamage][upgradeDamageCounter][upgradeCriticalCounter][weaponRange][     baseCritical     ] -label
//(     hat     )(    0    )(    0     )(   1   )(     4      )(         3          )(           3          )(     2     )(         .20          ) -example data
//               |     Checklist for which      |
//               |     type of weapon it is     |

//______________________________________________________________________________________________________
package weaponMethods;

public class weaponMethods {
	int MELEETYPE, RANGEDTYPE, ALLTYPE, upgradeCount, weaponRange, weaponDamage, x;//sets variables to hold bits of information from the methods
	double weaponCriticalChance;//this a used to output from the method
	double criticalChance[];{//sets the array and the values in the array for critical chances 
		criticalChance[0]=.20;
		criticalChance[1]=.05;
		criticalChance[2]=.15;
		criticalChance[3]=.10;
	}
	String names[]=new String[4];{ //this array stores all the names of the weapons and is used to find which row the weapon's stats in 
		names[0]="hat";
		names[1]="pencil";
		names[2]="ruler";
		names[3]="rubberBand";
	}
	int stats[][]=new int[3][6];{//this array stores all the information for the weapon's beside critical chance and weapon names
//  [m type]      [r type]      [all type]    [damage]      [dUpgrades]   [cUpgrade]   [range]
	stats[0][0]=0;stats[0][1]=0;stats[0][2]=1;stats[0][3]=4;stats[0][4]=0;stats[0][5]=0;stats[0][6]=3;//sets the "hat" weapon damage
	stats[1][0]=1;stats[1][1]=0;stats[1][2]=0;stats[1][3]=1;stats[1][4]=0;stats[0][5]=0;stats[1][6]=1;//sets the "pencil" weapon damage
	stats[2][0]=1;stats[2][1]=0;stats[2][2]=0;stats[2][3]=2;stats[2][4]=0;stats[0][5]=0;stats[2][6]=1;//sets the "ruler" weapon damage
	stats[3][0]=0;stats[3][1]=1;stats[3][2]=0;stats[3][3]=2;stats[3][4]=0;stats[0][5]=0;stats[3][6]=3;//sets the "rubberBand" weapon damage
	}
	public int getPlayerDamage (String weaponName)//this method finds which weapon is currently used or selected, and outputs the damage
	{ 
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				weaponDamage=(stats[x][4])+(3*(stats[x][5]));//this is the damage calculation: weapon damage + 3 per upgrade
			}
		}
		return weaponDamage;//returns the damage
	}	
	public int getMeleeRange (String weaponName) {//this method gets the weapon's melee range
	{ 
		for(x=0; x<3;x++) {//checks which row the weapon is in
			weaponRange = 0;
			if (weaponName.equals(names[x])){
				if (stats[x][1]>0){//checks if the weapon is a melee only
					weaponRange = (stats[x][6]);//sets weaponRange to the weapon's range stored in the array
				}
				else if (stats[x][3]>0){//checks if the weapon is both a ranged and melee weapon
					weaponRange = (stats[x][6]);//sets weaponRange to the weapon's range stored in the array	
				}
				else {
					weaponRange = 0;//if the weapon could not be used in melee, sets the range to 0
				}
			}
		}
		return weaponRange;//outputs the weapon's range
	}
	}
	public int getRangedRanged (String weaponName){
		for(x=0; x<3;x++) {
			weaponRange = 0;
			if (weaponName.equals(names[x])){//checks if the weapon is a ranged only
				if (stats[x][2]>0){
					weaponRange = (stats[x][6]);//sets weaponRange to the weapon's range stored in the array	
				}
				else if (stats[x][3]>0){//checks if the weapon is both a ranged and melee weapon
					weaponRange = (stats[x][6]);//sets weaponRange to the weapon's range stored in the array		
				}
				else {
					weaponRange = 0;//if the weapon could not be used at range, sets the range to 0
				}
			}
		}
		return weaponRange;//outputs the weapon's range
	}	
	public int getDamageUpgradeCount (String weaponName) {
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				upgradeCount=stats[x][4];//when the names match, set the upgrade count to the corresponding upgrade count
			}
		}
		return upgradeCount;
		}
	public int getCriticalUpgradeCount (String weaponName) {
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				upgradeCount=stats[x][5];//when the names match, set the upgrade count to the corresponding upgrade count
			}
		}
		return upgradeCount;
	}	
	public double getCriticalChance (String weaponName)//this method gets the critical chance of the selected weapon
	{ 
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				weaponCriticalChance=criticalChance[x]*stats[x][5];//returns the critical chance of the which is multiplied by each upgrade
			}
		}
		return weaponCriticalChance;//return the critical chance
	}
	public void upgradeDamage (String weaponName)//this method finds which weapon is currently used or selected, and outputs the damage
	{ 
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				stats[x][4]=stats[x][4]+1;//this is the damage calculation: weapon damage + 3 per upgrade
			}
		}
		
	}
	public void upgradeCritical (String weaponName)//this method finds which weapon is currently used or selected, and outputs the damage
	{ 
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				stats[x][5]=stats[x][5]+1;//this is the damage calculation: weapon damage + 3 per upgrade
			}
		}
		
	}
}