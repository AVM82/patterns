package com.avm.patterns.strategy.Battle.behavior.weapon.Impls;


import com.avm.patterns.strategy.Battle.behavior.weapon.WeaponBehavior;

/**
 * Created by AVM on 03.06.2016 17:54.
 */
public class NoWeapon extends Weapons {

    public NoWeapon(int damage) {
        super(damage);
    }

    @Override
    public int useWeapon(int strong) {
        System.out.println("I have NO weapon!");
        return getDamageValue(strong);

    }
}
