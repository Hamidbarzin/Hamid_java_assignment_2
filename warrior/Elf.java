package warrior;

public class Elf extends Warrior {
  private int baseHealth = 50;
  private int bonusHealth = 75;
  private int baseStrength = 50;
  private int bonusStrength = 75;
  private int baseDexterity = 250;
  private int bonusDexterity = 200;

  public Elf(String warriorType) {
    super();
    super.setHealth(super.randNum.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.randNum.nextInt(bonusStrength) + baseStrength);
    super.setDexterity(super.randNum.nextInt(bonusDexterity) + baseDexterity);
    super.setWarriorType(warriorType);
  } // contructor
} // class
