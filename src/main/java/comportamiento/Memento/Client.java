package comportamiento.Memento;

public class Client {
    public static void main(String[] args) {

        // Originador: Clase inicial que necesitas guardar su estado inicial
        Transaccion transaccion = new Transaccion("estado1"); // tu clase a la cual queres guardar su estado inicial

        Vigilante vigilante = new Vigilante(); // actua de interfaz para acceder al memento asi no accedemos directamente al memento

        vigilante.setMemento(transaccion.crearMemento()); // en este momento se crea el objeto memento con el estado inicial cuando nacio el objeto Originador

        System.out.println("Estado de Originador: " + transaccion.getEstado());
        System.out.println("Estado de Memento: " + vigilante.getMemento().getEstado());

        // PARTE IMPORTANTE! :
        // Ahora podemos modificar el estado del objeto Originador y el estado del memento permanece inalterado
        transaccion.setEstado("estado2-nuevo");

        System.out.println("Estado de Originador: " + transaccion.getEstado());
        System.out.println("Estado de Memento: " + vigilante.getMemento().getEstado());

        // Supongamos que estamos en una transaccion y falla por ende queremos recuperar el estado inicial del Originador hacerle como un reset
        // Entonces simplemente le re-asignamos el estado del Memento al objeto Originador.
        System.out.println("Restaurando estado del Originador gracias al memento...");
        transaccion.setEstado(vigilante.getMemento().getEstado());

        System.out.println("Estado de Originador restaurado: " + transaccion.getEstado());

    }
}
