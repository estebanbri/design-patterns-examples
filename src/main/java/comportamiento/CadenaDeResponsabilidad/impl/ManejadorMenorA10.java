package comportamiento.CadenaDeResponsabilidad.impl;

import comportamiento.CadenaDeResponsabilidad.Manejador;

public class ManejadorMenorA10 extends Manejador {
    @Override
    public void comprobar(int numero) {
        if(numero < 10) {
            System.out.println("El numero " + numero +  " es menor a 10");
        } else {
            if( this.getSiguienteManejador() != null ) {
                this.getSiguienteManejador().comprobar( numero ); // Vas encadenando las llamadas
            }
        }
    }
}
