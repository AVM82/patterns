package com.avm.patterns.strategy.Battle.behavior.shield;

/**
 * Created by AVM on 03.06.2016 17:16.
 */
public interface ShieldBehavior {

    int useShield(int damage);

    int getDefence();

    int getDefenceValue(int damage);
}
