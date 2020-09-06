package comportamiento.State.ejemplo_practico2.sin_patron;

import java.util.Random;

public class MovementSystem {

    public static void main(String[] args) {
        MovementSystem mv = new MovementSystem();
        // Simulo el update method del game loop
        for(int i = 0; i < 10; i++){
            mv.readInput();
            mv.logicUpdate();
        }
    }

    private boolean standing;
    private boolean jump;
    private boolean crouch;
    private boolean onGround;
    private boolean crouchHeld;

    MovementSystem(){
        standing = true;
    }

    public void readInput() {
        if(standing){
            System.out.println("readInput() standing");
            boolean simulatedInput = simularInput();
            jump = simulatedInput;  // Simulo que pulso la tecla de saltar
            crouch = !simulatedInput;
        } else if(jump) {
            // nothing to read from keyboard
        } else if(crouch) {
            System.out.println("readInput() ducking");
            crouchHeld = true; // simulamos que solto la tecla de crouch
        }

    }

    public void logicUpdate() {
        if(standing){
            System.out.println("isStanding");
            if(jump) {
                standing = false;
                System.out.println("isJumping");
                onGround = true; // simulo el cambio de estado deberia cambiar a true una vez que ya tocó el piso
                if(onGround){
                    standing = true;
                    jump = false;
                }
            } else if(crouch) {
                System.out.println("isDucking");
                if(crouchHeld){
                    crouchHeld = false;
                    standing = true;
                }
            }
        }
    }


    private boolean simularInput(){
        Random ran = new Random();
        return ran.nextBoolean();
    }

}
