package com.avm.patterns.strategy.Duck.behavior.fly;

/**
 * Created by AVM on 13.05.2016.
 */
public class FlyOnRocket implements FlyBehavior {

    @Override
    public void fly() {

        System.out.println("I am flying on the rocket!!! :(");
    }
}
