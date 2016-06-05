package com.avm.patterns.strategy.Battle.behavior.shield.Impls;

/**
 * Created by AVM on 03.06.2016 17:53.
 */
public class NoShield extends Shields {

    public NoShield(int defence) {
        super(defence);
    }

    @Override
    public int useShield(int damage) {
        System.out.println("I have NO shield.");
        return getDefenceValue(damage);
    }
}
