package comportamiento.Memento;

public class Transaccion {

    private String estado;

    public Transaccion(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método guardar el estado inicial de la transaccion
    public Memento crearMemento() {
        return new Memento(estado);
    }
}
