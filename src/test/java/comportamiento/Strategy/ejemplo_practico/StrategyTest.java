package comportamiento.Strategy.ejemplo_practico;

import comportamiento.Strategy.ejemplo_practico.context.AttackContext;
import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;
import comportamiento.Strategy.ejemplo_practico.strategy.impl.GunAttackStrategy;
import comportamiento.Strategy.ejemplo_practico.strategy.impl.SwordAttackStrategy;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void testChangingSwordAttackStrategytoGunAttackStrategyInRuntime(){
        final int health = 100;
        IStrategy strategyA = new SwordAttackStrategy();
        IStrategy strategyB = new GunAttackStrategy();

        AttackContext context = new AttackContext(strategyA);

        context.attack(health);

        context.setStrategy(strategyB);

        context.attack(health);
    }
}
