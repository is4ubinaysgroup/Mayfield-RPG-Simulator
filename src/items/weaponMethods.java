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
/*
Editing and contributing @Carson Fujita
Date: 
May 11th, 2019
notes: This is missing so much from the uml. 
Changes:
added public to  "MELEETYPE, RANGEDTYPE, ALLTYPE, upgradeCount, weaponRange, weaponDamage, x"
change package to items.
change Class name.
Created Constructors.
added damage[], range[], critical_Chance, and type.
moved criticalChange[] to database
moved our project to red.
 */

package items;// 

public class Weapon {
	public int MELEETYPE, RANGEDTYPE, ALLTYPE, upgradeCount, weaponRange, weaponDamage, x;//sets variables to hold bits of information from the methods
	//WTF IS X FOR???
	private int[] damage = new int[2]; // damage[0] is player damage, damage[1] is boss damage;
	private int[] range  = new int[2]; // damage[0] is Melee range, damage[1] is ranged range;
	private double critical_Chance = new int[2];
	private int weaponType;
			
	public weapon(int[] damage; int[] range; double critical_Chance, int type) 
	{
		this.damage = damage;
		this.range = range;
		this.critical_Chance = critical_Chance;
		this.type = type;
	}
	
	
	
	
	public int getPlayerDamage (String weaponName)//this method finds which weapon is currently used or selected, and outputs the damage
	{ 
		for(x=0; x<3;x++) {
			if (weaponName.equals(names[x])){//checks which row the weapon is in
				weaponDamage=(stats[x][4])+(3*(stats[x][5]));//this is the damage calculation: weapon damage + 3 per upgrade???
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