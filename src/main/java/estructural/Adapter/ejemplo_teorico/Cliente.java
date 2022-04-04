package estructural.Adapter.ejemplo_teorico;

import estructural.Adapter.ejemplo_teorico.adaptee.Adaptee;
import estructural.Adapter.ejemplo_teorico.adapter.ITarget;
import estructural.Adapter.ejemplo_teorico.adapter.impl.Adapter;

public class Cliente {

    public static void main(String[] args) {

        // Old version usaba un array como param
        Adaptee toDeprecate = new Adaptee();
        toDeprecate.specificRequest(new int[]{1,2});

        // Usando el adaptador con 2 params
        ITarget target = new Adapter();
        target.request(2,4); // Este call adapta estos dos argumentos y los transforma a un array
    }

}
