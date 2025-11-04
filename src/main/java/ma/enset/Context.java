package ma.enset;

/**
 * @author $ {USER}
 **/
public class Context {

    private Strategy strategy = new DefaultStrategyImpl();

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void effectuerOperation(){
        strategy.operationStrategy();
    };
}
