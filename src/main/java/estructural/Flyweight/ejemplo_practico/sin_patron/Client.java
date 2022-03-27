package estructural.Flyweight.ejemplo_practico.sin_patron;

public class Client {
    public static void main(String[] args) {


        Campo campo = new Campo();
        int posX = 0;

        for(int i = 0; i < 100; i++){
            posX = posX + 10;
            campo.agregarArbol(new Arbol("pino",posX,0));
        }

        campo.mostrarArboles();


    }
}
