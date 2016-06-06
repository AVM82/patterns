package com.avm.patterns.strategy.Battle.behavior.shield.Impls;

import com.avm.patterns.strategy.Battle.behavior.shield.ShieldBehavior;

/**
 * Created by AVM2 on 05.06.2016.
 */
public abstract class Shields implements ShieldBehavior {

    final private int defence;

    Shields(int defence) {
        if (defence > 100) {
            throw new ArithmeticException("The max value of defence is 100.");
        } else {
            this.defence = defence;
        }
    }

    public int getDefenceValue(int damage) {
        return ((100 - defence) * damage) / 100;
    }

    public int getDefence() {
        return defence;
    }


}
