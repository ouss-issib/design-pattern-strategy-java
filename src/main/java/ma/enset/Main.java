package ma.enset;

import java.util.Scanner;

/**
 * @author $ {USER}
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quelle Stratégie ? ");
            String strategyClassName =  scanner.next();
            Strategy strategy = (Strategy) Class.forName("ma.enset."+strategyClassName).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}