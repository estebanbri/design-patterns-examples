package estructural.Adapter;

import estructural.Adapter.ejemplo_teorico.Cliente;
import estructural.Adapter.ejemplo_teorico.adapter.ITarget;
import estructural.Adapter.ejemplo_teorico.adapter.impl.Adapter;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void testOldImplementation() {
        ITarget target = new Cliente();
        assertEquals(11, target.request(5,6));
    }

    @Test
    public void testNewImplementationWithAdapter() {
        ITarget target = new Adapter();
        assertEquals(11, target.request(5,6));
    }
}