package comportamiento.Observer.ejemplo_teorico.observer.impl;

import comportamiento.Observer.ejemplo_teorico.observer.AbstractObserver;
import comportamiento.Observer.ejemplo_teorico.subject.Subject;

/**
 *  Subscriber
 */
public class ObserverB extends AbstractObserver {

    public ObserverB(Subject subject){
        this.subject = subject;
        this.subject.subscribeObserver(this); // Every observer auto-register itself
    }

    @Override
    public void update() {
        System.out.println("Ejecutandose update() de {Observador B} por el cambio de estado del Subject");
    }
}
