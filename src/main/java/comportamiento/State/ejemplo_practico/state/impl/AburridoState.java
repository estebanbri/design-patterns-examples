package comportamiento.State.ejemplo_practico.state.impl;

import comportamiento.State.ejemplo_practico.context.Tamagochi;
import comportamiento.State.ejemplo_practico.state.IState;

public class AburridoState implements IState {

    private Tamagochi tamagochi;

    public AburridoState(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando!");
        tamagochi.setState(new CansadoState(tamagochi));
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void despertar() {

    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo ganas de jugar...");
    }

}
