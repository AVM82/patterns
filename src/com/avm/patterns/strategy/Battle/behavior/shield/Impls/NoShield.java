package com.avm.patterns.strategy.Battle.behavior.shield.Impls;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.Shields;

/**
 * Created by AVM on 03.06.2016 17:53.
 */
public class NoShield extends Shields {

    NoShield(int defence) {
        super(defence);
    }

    @Override
    public int useShield(int damage) {
        System.out.println("I have NO shield.");
        return getDefenceValue(damage);
    }
}