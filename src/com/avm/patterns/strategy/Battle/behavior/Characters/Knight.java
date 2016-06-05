package com.avm.patterns.strategy.Battle.behavior.Characters;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Knight extends Character {


    Knight(int health, int strong) {
        super(health, strong);
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
