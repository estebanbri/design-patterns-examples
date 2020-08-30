package estructural.Fachada;

import estructural.Fachada.control_stock.ControlStock;
import estructural.Fachada.envio.EnvioDomicilio;
import estructural.Fachada.facturacion.Facturacion;

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
