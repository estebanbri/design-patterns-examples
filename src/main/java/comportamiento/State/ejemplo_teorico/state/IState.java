package comportamiento.State.ejemplo_teorico.state;

/**
 *  Cada estado estará conformado por n acciones definidas en este contrato
 *  Cada estado tendra le dará su propia implemenentacion a cada accion.
 */
public interface IState {
     void doAction();
}
