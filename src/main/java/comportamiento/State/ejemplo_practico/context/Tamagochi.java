package comportamiento.State.ejemplo_practico.context;

import comportamiento.State.ejemplo_practico.state.IState;
import comportamiento.State.ejemplo_practico.state.impl.AburridoState;

public class Tamagochi {

    // Va a mantener la referencia al state actual
    private IState state;

    public Tamagochi(){
        setState(new AburridoState()); // stateA es el estado inicial
    }

    public void setState(IState currentState) {
        this.state = currentState;
        this.state.setTamagochi(this);
        System.out.println("Current State: " + currentState.getClass().getSimpleName());
    }

    public IState getState() {
        return state;
    }

    public void jugar(){
        state.jugar();
    }

    public void dormir(){
        state.dormir();
    }

    public void despertar(){
        state.despertar();
    }

    public void alimentar(){
        state.alimentar();
    }

    public void comoEstas(){
        state.comoEstas();
    }
}
