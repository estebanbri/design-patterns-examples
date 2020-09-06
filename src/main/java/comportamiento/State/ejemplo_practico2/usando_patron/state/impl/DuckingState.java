package comportamiento.State.ejemplo_practico2.usando_patron.state.impl;

import comportamiento.State.ejemplo_practico2.usando_patron.context.MovementSystem;
import comportamiento.State.ejemplo_practico2.usando_patron.state.IState;

public class DuckingState implements IState {

    private MovementSystem movementSystem;

    private boolean crouchHeld;

    public DuckingState(MovementSystem movementSystem) {
        this.movementSystem = movementSystem;
    }

    @Override
    public void readInput() {
        System.out.println("readInput() " + this.getClass().getSimpleName());
        crouchHeld = true; // simulamos que solto la tecla de crouch
    }

    @Override
    public void logicUpdate() {
        System.out.println("logicUpdate() " + this.getClass().getSimpleName());
        if(crouchHeld){
            movementSystem.changeState(new StandingState(movementSystem));
        }
    }
}
