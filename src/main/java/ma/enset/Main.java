package ma.enset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author $ {USER}
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String,Strategy> strategyMap = new HashMap<>();
        Strategy strategy;
        while (true) {
            System.out.println("Quelle Stratégie ? ");
            String strategyClassName =  scanner.next();
            strategy = strategyMap.get(strategyClassName);
            if(strategy == null) {
                System.out.println("Création d'un nouvel objet de strategyIMP");
                strategy = (Strategy) Class.forName("ma.enset."+strategyClassName).getConstructor().newInstance();
                strategyMap.put(strategyClassName,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();

        }
    }
}