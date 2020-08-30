package estructural.Decorator.ejemplo_teorico;

import estructural.Decorator.ejemplo_teorico.patron.component.Component;
import estructural.Decorator.ejemplo_teorico.patron.component.impl.ConcreteComponent;
import estructural.Decorator.ejemplo_teorico.patron.decorator.impl.ConcreteDecoratorA;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void testComponentNondecorated() {
        Component component = new ConcreteComponent();
        assertEquals("{ TEST }", component.operation("TEST"));
    }

    @Test
    public void testComponentDecorated() {
        Component component = new ConcreteComponent();
        component.operation("TEST");
        Component decoratedComponent = new ConcreteDecoratorA(component);
        assertEquals("[ { TEST } ]", decoratedComponent.operation("TEST"));
    }

}