package comportamiento.Strategy.ejemplo_practico.strategy.impl;

import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;


public class GunAttackStrategy implements IStrategy {

    private static final int gunDamage = 50;

    @Override
    public void execute(int health) {
        health -= gunDamage;
        System.out.println("Making gun damage current health: " + health);
    }
}
