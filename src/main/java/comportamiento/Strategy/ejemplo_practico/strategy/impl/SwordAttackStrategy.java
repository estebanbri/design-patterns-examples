package comportamiento.Strategy.ejemplo_practico.strategy.impl;

import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;

public class SwordAttackStrategy implements IStrategy {

    private static final int swordDamage = 20;

    @Override
    public void execute(int health) {
        health -= swordDamage;
        System.out.println("Making sword damage current health: " + health);
    }
}
