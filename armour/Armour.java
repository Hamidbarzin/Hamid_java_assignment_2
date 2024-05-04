package armour;

public abstract class Armour {
    private int armourAmount;
    private int dexterityCost;
    private String armorType; // Added property for armor type

    public Armour() {
        // do nothing
    }

    //==============>>
    // GETTERS
    public int getArmourAmount() {
        return this.armourAmount;
    }

    public int getDexterityCost() {
        return this.dexterityCost;
    }

    public String getArmorType() {
        return this.armorType;
    } // Added getter for armor type

    //==============>>
    // SETTERS
    public void setArmourAmount(int armourAmount) {
        this.armourAmount = armourAmount;
    }

    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    } // Added setter for armor type

    public abstract int reduceDamage(int damageAmount);
} // class