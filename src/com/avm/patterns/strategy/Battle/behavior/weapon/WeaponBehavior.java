package com.avm.patterns.strategy.Battle.behavior.weapon;

/**
 * Created by AVM on 03.06.2016 17:13.
 */
public interface WeaponBehavior {

    int useWeapon(int strong);

    int getDamageValue(int strong);
}
