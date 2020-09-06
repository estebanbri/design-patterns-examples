package comportamiento.State.ejemplo_teorico.context;

import comportamiento.State.ejemplo_teorico.state.impl.ConcreteStateA;
import comportamiento.State.ejemplo_teorico.state.IState;

public class Context {

    private IState state; // current state

    public Context(){
        changeState(new ConcreteStateA(this)); // stateA es el estado inicial
    }

    public void doAction(){
        state.doAction();
    }

    public void changeState(IState state) {
        this.state = state;
        System.out.println("Current State: " + state.getClass().getSimpleName());
    }

    public IState getState() {
        return state;
    }
}
