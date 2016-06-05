package com.avm.patterns.strategy.Battle.behavior.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.ShieldBehavior;
import com.avm.patterns.strategy.Battle.behavior.weapon.WeaponBehavior;

/**
 * Created by AVM on 03.06.2016 17:09.
 */
public abstract class Character {

    protected WeaponBehavior weaponBehavior;
    protected ShieldBehavior shieldBehavior;
    private int health;
    private int strong;

    Character(int health, int strong) {
        super();
        this.health = health;
        if (strong > 100) {
            throw new ArithmeticException("The MAX value of strong is 100");
        } else {
            this.strong = strong;
        }

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
