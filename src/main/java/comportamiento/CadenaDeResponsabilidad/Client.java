package comportamiento.CadenaDeResponsabilidad;

import comportamiento.CadenaDeResponsabilidad.impl.ManejadorMayorA20;
import comportamiento.CadenaDeResponsabilidad.impl.ManejadorMenorA10;
import comportamiento.CadenaDeResponsabilidad.impl.ManejadorMenorACero;

public class Client {

    public static void main(String[] args) {

        Manejador menorACero = new ManejadorMenorACero();
        Manejador mayorA10 = new ManejadorMenorA10();
        Manejador mayorA20 = new ManejadorMayorA20();

        // El cliente tiene la potestad de definir el orden de encadenamiento de los manejadores
        menorACero.setSiguienteManejador(mayorA10);
        mayorA10.setSiguienteManejador(mayorA20);

        // Disparamos el primer manejador
        menorACero.comprobar(21);

    }

}
