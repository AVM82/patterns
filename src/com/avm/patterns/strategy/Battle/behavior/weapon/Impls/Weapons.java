package com.avm.patterns.strategy.Battle.behavior.weapon.Impls;

import com.avm.patterns.strategy.Battle.behavior.weapon.WeaponBehavior;

/**
 * Created by AVM2 on 05.06.2016.
 */
public abstract class Weapons implements WeaponBehavior {

    final private int damage;


    protected Weapons(int damage) {
        this.damage = damage;
    }

    public int getDamageValue(int strong) {
        return ((100 + strong) * damage) / 100;
    }


}
