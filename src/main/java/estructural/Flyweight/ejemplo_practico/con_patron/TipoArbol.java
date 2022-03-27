package estructural.Flyweight.ejemplo_practico.con_patron;

// Clase Flyweight
public class TipoArbol {

    private String nombre;
    private String imageURL;

    public TipoArbol(String nombre) {
        this.nombre = nombre;
        this.imageURL = this.getImageURL();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImageURL() {
        return this.nombre.concat(".png");
    }

    @Override
    public String toString() {
        return "TipoArbol{" +
                "nombre='" + nombre + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
