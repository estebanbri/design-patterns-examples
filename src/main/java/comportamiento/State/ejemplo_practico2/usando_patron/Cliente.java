package comportamiento.State.ejemplo_practico2.usando_patron;

import comportamiento.State.ejemplo_practico2.usando_patron.context.MovementSystem;

public class Cliente {
    public static void main(String[] args) {

        MovementSystem movementSystem = new MovementSystem();

        // Simulo el update method del game loop
        for(int i = 0; i < 10; i++){
            movementSystem.getState().readInput();
            movementSystem.getState().logicUpdate();
        }
    }
}
