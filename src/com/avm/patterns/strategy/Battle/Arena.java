package com.avm.patterns.strategy.Battle;

import com.avm.patterns.strategy.Battle.behavior.Characters.King;
import com.avm.patterns.strategy.Battle.behavior.shield.Impls.IronShield;
import com.avm.patterns.strategy.Battle.behavior.shield.Impls.WoodShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.*;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Arena {
    void run() {

        Sword kingSword = new Sword(7);
        Sword knightSword = new Sword(9);
        Axe trollAxe = new Axe(15);
        BowAndArrow bowAndArrow = new BowAndArrow(12);
        Knife knife = new Knife(5);

        WoodShield woodShield = new WoodShield(15);
        IronShield ironShields = new IronShield(35);

        King king = new King(500, 10);
        king.setWeapon(kingSword);
        king.setShield(ironShields);
    }
}
