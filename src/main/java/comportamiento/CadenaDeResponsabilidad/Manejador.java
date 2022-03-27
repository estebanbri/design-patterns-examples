package comportamiento.CadenaDeResponsabilidad;

public abstract class Manejador {

    private Manejador siguienteManejador; // Con esto se logra el enlace de cada manejador

    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract void comprobar(int numero);
}
