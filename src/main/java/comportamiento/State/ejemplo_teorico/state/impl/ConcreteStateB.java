package comportamiento.State.ejemplo_teorico.state.impl;

import comportamiento.State.ejemplo_teorico.context.Context;
import comportamiento.State.ejemplo_teorico.state.IState;

public class ConcreteStateB implements IState {


    private Context context;

    @Override
    public void doAction() {
        System.out.println("doAction ConcreteStateB");
        context.setState(new ConcreteStateA());
    }

    public void setContext(Context context){
        this.context = context;
    }

}
