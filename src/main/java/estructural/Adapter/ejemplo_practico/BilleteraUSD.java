package estructural.Adapter.ejemplo_practico;

// Billetera (Clase Adaptee a la cual queremos adaptar otros tipos de monedas) que solo maneja dolares
public class BilleteraUSD {

    private float dinero;

    public void ingresarDinero(float cantidad){
        this.dinero += cantidad;
    }

    public void retirarDinero(float cantidad){
        this.dinero -= cantidad;
    }

    public void  mostrarDineroDisponible() {
        System.out.println("Cantidad de dinero disponible: " + this.dinero);
    }
}
