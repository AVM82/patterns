package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.NoShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.BowAndArrow;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Troll extends Character {

    public Troll(int health, int strong) {
        super(health, strong);
        weaponBehavior = new BowAndArrow(40);
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
