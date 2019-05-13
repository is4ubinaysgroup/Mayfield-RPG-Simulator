package src.character;
/*
@Author: Carson Fujita
@Contributor:
human class sets the requirements and data for the rest of the classes
*/


import src.items.Weapon;

public class Human
{
  //ints
  protected int health;
  protected int defense;
  protected int maxHealth;
  public static int MOVEMENT = 3;
  protected Weapon equippedWeapon;
  protected String imagePath;


  //Gets and Sets
  public int getHealth()
  {
    return this.health;
  }
  
  public void setHealth(int health)
  {
    this.health = health;
  }
  
  public int getDefense()
  {
    return this.defense;
  }
  
  public void setDefense(int defense)
  {
    this.defense = defense;
  }
  
  public int getMaxHealth()
  {
    return this.maxHealth;
  }
  
  public void setMaxHealth(int maxHealth)
  {
    this.maxHealth = maxHealth;
  }
  
  public void increaseDefense() 
  {
	  this.defense += 5;
  }
 

/**
 * @return the equippedWeapon
 */
public Weapon getEquippedWeapon() {
	return equippedWeapon;
}

/**
 * @param equippedWeapon the equippedWeapon to set
 */
public void equipWeapon(Weapon equippedWeapon) {
	this.equippedWeapon = equippedWeapon;
}


