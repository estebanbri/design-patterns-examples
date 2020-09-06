package comportamiento.State.ejemplo_teorico.state;

import comportamiento.State.ejemplo_teorico.context.Context;

/**
 *  Cada estado esta conformado por n acciones. Cada estado tendra
 *  su propia impl de las acciones definidas en este contrato
 */
public interface IState {
     void doAction();
}
