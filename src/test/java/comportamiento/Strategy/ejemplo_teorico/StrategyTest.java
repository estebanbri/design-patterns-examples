package comportamiento.Strategy.ejemplo_teorico;

import comportamiento.Strategy.StrategyA;
import comportamiento.Strategy.StrategyB;
import comportamiento.Strategy.ejemplo_teorico.patron.context.Context;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.IStrategy;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTest {


    @Test
    public void testChangingStrategyAtoStrategyBInRuntime() {
        IStrategy strategyA = new StrategyA();
        IStrategy strategyB = new StrategyB();

        Context context = new Context(strategyA);

        assertEquals(-5, context.execute(5,10));

        context.setStrategy(strategyB);

        assertEquals(15, context.execute(5,10));
    }

}