package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.WoodShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.Axe;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Orc extends Fighter {

    public Orc(int health, int strong, String name) {
        super(health, strong, name);
        weaponBehavior = new Axe(45);
        shieldBehavior = new WoodShield(15);
    }




}
