package com.avm.patterns;

import com.avm.patterns.strategy.Duck.MiniDuckSimulator;

public class Main {

    public static void main(String[] args) {

        MiniDuckSimulator miniDuckSimulator = new MiniDuckSimulator();
        miniDuckSimulator.run();


    }
}
