package comportamiento.Observer.ejemplo_practico.observer;

import comportamiento.Observer.ejemplo_practico.subject.MercadoLibre;

public abstract class AbstractComercio {
    protected MercadoLibre mercadoLibre;
    public abstract void update();
}
