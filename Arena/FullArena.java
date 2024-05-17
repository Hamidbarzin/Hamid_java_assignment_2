package Arena;

import weapon.Weapon;

public class FullArena extends Arena {

    public FullArena() {
        super();
        super.setDamageBuff(super.randInt.nextInt(25) + 1);
        super.setArenaType("Full Arena");
    }




    @Override
    public void applyBuff(Weapon pWeapon, Weapon eWeapon) {
        int buffPercent = this.getDamageBuff() / 100;
        pWeapon.setDamageAmount(pWeapon.getDamageAmount() + (pWeapon.getDamageAmount() * buffPercent));
        eWeapon.setDamageAmount(eWeapon.getDamageAmount() + (eWeapon.getDamageAmount() * buffPercent));
    } //adds a damage buff to both player and enemy weapons
}