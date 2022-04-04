package estructural.Adapter.ejemplo_teorico.adapter.impl;

import estructural.Adapter.ejemplo_teorico.adaptee.Adaptee;
import estructural.Adapter.ejemplo_teorico.adapter.ITarget;

public class Adapter implements ITarget {

    private Adaptee adaptee = new Adaptee();

    @Override
    public int request(int a, int b) { // Nueva interface
        System.out.println("Executing new logic provided by adapter");
        int[] arr = {a , b};
        double result = adaptee.specificRequest(arr); //  LLamamos al metodo que estamos adaptando
        return (int)result;
    }

}
