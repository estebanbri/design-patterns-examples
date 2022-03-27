package comportamiento.CadenaDeResponsabilidad.impl;

import comportamiento.CadenaDeResponsabilidad.Manejador;

public class ManejadorMenorACero extends Manejador {
    @Override
    public void comprobar(int numero) {
        if(numero >= 30) {
            System.out.println("El numero " + numero +  " esta entre 0 y 50");
        }
        if( this.getSiguienteManejador() != null ) {
            this.getSiguienteManejador().comprobar( numero ); // Vas encadenando las llamadas
        }
    }
}
