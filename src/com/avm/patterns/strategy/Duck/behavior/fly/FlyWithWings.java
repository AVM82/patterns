package com.avm.patterns.strategy.Duck.behavior.fly;

/**
 * patterns
 * Created by AVM on 13.05.2016 15:28.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying!!!");
    }
}
