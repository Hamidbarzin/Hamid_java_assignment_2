package Arena;

import warrior.Warrior;

public class EmptyArena extends Arena {


    public EmptyArena() {
        super();
        super.setDexterityBuff(super.randInt.nextInt(25) + 1);
        super.setArenaType("Empty Arena");
    }


    @Override
    public void applyBuff(Warrior pWarrior, Warrior eWarrior) {
        int buffPercent = this.getDexterityBuff() / 100;
        pWarrior.setHealth(pWarrior.getDexterity() + (pWarrior.getDexterity() * buffPercent));
        eWarrior.setHealth(eWarrior.getDexterity() + (eWarrior.getDexterity() * buffPercent));
    } // adds a buff to the player and enemy dexterity

}