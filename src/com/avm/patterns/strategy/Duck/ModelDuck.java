package com.avm.patterns.strategy.Duck;

import com.avm.patterns.strategy.Duck.behavior.fly.FlyNoWay;
import com.avm.patterns.strategy.Duck.behavior.quack.MuteQuack;

/**
 * Created by AVM on 13.05.2016 15:31.
 */
public class ModelDuck extends Duck {

    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a wood duck!");
    }

    public void display(String s) {
        System.out.println(s);
    }

}
