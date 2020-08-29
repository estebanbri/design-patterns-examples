package comportamiento.Strategy.ejemplo_practico.context;

import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;

public class AttackContext {

    private IStrategy strategy;

    public AttackContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack(int health) {
        this.strategy.execute(health);
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }

}
