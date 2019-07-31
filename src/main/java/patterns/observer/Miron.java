package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Miron implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("Cambió el estado del exibicionista: %s", arg.toString());
    }
}
