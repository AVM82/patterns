package com.avm.patterns.strategy.Battle.behavior.weapon.Impls;

import com.avm.patterns.strategy.Battle.behavior.weapon.WeaponBehavior;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Sword extends Weapons {


    public Sword(int damage) {
        super(damage);
    }

    @Override
    public int useWeapon(int strong) {

        System.out.println("I have a Sword!");
        return getDamageValue(strong);
    }
}
