package comportamiento.Observer.ejemplo_practico.subject;

import comportamiento.Observer.ejemplo_practico.observer.AbstractComercio;

import java.util.ArrayList;
import java.util.List;

public class MercadoLibre {

    private List<AbstractComercio> comercios = new ArrayList<>();
    private boolean stock;

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
        if(stock) notificarComercios();
    }

    private void notificarComercios() {
        for(AbstractComercio comercio : comercios){
            comercio.update();
        }
    }

    public void registerObserver(AbstractComercio comercio){
        this.comercios.add(comercio);
    }

    public void unregisterObserver(AbstractComercio comercio){
        this.comercios.remove(comercio);
    }

}
