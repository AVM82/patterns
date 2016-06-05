package com.avm.patterns.strategy.Battle.behavior.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.WoodShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.Axe;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Orc extends Character {

    public Orc(int health, int strong) {
        super(health, strong);
        weaponBehavior = new Axe(45);
        shieldBehavior = new WoodShield(15);
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
