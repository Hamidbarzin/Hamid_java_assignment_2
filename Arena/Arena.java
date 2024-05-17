package Arena;

import java.util.Random;

import warrior.Warrior;
import weapon.Weapon;

public abstract class Arena {
    protected Random randInt = new Random();
    private int healthBuff;
    private int damageBuff;
    private int dexterityBuff;
    private String arenaType;

    // MARK: GETTERS
    public int getHealthBuff() {
        return healthBuff;
    }

    public int getDamageBuff() {
        return damageBuff;
    }

    public int getDexterityBuff() {
        return dexterityBuff;
    }

    public String getArenaType() {
        return this.arenaType;
    }


    // MARK: SETTERS
    public void setHealthBuff(int healthBuff) {
        this.healthBuff = healthBuff;
    }

    public void setDamageBuff(int damageBuff) {
        this.damageBuff = damageBuff;
    }

    public void setDexterityBuff(int dexterityBuff) {
        this.dexterityBuff = dexterityBuff;
    }

    public void setArenaType(String arenaType) {
        this.arenaType = arenaType;
    }

    public void applyBuff(Warrior pWarrior, Warrior eWarrior) {
    };

    public void applyBuff(Weapon pWeapon, Weapon eWeapon) {
    };

}