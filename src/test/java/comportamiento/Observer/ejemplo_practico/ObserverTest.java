package comportamiento.Observer.ejemplo_practico;

import comportamiento.Observer.ejemplo_practico.observer.impl.ComercioA;
import comportamiento.Observer.ejemplo_practico.observer.impl.ComercioB;
import comportamiento.Observer.ejemplo_practico.subject.MercadoLibre;
import comportamiento.Observer.ejemplo_teorico.observer.impl.ObserverA;
import comportamiento.Observer.ejemplo_teorico.observer.impl.ObserverB;
import comportamiento.Observer.ejemplo_teorico.subject.Subject;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test(){
        MercadoLibre ml = new MercadoLibre();

        new ComercioA(ml);
        new ComercioB(ml);

        // Change state of Subscriber and this will trigger the Observers notification
        ml.setStock(true);
    }

}
