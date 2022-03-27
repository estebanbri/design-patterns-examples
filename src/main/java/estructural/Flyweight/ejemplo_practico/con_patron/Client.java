package estructural.Flyweight.ejemplo_practico.con_patron;

public class Client {
    public static void main(String[] args) {
        Campo campo = new Campo();
        int posX = 0;

        for(int i = 0; i < 100; i++){
            posX = posX + 10;
            campo.agregarArbol("pino",posX,0);
        }

        campo.mostrarArboles();
    }
}
