package comportamiento.Mediator;

public class MediadorImpl implements Mediador {

    private Colega colega1;
    private Colega colega2;

    @Override
    public void agregarColega(Colega colega) {
        if (colega1 == null) {
            colega1 = colega;
            colega1.setMediador(this);
        } else {
            colega2 = colega;
            colega2.setMediador(this);
        }
    }

    @Override
    public void saludar() { // Puede ser cualquier metodo que reciba parametros segun tu requerimiento pero a modo de ejemplo es un metodo foo que cuando un colega emite un evento llamando a dicho metodo se ejecutara lo que esta en este body
        System.out.println("Evento emitido algun colega - comenzando a saludar");
        colega1.decirHola();
        colega2.decirHola();
    }



}
