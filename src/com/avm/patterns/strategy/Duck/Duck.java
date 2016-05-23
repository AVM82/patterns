package com.avm.patterns.strategy.Duck;


import com.avm.patterns.strategy.Duck.behavior.fly.FlyBehavior;
import com.avm.patterns.strategy.Duck.behavior.quack.QuackBehavior;

/**
 * Created by AVM on 13.05.2016 15:31.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    void performQuack() {
        quackBehavior.quack();
    }


    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


    void swing() {

        System.out.println("I am swiming!!!");

    }


}
