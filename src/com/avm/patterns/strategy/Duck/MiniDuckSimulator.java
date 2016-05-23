/**
 * Created by AVM on 13.05.2016 15:31.
 */
package com.avm.patterns.strategy.Duck;


import com.avm.patterns.strategy.Duck.behavior.fly.FlyOnRocket;
import com.avm.patterns.strategy.Duck.behavior.quack.QuackBehavior;

public class MiniDuckSimulator {
    public void run() {
        ModelDuck modelDuck = new ModelDuck();
        MallardDuck mallardDuck = new MallardDuck();

        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.quackBehavior.quack3();
        modelDuck.swing();
        modelDuck.flyBehavior.fly();
        System.out.println("//*******************************************//");

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.quackBehavior.quack3();
        mallardDuck.swing();
        mallardDuck.flyBehavior.fly();
        System.out.println("//*******************************************//");

        modelDuck.flyBehavior = new FlyOnRocket();

        modelDuck.setQuackBehavior(new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println("Bang!");
            }

            @Override
            public void quack3() {
                System.out.print("Bang! Bang!");
                quack();

            }
        });

        modelDuck.display("I'm a wood duck on the rocket!");
        modelDuck.flyBehavior.fly();
        modelDuck.performQuack();
        modelDuck.quackBehavior.quack3();
    }
}
