package comportamiento.State.ejemplo_practico.state.impl;

import comportamiento.State.ejemplo_practico.context.Tamagochi;
import comportamiento.State.ejemplo_practico.state.IState;

public class CansadoState implements IState {

    private Tamagochi tamagochi;

    public CansadoState(Tamagochi tamagochi) {
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
        System.out.println("Buenas noches..");
        tamagochi.setState(new DurmiendoState(tamagochi));
    }

    @Override
    public void despertar() {
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueño..");
    }

}
