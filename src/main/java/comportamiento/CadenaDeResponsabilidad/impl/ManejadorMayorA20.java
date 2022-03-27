package comportamiento.CadenaDeResponsabilidad.impl;

import comportamiento.CadenaDeResponsabilidad.Manejador;

public class ManejadorMayorA20 extends Manejador {
    @Override
    public void comprobar(int numero) {
        if(numero >= 20) {
            System.out.println("El numero " + numero +  " es mayor a 20");
        } else {
            if( this.getSiguienteManejador() != null ) {
                this.getSiguienteManejador().comprobar( numero ); // Vas encadenando las llamadas
            }
        }
    }
}
