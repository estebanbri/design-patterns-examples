package comportamiento.Observer.ejemplo_teorico.observer.impl;

import comportamiento.Observer.ejemplo_teorico.observer.AbstractObserver;
import comportamiento.Observer.ejemplo_teorico.subject.Subject;

/**
 *  Subscriber
 */
public class ObserverA extends AbstractObserver {

    public ObserverA(Subject subject){
        this.subject = subject;
        this.subject.subscribeObserver(this); // Every observer auto-register itself
    }

    @Override
    public void update() {
        System.out.println("Ejecutandose update() de {Observador A} por el cambio de estado del Subject");
    }

}
