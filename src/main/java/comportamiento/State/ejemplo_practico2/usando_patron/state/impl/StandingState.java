package comportamiento.State.ejemplo_practico2.usando_patron.state.impl;

import comportamiento.State.ejemplo_practico2.usando_patron.context.MovementSystem;
import comportamiento.State.ejemplo_practico2.usando_patron.state.IState;

import java.util.Random;

public class StandingState implements IState {

    private MovementSystem movementSystem;

    private boolean jump;
    private boolean crouch;

    public StandingState(MovementSystem movementSystem) {
        this.movementSystem = movementSystem;
    }

    @Override
    public void readInput() {
        System.out.println("readInput() " + this.getClass().getSimpleName());
        boolean simulatedInput = simularInput();
        jump = simulatedInput;  // Simulo que pulso la tecla de saltar
        crouch = !simulatedInput;
    }

    @Override
    public void logicUpdate() {
        System.out.println("logicUpdate() " + this.getClass().getSimpleName());
        if(jump) {
            movementSystem.changeState(new JumpingState(movementSystem));
        } else if(crouch) {
            movementSystem.changeState(new DuckingState(movementSystem));
        }
    }

    private boolean simularInput(){
        Random ran = new Random();
        return ran.nextBoolean();
    }

}
