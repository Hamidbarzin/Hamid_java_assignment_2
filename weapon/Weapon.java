package weapon;

import java.util.Random;

// abstract means it CANNOT be directly instantiated!
public abstract class Weapon {
    private int damageAmount;
    private int dexterityCost;
    protected Random randNum = new Random();
    private String weaponType; // Added property for weapon type

    public Weapon() {
        // do nothing
    } // contructor

    //===============>>
    // GETTERS
    public int getDamageAmount() {
        return this.damageAmount;
    }

    public int getDexterityCost() {
        return this.dexterityCost;
    }

    public String getWeaponType() {
        return this.weaponType;
    } // Added getter for weapon type

    //===============>>
    // SETTERS
    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    } // Added setter for weapon type

    // makes it polymorphic!
    public abstract int strike(int weatherIntensity, int attackType, int strength, int dexterity);
} // class