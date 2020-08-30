package estructural.Fachada.ejemplo_practico;

import org.junit.Test;

import static org.junit.Assert.*;

public class FachadaProcesoCompraTest {

    @Test
    public void testProcesoCompra() {
        FachadaProcesoCompra fachada = new FachadaProcesoCompra();
        fachada.compra("ID-123");
    }
}