package ma.enset;

/**
 * @author $ {USER}
 **/
public class DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("*************BEGIN DEFAULT STRATEGY*************");
        System.out.println("This is the Default Strategy ");
        System.out.println("==============END DEFAULT STRATEGY==============");
    }
}
