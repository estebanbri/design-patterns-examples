package comportamiento.Observer.ejemplo_practico.observer.impl;

import comportamiento.Observer.ejemplo_practico.observer.AbstractComercio;
import comportamiento.Observer.ejemplo_practico.subject.MercadoLibre;

public class ComercioA extends AbstractComercio {

    public ComercioA(MercadoLibre mercadoLibre){
        this.mercadoLibre = mercadoLibre;
        this.mercadoLibre.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Ya hay de nuevo stock (Notificacion Comercio A)");
    }

}
