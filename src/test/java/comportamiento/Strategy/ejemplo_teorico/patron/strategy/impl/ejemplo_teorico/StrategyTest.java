package comportamiento.Strategy.ejemplo_teorico.patron.strategy.impl.ejemplo_teorico;

import comportamiento.Strategy.ejemplo_teorico.patron.context.Context;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.IStrategy;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.impl.StrategyA;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.impl.StrategyB;
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