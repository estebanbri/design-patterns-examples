package estructural.Adapter.ejemplo_teorico.adapter.impl;

import estructural.Adapter.ejemplo_teorico.adaptee.Adaptee;
import estructural.Adapter.ejemplo_teorico.adapter.ITarget;

public class Adapter implements ITarget {

    private Adaptee adaptee = new Adaptee();

    @Override
    public int request(int a, int b) { // Same interface as Cient interface (for example if this will be deprecated)
        int[] arr = {a , b};
        double result = adaptee.specificRequest(arr); // New Specific interface with improved code version
        return (int)result;
    }

}
