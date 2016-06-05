package com.avm.patterns.strategy.Battle;

import com.avm.patterns.strategy.Battle.behavior.shield.ShieldBehavior;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.NoWeapon;
import com.avm.patterns.strategy.Battle.behavior.weapon.WeaponBehavior;

/**
 * Created by AVM on 03.06.2016 17:09.
 */
public abstract class Character {

    private WeaponBehavior weaponBehavior;
    protected ShieldBehavior shieldBehavior;
    protected int health;
    protected int strong;

    Character() {
        super();
    }

    Character(int health, int strong) {
        super();
        this.health = health;
        this.strong = strong;
//        this.shieldBehavior = new NoShield();
//        this.weaponBehavior = new NoWeapon();
    }

    /**
     * Method fight() and counterattack()
     *
     * @return return damage at enemy
     */
    public abstract int fight();

    public abstract int counterattack();

    public abstract void defense();

    public void damage(int damage) {
        this.health -= damage;

    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }

    public void setShield(ShieldBehavior shield) {
        this.shieldBehavior = shield;
    }


}
