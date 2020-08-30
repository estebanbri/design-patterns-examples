package estructural.Fachada.ejemplo_practico;

import estructural.Fachada.ejemplo_practico.control_stock.ControlStock;
import estructural.Fachada.ejemplo_practico.envio.EnvioDomicilio;
import estructural.Fachada.ejemplo_practico.facturacion.Facturacion;

public class FachadaProcesoCompra {

    private ControlStock controlStock;
    private Facturacion facturacion;
    private EnvioDomicilio envioDomicilio;

    public FachadaProcesoCompra(){
        controlStock = new ControlStock();
        facturacion = new Facturacion();
        envioDomicilio = new EnvioDomicilio();
    }

    public void compra(String idCliente) {
        controlStock.controlar(idCliente);
        facturacion.facturar(idCliente);
        envioDomicilio.enviar(idCliente);
    }

}
