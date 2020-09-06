package comportamiento.State.ejemplo_practico.state.impl;

import comportamiento.State.ejemplo_practico.context.Tamagochi;
import comportamiento.State.ejemplo_practico.state.IState;

public class DurmiendoState implements IState {

    private Tamagochi tamagochi;

    public DurmiendoState(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void jugar() {
    }

    @Override
    public void alimentar() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void despertar() {
        System.out.println("Buenas, me desperte...");
        tamagochi.setState(new AburridoState(tamagochi));
    }

    @Override
    public void comoEstas() {
        System.out.println("ZzzzZZzzzz..");
    }

}
