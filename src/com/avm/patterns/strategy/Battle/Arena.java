package com.avm.patterns.strategy.Battle;

import com.avm.patterns.strategy.Battle.Characters.*;
import com.avm.patterns.strategy.Battle.behavior.shield.Impls.NoShield;
import com.avm.patterns.strategy.Battle.behavior.weapon.Impls.NoWeapon;

import java.util.LinkedList;
import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by AVM2 on 05.06.2016.
 */
public class Arena {

    LinkedList<Fighter> fighters = new LinkedList<Fighter>();
    final private int USE_SHIELD = 1;
    final private int COUNTERATTACK = 1;

    public void run() {

        addFighter(new King(300, 20, "King"));
        addFighter(new Orc(350, 15, "Orc"));
        addFighter(new Knight(300, 15, "Knight"));
        addFighter(new Troll(400, 20, "Troll"));
        addFighter(new King(355, 11, "Artur"));
        Fighter[] fightPair = new Fighter[2];


        while (fighters.size() > 1) {
            fightPair[0] = findEnemy(fighters);
            System.out.println("First fighter: " + fightPair[0].getName());
            fightPair[1] = findEnemy(fighters.indexOf(fightPair[0]), fighters);
            System.out.println("Second fighter: " + fightPair[1].getName());
            counter(5);
            System.out.println("Fight is beginning...");
            System.out.println("");


            fight(fightPair);
            counter(5);
            System.out.println("*************************************");

        }
        System.out.println("Winner:" + fighters.get(0).getName());


    }

    private void fight(Fighter[] fightPair) {
        Random random = new Random();

        int whoseTurn = random.nextInt(2);
        int enemy = (whoseTurn - 1) * (-1);
        int firstFighterHealth = fightPair[0].getHealth();
        int secondFighterHealth = fightPair[1].getHealth();

        while ((fightPair[0].getHealth() > 0) && (fightPair[1].getHealth() > 0)) {

            System.out.println("*************************************");
            int damage = getDamage(fightPair[whoseTurn]);
            damage = reduceDamage(fightPair[enemy], damage, useShield());

            brokeWeapon(fightPair[whoseTurn]);

            fightPair[enemy].damage(damage);


            System.out.println(fightPair[enemy].getName() +
                    " have " + fightPair[enemy].getHealth() + " health.");

            fightPair[whoseTurn].damage(counterattack(fightPair[enemy]));
            brokeWeapon(fightPair[whoseTurn]);


            System.out.println(fightPair[whoseTurn].getName() +
                    " have " + fightPair[whoseTurn].getHealth() + " health.");

            whoseTurn = (whoseTurn - 1) * (-1);
            enemy = (whoseTurn - 1) * (-1);
        }
        if (fightPair[0].getHealth() < 0) {
            fighters.remove(fightPair[0]);
            fightPair[1].healthRecovery(secondFighterHealth);
        } else {
            fighters.remove(fightPair[1]);
            fightPair[0].healthRecovery(firstFighterHealth);
        }
        System.out.println("It left " + fighters.size() + " fighters");


    }

    private void brokeWeapon(Fighter fighter) {
        Random random = new Random();
        if (random.nextInt(2000) < 50) {
            System.out.println("[" + fighter.getName() + "]: My weapon is broken!!!");
            counter(5);
            fighter.setWeapon(new NoWeapon(3));
        }

    }

    private void brokeShield(Fighter fighter) {
        Random random = new Random();
        if (random.nextInt(2000) < 100) {
            System.out.println("[" + fighter.getName() + "]: My shield is broken!!!");
            counter(5);
            fighter.setShield(new NoShield(0));
        } else {
            System.out.println("[" + fighter.getName() + "]: My shield withstood the blow.");
            counter(5);
        }


    }

    private int counterattack(Fighter fighter) {
        Random random = new Random();
        int damage = 0;
        if (fighter.getHealth() > 0) {
            if (random.nextInt(2) == COUNTERATTACK) {
                System.out.println(fighter.getName() + " counterattack.");
                System.out.print("[" + fighter.getName() + "]: ");
                damage = fighter.attack();
                counter(5);
                System.out.println(fighter.getName() + " causes damage:" + damage);
            }
        }
        return damage;
    }

    private int reduceDamage(Fighter enemy, int damage, boolean useShield) {
        if (useShield) {
            System.out.print("[" + enemy.getName() + "]: ");
            damage = enemy.defense(damage);
            counter(5);
            System.out.println(enemy.getName() + " reduce damage to " + damage);
            if (enemy.getShield().getDefence() != 0) {
                brokeShield(enemy);
            }
        }
        return damage;
    }

    private boolean useShield() {
        Random random = new Random();
        if (random.nextInt(2) == USE_SHIELD) {
            return true;
        } else {
            return false;
        }
    }

    private int getDamage(Fighter fighter) {
        System.out.println(fighter.getName() + " turn");
        System.out.print("[" + fighter.getName() + "]: ");
        int damage = fighter.attack();
        counter(5);
        System.out.println(fighter.getName() + " causes damage:" + damage);
        return damage;
    }

    public void counter(int second) {
        for (int i = second; i > 0; i--) {
            try {
                System.out.print(i);
                sleep(1000);
                System.out.print("\r");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void addFighter(Fighter fighter) {
        fighters.add(fighter);

    }


    private Fighter findEnemy(int whom, LinkedList listFighter) {

        Random random = new Random();
        int index = random.nextInt(listFighter.size());

        while (index == whom) {
            index = random.nextInt(listFighter.size());
        }
        return (Fighter) listFighter.get(index);
    }

    private Fighter findEnemy(LinkedList listFighter) {
        Random random = new Random();
        return (Fighter) listFighter.get(random.nextInt(listFighter.size()));
    }


}
