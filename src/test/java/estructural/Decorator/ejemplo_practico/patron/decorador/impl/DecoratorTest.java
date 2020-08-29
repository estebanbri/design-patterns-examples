package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;
import estructural.Decorator.ejemplo_practico.patron.componente.impl.MessageProcessor;
import estructural.Decorator.ejemplo_teorico.patron.component.Component;
import estructural.Decorator.ejemplo_teorico.patron.component.impl.ConcreteComponent;
import estructural.Decorator.ejemplo_teorico.patron.decorator.impl.ConcreteDecoratorA;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    // Test de ejemplos teoricos

    @Test
    public void componentNondecorated() {
        Component component = new ConcreteComponent();
        assertEquals("{ TEST }", component.operation("TEST"));
    }

    @Test
    public void componentDecorated() {
        Component component = new ConcreteComponent();
        component.operation("TEST");
        Component decoratedComponent = new ConcreteDecoratorA(component);
        assertEquals("[ { TEST } ]", decoratedComponent.operation("TEST"));
    }

    // Test de ejemplos practicos

    @Test
    public void messageProcessorTest(){
        MessageProcessable procesor = new MessageProcessor("Hola");
        assertEquals("Hola", procesor.process());
    }

    @Test
    public void messageProcessorDecoratedWithEmailSender(){
        MessageProcessable procesor = new EmailSenderMessageDecorator(new MessageProcessor("Hola"));
        assertEquals("Hola", procesor.process());
    }

    @Test
    public void messageProcessorDecoratedWithEncodeAndEmailSender(){
        MessageProcessable procesor = new EmailSenderMessageDecorator(new EncodeMessageDecorator(new MessageProcessor("Hola")));
        assertEquals("aloH", procesor.process());
    }

    @Test
    public void messageProcessorDecoratedWithEncodeAndEmailSenderAndDecode(){
        MessageProcessable procesor = new DecodeMessageDecorator(new EmailSenderMessageDecorator(new EncodeMessageDecorator(new MessageProcessor("Hola"))));
        assertEquals("Hola", procesor.process());
    }

}