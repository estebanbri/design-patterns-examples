package estructural.Fachada;

import org.junit.Test;

public class FachadaProcesoCompraTest {

    @Test
    public void testProcesoCompra() {
        FachadaProcesoCompra fachada = new FachadaProcesoCompra();
        fachada.compra("ID-123");
    }
}