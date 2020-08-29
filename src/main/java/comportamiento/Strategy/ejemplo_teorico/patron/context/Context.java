package comportamiento.Strategy.ejemplo_teorico.patron.context;

import comportamiento.Strategy.ejemplo_teorico.patron.strategy.IStrategy;

public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int execute() {
        int result = this.strategy.execute(5,10);
        return result;
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }
}
