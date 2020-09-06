package comportamiento.State.ejemplo_teorico;

import comportamiento.State.ejemplo_teorico.context.Context;
import org.junit.Test;

public class StateTest {

    @Test
    public void doAction() {
        Context context = new Context();

        context.doAction();

        context.doAction();

    }

}