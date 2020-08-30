package comportamiento.Observer.ejemplo_teorico.subject;

import comportamiento.Observer.ejemplo_teorico.observer.AbstractObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *  Publisher
 */
public class Subject {

    private List<AbstractObserver> observers = new ArrayList<>();

    /**
     *  When this object state change, this will notify subscribers/Observers
     */
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    /**
     *  Cuando el subject cambia de estado los observadores subscriptos son notificados
     */
    private void notifyObservers() {
        for(AbstractObserver observer : observers){
            observer.update();
        }
    }

    public void subscribeObserver(AbstractObserver observer){
        this.observers.add(observer);
    }

    public void unsubscribeObserver(AbstractObserver observer){
        this.observers.remove(observer);
    }



}
