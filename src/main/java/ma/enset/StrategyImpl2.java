package ma.enset;

/**
 * @author $ {USER}
 **/
public class StrategyImpl2 implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("*************BEGIN STRATEGY 2*************");
        System.out.println("This is the Second Strategy ");
        System.out.println("==============END STRATEGY 2==============");
    }
}
