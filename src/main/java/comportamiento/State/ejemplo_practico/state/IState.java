package comportamiento.State.ejemplo_practico.state;


import comportamiento.State.ejemplo_practico.context.Tamagochi;

/**
 *  Cada estado esta conformado por n acciones. Cada estado tendra
 *  su propia impl de las acciones definidas en este contrato
 */
public interface IState {
      void jugar();
      void alimentar();
      void dormir();
      void despertar();
      void comoEstas();

      void setTamagochi(Tamagochi tamagochi);
}
