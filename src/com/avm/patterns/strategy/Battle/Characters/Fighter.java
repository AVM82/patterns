package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.ShieldBehavior;
import com.avm.patterns.strategy.Battle.behavior.weapon.WeaponBehavior;

/**
 * Created by AVM on 03.06.2016 17:09.
 */
public abstract class Fighter {

    protected WeaponBehavior weaponBehavior;
    protected ShieldBehavior shieldBehavior;
    private int health;
    private int strong;
    private String name;

    Fighter(int health, int strong, String name) {
        super();
        this.health = health;
        this.name = name;
        if (strong > 100) {
            throw new ArithmeticException("The MAX value of strong is 100");
        } else {
            this.strong = strong;
        }

    }


    /**
     * Method attack() and counterattack()
     *
     * @return return damage at enemy
     */

    public int attack() {
        return weaponBehavior.useWeapon(strong);
    }


    public int defense(int damage) {
        return shieldBehavior.useShield(damage);
    }

    public void damage(int damage) {
        this.health -= damage;

    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }

    public WeaponBehavior getWeapon() {
        return this.weaponBehavior;
    }

    public void setShield(ShieldBehavior shield) {
        this.shieldBehavior = shield;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ShieldBehavior getShield() {
        return shieldBehavior;
    }

    public void healthRecovery(int health) {
        this.health = health;
    }
}
