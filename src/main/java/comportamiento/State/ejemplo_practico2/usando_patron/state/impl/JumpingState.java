package comportamiento.State.ejemplo_practico2.usando_patron.state.impl;

import comportamiento.State.ejemplo_practico2.usando_patron.context.MovementSystem;
import comportamiento.State.ejemplo_practico2.usando_patron.state.IState;

public class JumpingState implements IState {

   private MovementSystem movementSystem;

   private boolean onGround = false;

   public JumpingState(MovementSystem movementSystem) {
        this.movementSystem = movementSystem;
   }

    @Override
    public void readInput() {
        System.out.println("readInput() " + this.getClass().getSimpleName());
    }

    @Override
    public void logicUpdate() {
        System.out.println("logicUpdate() " + this.getClass().getSimpleName());
       onGround = true; // simulo el cambio de estado deberia cambiar a true una vez que ya tocó el piso
       if(onGround){
           movementSystem.changeState(new StandingState(movementSystem));
       }
    }

}
