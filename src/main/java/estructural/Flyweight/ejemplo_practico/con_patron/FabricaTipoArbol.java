package estructural.Flyweight.ejemplo_practico.con_patron;

import java.util.HashMap;
import java.util.Map;

// Fabrica de clase Flyweight
public class FabricaTipoArbol {

    private static Map<String, TipoArbol> tipoArboles = new HashMap<>();

    public static TipoArbol getInstance(String nombre) {
        TipoArbol tipoArbol = tipoArboles.get(nombre);
        if(tipoArbol == null) { // refactor computeIfAbsent
            tipoArbol = new TipoArbol(nombre);
            tipoArboles.put(nombre, tipoArbol);
        }
        return tipoArbol;
    }

}
