package com.avm.patterns.strategy.Battle.behavior.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.NoShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.Sword;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Knight extends Character {


    public Knight(int health, int strong) {
        super(health, strong);
        weaponBehavior = new Sword(50);
        shieldBehavior = new NoShield(0);
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
