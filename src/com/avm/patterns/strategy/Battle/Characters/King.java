package com.avm.patterns.strategy.Battle.Characters;

import com.avm.patterns.strategy.Battle.behavior.shield.Impls.IronShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.Sword;

import java.lang.*;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class King extends Fighter {


    public King(int health, int strong, String name) {

        super(health, strong, name);
        weaponBehavior = new Sword(25);
        shieldBehavior = new IronShield(60);
    }





}
