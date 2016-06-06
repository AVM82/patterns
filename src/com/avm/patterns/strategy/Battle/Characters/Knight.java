package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.NoShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.Sword;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Knight extends Fighter {


    public Knight(int health, int strong, String name) {
        super(health, strong, name);
        weaponBehavior = new Sword(50);
        shieldBehavior = new NoShield(0);
    }




}
