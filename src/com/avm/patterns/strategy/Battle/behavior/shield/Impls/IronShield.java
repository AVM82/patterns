package com.avm.patterns.strategy.Battle.behavior.shield.Impls;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class IronShield extends Shields {

    public IronShield(int defence) {
        super(defence);
    }

    @Override
    public int useShield(int damage) {
        System.out.println("I have an IRON shield.");
        return getDefenceValue(damage);
    }
}
