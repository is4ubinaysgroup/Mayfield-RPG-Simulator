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
  private int health;
  private int defense;
  private int maxHealth;
  private int movement;
  private Weapon equippedWeapon;
  

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
  
  public int getMovement()
  {
    return this.movement;
  }
  
  public void setMovement(int movement)
  {
    this.movement = movement;
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
public void setEquippedWeapon(Weapon equippedWeapon) {
	this.equippedWeapon = equippedWeapon;
}
}

