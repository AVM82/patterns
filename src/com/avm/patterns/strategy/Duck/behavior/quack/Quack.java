package com.avm.patterns.strategy.Duck.behavior.quack;

/**
 * Created by AVM on 13.05.2016.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }

    public void quack3() {
        System.out.print("Quack!!! ");
        System.out.print("Quack!!! ");
        System.out.println("Quack!!!");
    }

}
