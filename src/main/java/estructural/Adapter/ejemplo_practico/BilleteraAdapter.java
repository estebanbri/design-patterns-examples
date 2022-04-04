package estructural.Adapter.ejemplo_practico;

public class BilleteraAdapter {

    private BilleteraUSD billeteraUSD = new BilleteraUSD();

    public void ingresarDinero(float dinero, float tazaCambio){
        dinero /= tazaCambio;
        this.billeteraUSD.ingresarDinero(dinero);
    }

    public void retirarDinero(float dinero, float tazaCambio){
        dinero /= tazaCambio;
        this.billeteraUSD.retirarDinero(dinero);
    }

    public void  mostrarDineroDisponible() {
        this.billeteraUSD.mostrarDineroDisponible();
    }
}
