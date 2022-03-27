package comportamiento.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediador mediator = new MediadorImpl();

        Colega colega1 = new Colega(1);
        Colega colega2 = new Colega(2);

        mediator.agregarColega(colega1);
        mediator.agregarColega(colega2);

        colega1.emitirEvento();
    }
}
