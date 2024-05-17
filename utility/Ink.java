package utility;

import warrior.Warrior;
import Arena.*;

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
    System.out.println("""

Select a Type: \n1) Human\n2) Elf\n3) Orc
         """);
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.println("""
              Select a Weapon: \n1) Dagger\n2) Sword \n3) Axe
                                              """);
  }

  // Armor Menu
  public void printArmourMenu() {
    System.out.println("""
        Armour Pick: \n1) Leather\n2) Chainmail\n3) Platemail""");
  }
  // Attack Menu
  public void printAttackMenu() {
    System.out.println("\nAttack Type: \n1) Normal\n2) Heavy\n3) Surrender");
  }

  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    System.out.printf("%-33s %-33s\n", "Player", "Enemy");
    System.out.printf("Health: %-25d Health: %-25d\n",
        pWarrior.getHealth(), eWarrior.getHealth());
    System.out.printf("Strength: %-23d Strength: %-23d\n",
        pWarrior.getStrength(), eWarrior.getStrength());
    System.out.printf("Dexterity: %-22d Dexterity: %-22d\n",
        pWarrior.getDexterity(), eWarrior.getDexterity());

  } // printStats()

  public void printDamage(String who, int damage) {
    if (damage <= 0) {
      System.out.printf("\n %s has dealt 0 damage", who);
    } else {
      System.out.printf("\n %s has dealt %d damage\n", who, damage);
    }

  }

  public void printArenaType(Arena arena) {
    if (arena == null) {
      System.out.println("\nYour combat begins in a Dojo");
    } else {
    System.out.println("\nYour combat begins in a " + arena.getArenaType());
    }
  }

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