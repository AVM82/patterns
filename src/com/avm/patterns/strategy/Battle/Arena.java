package com.avm.patterns.strategy.Battle;

import com.avm.patterns.strategy.Battle.behavior.Characters.King;
import com.avm.patterns.strategy.Battle.behavior.Characters.Knight;
import com.avm.patterns.strategy.Battle.behavior.Characters.Orc;
import com.avm.patterns.strategy.Battle.behavior.Characters.Troll;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Arena {
    public void run() {


        King king = new King(500, 10);
        Knight knight = new Knight(600, 15);
        Troll troll = new Troll(700, 20);
        Orc orc = new Orc(800, 25);




    }
}
