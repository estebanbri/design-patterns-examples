package estructural.Flyweight.ejemplo_practico.con_patron;

public class Arbol {

    private int positionX;
    private int positionY;
    private TipoArbol tipoArbol;

    public Arbol(TipoArbol tipoArbol, int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.tipoArbol = tipoArbol;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public TipoArbol getTipoArbol() {
        return tipoArbol;
    }

    public void setTipoArbol(TipoArbol tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", tipoArbol=" + tipoArbol +
                '}';
    }
}
