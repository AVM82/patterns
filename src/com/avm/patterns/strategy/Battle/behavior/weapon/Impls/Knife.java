package com.avm.patterns.strategy.Battle.behavior.weapon.Impls;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Knife extends Weapons {
    public Knife(int damage) {
        super(damage);
    }

    @Override
    public int useWeapon(int strong) {
        System.out.println("I have a Knife!");
        return getDamageValue(strong);
    }
}
