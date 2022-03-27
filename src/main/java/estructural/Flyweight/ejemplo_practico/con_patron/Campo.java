package estructural.Flyweight.ejemplo_practico.con_patron;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private List<Arbol> arboles = new ArrayList<>();

    public void agregarArbol(String nombre, int x, int y) {
        TipoArbol tipoArbol = FabricaTipoArbol.getInstance(nombre);
        Arbol arbol = new Arbol(tipoArbol,x,y);
        arboles.add(arbol);
    }

    public void mostrarArboles() {
        arboles.forEach(System.out::println);
    }

}
