package comportamiento.State.ejemplo_teorico.state.impl;

import comportamiento.State.ejemplo_teorico.context.Context;
import comportamiento.State.ejemplo_teorico.state.IState;

public class ConcreteStateA implements IState {

    private Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void doAction() {
        System.out.println("doAction ConcreteStateA");
        context.changeState(new ConcreteStateB(context));
    }

}
