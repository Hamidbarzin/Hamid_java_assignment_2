package Arena;

import warrior.Warrior;

public class BathHouse extends Arena {
    public BathHouse() {
        super();
        super.setHealthBuff(super.randInt.nextInt(25) + 1);
        super.setArenaType("Bath House");
    }

    @Override
    public void applyBuff(Warrior pWarrior, Warrior eWarrior) {
        int buffPercent = this.getHealthBuff() / 100;
        pWarrior.setHealth(pWarrior.getHealth() +(pWarrior.getHealth() * buffPercent));
        eWarrior.setHealth(eWarrior.getHealth() +(eWarrior.getHealth() * buffPercent));
    } // adds a buff to player and enemy health
}