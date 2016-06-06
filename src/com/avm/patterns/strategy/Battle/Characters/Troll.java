package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.NoShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.BowAndArrow;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Troll extends Fighter {

    public Troll(int health, int strong, String name) {
        super(health, strong, name);
        weaponBehavior = new BowAndArrow(40);
        shieldBehavior = new NoShield(0);
    }
}





