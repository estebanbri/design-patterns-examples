package estructural.Adapter.ejemplo_teorico.adapter.impl;

import estructural.Adapter.ejemplo_teorico.adaptee.Adaptee;
import estructural.Adapter.ejemplo_teorico.adapter.ITarget;

public class Adapter implements ITarget {

    private Adaptee adaptee = new Adaptee(); // Objeto que vamos a adaptar (Alternativa usando composicion, tmb se puede implementar usando herencia esta linea no la pones y le pones que extends de Adaptee asi podes llamar a los metodos de adaptee aca)

    @Override
    public int request(int a, int b) { // Nueva interface
        System.out.println("Executing new logic provided by adapter");
        int[] arr = {a , b};
        double result = adaptee.specificRequest(arr); //  LLamamos al metodo que estamos adaptando
        return (int)result;
    }

}
