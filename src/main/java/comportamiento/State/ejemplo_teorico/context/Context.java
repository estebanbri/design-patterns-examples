package comportamiento.State.ejemplo_teorico.context;

import comportamiento.State.ejemplo_teorico.state.impl.ConcreteStateA;
import comportamiento.State.ejemplo_teorico.state.IState;

public class Context {

    private IState state; // current state

    public Context(){

        setState(new ConcreteStateA()); // stateA es el estado inicial
    }

    public void doAction(){
        state.doAction();
    }

    public void setState(IState state) {
        this.state = state;
        System.out.println("Current State: " + state.getClass().getSimpleName());
        this.state.setContext(this);
    }

    public IState getState() {
        return state;
    }
}
