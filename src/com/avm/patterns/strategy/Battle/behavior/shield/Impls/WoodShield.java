package com.avm.patterns.strategy.Battle.behavior.shield.Impls;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.Shields;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class WoodShield extends Shields {


    WoodShield(int defence) {
        super(defence);
    }

    @Override
    public int useShield(int damage) {
        System.out.println("I have a WOOD shield.");
        return getDefenceValue(damage);


    }
}
