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
extended to Item
fixed bugs;
Changed to package src.items.
fixed RANGEDTYPE, MELEETYPE, and ALLTYPE to contain numbers.
created a whole ton of getters and setters
 */

package src.items;// 

import src.Database;

public class Weapon extends Item
{
	public static int MELEETYPE = 0;
	public static int RANGEDTYPE = 1;
	public static int ALLTYPE = 2;
	private int damage; // damage[0] is player damage, damage[1] is boss damage;
	private int range; // damage[0] is Melee range, damage[1] is ranged range;
	private double critical_Chance;
	private int weaponType;
	private int type;
	
	public void upgradeCritical() 
	{
		double WeaponCriticalChance = getCriticalChance();
		if(WeaponCriticalChance == Database.criticalChance[0]) 
		{
			setCriticalChance(Database.criticalChance[1]);
		}
		else if(WeaponCriticalChance == Database.criticalChance[1]) 
		{
			setCriticalChance(Database.criticalChance[2]);
		}
		else if(WeaponCriticalChance== Database.criticalChance[2]) 
		{
			setCriticalChance(Database.criticalChance[3]);
		}
		else if(WeaponCriticalChance== Database.criticalChance[3]) 
		{
			//no
		}
	}
			
	public Weapon(int damage, int range,double critical_Chance, int type) 
	{
		this.setDamage(damage);
		this.setRange(range);
		this.setCriticalChance(critical_Chance);
		this.setType(type);
	}

	public void upgradeDamage()
	{
		setDamage(getDamage()*3);
	}
	
	
	public int getPlayerDamage ()
	{
		return this.damage;//returns the damage
	}	
	
	public int getMeleeRange () {
	{ 
		return range;//outputs the weapon's range
	}
	
	}

	/*
	public int getDamageUpgradeCount (String weaponName) {
		for(x=0; x<3;x++) {
			if (getName().equals(names[x])){//checks which row the weapon is in
				upgradeCount=stats[x][4];//when the names match, set the upgrade count to the corresponding upgrade count
			}
		}
		return upgradeCount;
		}
	public int getCriticalUpgradeCount (String weaponName) {
		for(x=0; x<3;x++) {
			if (getName().equals(names[x])){//checks which row the weapon is in
				upgradeCount=stats[x][5];//when the names match, set the upgrade count to the corresponding upgrade count
			}
		}
		return upgradeCount;
	}	
	public double getCriticalChance (String weaponName)//this method gets the critical chance of the selected weapon
	{ 
		for(x=0; x<3;x++) {
			if (getName().equals(names[x])){//checks which row the weapon is in
				weaponCriticalChance=criticalChance[x]*stats[x][5];//returns the critical chance of the which is multiplied by each upgrade
			}
		}
		return weaponCriticalChance;//return the critical chance
	}
	public void upgradeDamage (String weaponName)//this method finds which weapon is currently used or selected, and outputs the damage
	{ 
		for(x=0; x<3;x++) {
			if (getName().equals(names[x])){//checks which row the weapon is in
				stats[x][4]=stats[x][4]+1;//this is the damage calculation: weapon damage + 3 per upgrade
			}
		}
		
	}
	public void upgradeCritical (String weaponName)//this method finds which weapon is currently used or selected, and outputs the damage
	{ 
		for(x=0; x<3;x++) {
			if (getName().equals(names[x])){//checks which row the weapon is in
				stats[x][5]=stats[x][5]+1;//this is the damage calculation: weapon damage + 3 per upgrade
			}
		}
		
	}
	 */



	/**
	 * @return the critical_Chance
	 */
	public double getCriticalChance() {
		return critical_Chance;
	}




	/**
	 * @param critical_Chance the critical_Chance to set
	 */
	public void setCriticalChance(double critical_Chance) {
		this.critical_Chance = critical_Chance;
	}




	/**
	 * @return the weaponType
	 */
	public int getWeaponType() {
		return weaponType;
	}




	/**
	 * @param weaponType the weaponType to set
	 */
	public void setWeaponType(int weaponType) {
		this.weaponType = weaponType;
	}




	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}




	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}




	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}




	/**
	 * @param damage2 the damage to set
	 */
	public void setDamage(int damage2) {
		this.damage = damage2;
	}




	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}




	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
}