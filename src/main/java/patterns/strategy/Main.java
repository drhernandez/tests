package patterns.strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Factory strategyFactory = new Factory();
        List<String> implementations = Arrays.asList("Mochila", "Sinostar");
        implementations.forEach(type -> {
            System.out.printf("%s implementation\n", type);
            startFLow();
            I3PL strategy = strategyFactory.selectStrategy(type);
            strategy.generateLabel();
            System.out.println("");
        });
    }

    private static void startFLow() {
        System.out.printf("%s --> Paso 1\n", Main.class);
        System.out.printf("%s --> Paso 2\n", Main.class);
    }
}
