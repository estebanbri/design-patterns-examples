package comportamiento.State.ejemplo_practico2.usando_patron.context;

import comportamiento.State.ejemplo_practico2.usando_patron.state.IState;
import comportamiento.State.ejemplo_practico2.usando_patron.state.impl.StandingState;

public class MovementSystem {

    private IState state;

    public MovementSystem(){
        changeState(new StandingState(this)); // Starting state
    }

    public IState getState() {
        return state;
    }

    public void changeState(IState state) {
        this.state = state;
    }
}
