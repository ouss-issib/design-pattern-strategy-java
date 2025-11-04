package ma.enset;

/**
 * @author $ {USER}
 **/
public class StrategyImpl3 implements Strategy {
    private Strategy strategy;
    @Override
    public void operationStrategy() {
        System.out.println("*************BEGIN STRATEGY 3*************");
        System.out.println("This is the Third Strategy ");
        System.out.println("==============END STRATEGY 3==============");
    }
}
