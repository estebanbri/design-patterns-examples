package estructural.Adapter.ejemplo_practico;

public class Cliente {

    static final float TAZA_CAMBIO_ARS_USD = 200;


    public static void main(String[] args) {
        BilleteraAdapter adapter = new BilleteraAdapter();

        adapter.ingresarDinero(2000, TAZA_CAMBIO_ARS_USD);

        adapter.mostrarDineroDisponible();

    }

    // billetera.insersarDinero(usd) lo adaptamos las distintas interfaces adapter.ingresarDinero(cantidad, TAZA_CAMBIO);
}
