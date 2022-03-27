package estructural.Flyweight.ejemplo_practico.sin_patron;

public class Arbol {

    private String nombre;  // Propiedad que se va a repetir en muchos objetos iguales 4 Bytes ocupa este field en ram TODO: extraer en clase flyweight
    private String imageURL;// Propiedad que se va a repetir en muchos objetos iguales 4 Bytes ocupa este field en ram TODO: extraer en clase flyweight
    private int positionX;  // Cada objeto va a tener su propia posición X
    private int positionY;  // Cada objeto va a tener su propia posición X

    public Arbol(String nombre, int positionX, int positionY) {
        this.nombre = nombre;
        this.positionX = positionX;
        this.positionY = positionY;
        this.imageURL = this.getImageURL();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImageURL() {
        return this.getNombre().concat(".jpg");
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

    @Override
    public String toString() {
        return "Arbol{" +
                "nombre='" + nombre + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
