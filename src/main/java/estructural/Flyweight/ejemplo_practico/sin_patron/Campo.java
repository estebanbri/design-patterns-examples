package estructural.Flyweight.ejemplo_practico.sin_patron;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private List<Arbol> arboles = new ArrayList<>();

    public void agregarArbol(Arbol arbol) {
        arboles.add(arbol);
    }

    public void mostrarArboles() {
        arboles.forEach(System.out::println);
    }

}
