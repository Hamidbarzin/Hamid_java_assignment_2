package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // do nothing
  } // contructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
    """);
  }
  // Warrior Menu
  public void printWarriorMenu() {
    System.out.println("Choose Your Champion!");
    System.out.println("1) Human: Versatile warriors with balanced stats.");
    System.out.println("2) Elf: Agile fighters with high dexterity but lower health.");
    System.out.println("3) Orc: Brutal warriors with high strength but lower dexterity.");
 } 

  /// Weapon Menu
  public void printWeaponMenu() {
    System.out.println("Equip Your Weapon!");
    System.out.println("1) Dagger: Fast and light, deals moderate damage (Low Dexterity Cost).");
    System.out.println("2) Sword: Balanced weapon with good damage and range (Moderate Dexterity Cost).");
    System.out.println("3) Axe: Powerful weapon with high damage, but slower attack speed (High Dexterity Cost).");
 }
  
  // Armor Menu
  public void printArmourMenu() {
    System.out.println("Select Your Armor!");
    System.out.println("1) Leather: Light armor offering low protection but high dexterity (Low Dexterity Cost).");
    System.out.println("2) Chainmail: Medium armor providing moderate protection and dexterity (Moderate Dexterity Cost).");
    System.out.println("3) Platemail: Heavy armor offering high protection but limiting dexterity (High Dexterity Cost).");
 }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("Choose Your Attack!");
    System.out.println("1) Normal: Standard attack with balanced damage and speed.");
    System.out.println("2) Heavy: Powerful attack that deals more damage but reduces dexterity for this round.");
 }

  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    System.out.printf("%-25s (%s)\n", "Player: ", pWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      pWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      pWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      pWarrior.getDexterity());
    System.out.printf("%-25s (%s)\n", "Enemy: ", eWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      eWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      eWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      eWarrior.getDexterity());
  } // printStats()

  // GameOver Message
  public void printGameOver(String winner) {
    System.out.printf("""
         __ __
      .-',,^,,'.
     / \\(0)(0)/ \\
     )/( ,_"_,)\\(
     `  >-`~(   ' 
   _N\\ |(`\\ |___
   \\' |/ \\ \\/_-,)
    '.(  \\`\\_<
       \\ _\\|
        | |_\\_
        \\_,_>-'
    winner: %s
        """, winner);
  } // printGameOver()

} // class