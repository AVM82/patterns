package com.avm.patterns.strategy;

import com.avm.patterns.strategy.Battle.Arena;
import com.avm.patterns.strategy.Duck.MiniDuckSimulator;

public class Main {

    public static void main(String[] args) {

//        MiniDuckSimulator miniDuckSimulator = new MiniDuckSimulator();
//        miniDuckSimulator.run();

        Arena arena = new Arena();
        arena.run();


    }
}
