package comportamiento.Observer.ejemplo_teorico.observer;

import comportamiento.Observer.ejemplo_teorico.subject.Subject;

public abstract class AbstractObserver {
    protected Subject subject;
    public abstract void update();
}
