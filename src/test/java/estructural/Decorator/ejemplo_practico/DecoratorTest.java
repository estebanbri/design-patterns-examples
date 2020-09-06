package estructural.Decorator.ejemplo_practico;

import estructural.Decorator.ejemplo_practico.patron.decorador.impl.EmailSenderMessageDecorator;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.EncodeMessageDecorator;
import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;
import estructural.Decorator.ejemplo_practico.patron.componente.impl.MessageProcessor;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.DecodeMessageDecorator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void testMessageProcessor(){
        MessageProcessable procesor = new MessageProcessor("Hola");
        assertEquals("Hola", procesor.process());
    }

    @Test
    public void testMessageProcessorDecoratedWithEmailSender(){
        MessageProcessable procesor = new EmailSenderMessageDecorator(new MessageProcessor("Hola"));
        assertEquals("Hola", procesor.process());
    }

    @Test
    public void testMessageProcessorDecoratedWithEncodeAndEmailSender(){
        MessageProcessable procesor = new EmailSenderMessageDecorator(new EncodeMessageDecorator(new MessageProcessor("Hola")));
        assertEquals("aloH", procesor.process());
    }

    @Test
    public void testMessageProcessorDecoratedWithEncodeAndEmailSenderAndDecode(){
        MessageProcessable procesor = new DecodeMessageDecorator(new EmailSenderMessageDecorator(new EncodeMessageDecorator(new MessageProcessor("Hola"))));
        assertEquals("Hola", procesor.process());
    }

}
