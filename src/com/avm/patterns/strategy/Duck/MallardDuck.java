package com.avm.patterns.strategy.Duck;


import com.avm.patterns.strategy.Duck.behavior.fly.FlyWithWings;
import com.avm.patterns.strategy.Duck.behavior.quack.Quack;

/**
 * Created by AVM on 13.05.2016 15:30.
 */

public class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is a mallard duck!");
    }

}
