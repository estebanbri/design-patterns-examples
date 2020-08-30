package comportamiento.Observer.ejemplo_teorico;

import comportamiento.Observer.ejemplo_teorico.observer.impl.ObserverA;
import comportamiento.Observer.ejemplo_teorico.observer.impl.ObserverB;
import comportamiento.Observer.ejemplo_teorico.subject.Subject;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test(){
        Subject subject = new Subject();

        new ObserverA(subject);
        new ObserverB(subject);

        // Change state of Subscriber and this will trigger the Observers notification
        subject.setState(10);
    }

}
