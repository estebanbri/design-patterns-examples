package estructural.Adapter.ejemplo_teorico;

import estructural.Adapter.ejemplo_teorico.adapter.ITarget;

public class Cliente implements ITarget {

    @Override
    public int request(int a, int b) { // This interface and logic will be deprecated
        System.out.println("Executing old logic of client");
        return a + b;
    }

}
