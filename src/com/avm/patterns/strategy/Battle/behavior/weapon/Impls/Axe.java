package com.avm.patterns.strategy.Battle.behavior.weapon.Impls;


/**
 * Created by AVM2 on 05.06.2016.
 */
public class Axe extends Weapons {

    public Axe(int damage) {
        super(damage);
    }

    @Override
    public int useWeapon(int strong) {
        System.out.println("I have an Axe!");
        return getDamageValue(strong);
    }
}
