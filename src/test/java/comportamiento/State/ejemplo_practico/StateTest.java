package comportamiento.State.ejemplo_practico;

import comportamiento.State.ejemplo_practico.context.Tamagochi;
import comportamiento.State.ejemplo_teorico.context.Context;
import org.junit.Test;

public class StateTest {

    @Test
    public void test() {
        Tamagochi tamagochi = new Tamagochi();

        tamagochi.comoEstas();

        tamagochi.jugar();

        tamagochi.comoEstas();

        tamagochi.dormir();

        tamagochi.comoEstas();

        tamagochi.despertar();

        tamagochi.comoEstas();


    }

}