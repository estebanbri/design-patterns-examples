package comportamiento.Memento;

public class Vigilante {

    private Memento memento; // Este puede ser un array de mementos en caso de que quieras guardar N estados

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
