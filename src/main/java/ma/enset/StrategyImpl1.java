package ma.enset;

/**
 * @author $ {USER}
 **/
public class StrategyImpl1 implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("*************BEGIN STRATEGY 1*************");
        System.out.println("This is the First Strategy ");
        System.out.println("==============END STRATEGY 1==============");
    }
}
