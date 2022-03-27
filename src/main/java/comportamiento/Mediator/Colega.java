package comportamiento.Mediator;

public class Colega {

    private int id;
    private Mediador mediador;

    public Colega(int id) {
        this.id = id;
    }

    void emitirEvento() { // Emite al mediador
        this.mediador.saludar();
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    public void decirHola() {
        System.out.println("Hola desde colega " + this.id);
    }
}
