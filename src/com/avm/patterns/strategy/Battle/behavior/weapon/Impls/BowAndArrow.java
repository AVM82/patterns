package com.avm.patterns.strategy.Battle.behavior.weapon.Impls;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class BowAndArrow extends Weapons {
    protected BowAndArrow(int damage) {
        super(damage);
    }

    @Override
    public int useWeapon(int strong) {
        System.out.println("I have a Bow and an Arrow!");
        return getDamageValue(strong);

    }
}
