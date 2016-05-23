package com.avm.patterns.strategy.Duck.behavior.fly;

/**
 * Created by AVM on 13.05.2016.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!!! :(");
    }
}
