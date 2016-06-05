package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.IronShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.Sword;

import java.lang.*;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class King extends Character {


    public King(int health, int strong) {

        super(health, strong);
        weaponBehavior = new Sword(15);
        shieldBehavior = new IronShield(35);
    }

    @Override
    public int fight() {

        return 0;
    }

    @Override
    public int counterattack() {
        return 0;
    }

    @Override
    public void defense() {

    }
}
