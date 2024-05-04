package armour;

public class Leather extends Armour {
  private int armourAmount = 50;
  private int dexterityCost = 50;

  public Leather() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
  } // constructor

  public int reduceDamage(int damageAmount) {
    return damageAmount - this.armourAmount / 10;
  }
  
} // class
