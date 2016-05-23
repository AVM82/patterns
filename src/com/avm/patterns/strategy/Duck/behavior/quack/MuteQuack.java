package com.avm.patterns.strategy.Duck.behavior.quack;

/**
 * Created by AVM on 13.05.2016.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<< Silence >>>");
    }

    @Override
    public void quack3() {
        quack();
    }

}
