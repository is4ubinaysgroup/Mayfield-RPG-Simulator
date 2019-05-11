package src.character;
/*
@Author: Carson Fujita
@Contributor:
human class sets the requirements and data for the rest of the classes
*/

public class Human
{
  //ints
  private int health;
  private int defense;
  private int maxHealth;
  private int movement;
  private int equippedWeapon;
  

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
}

