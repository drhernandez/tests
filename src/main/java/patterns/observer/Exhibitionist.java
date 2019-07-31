package patterns.observer;

import java.util.Observable;

public class Exhibitionist extends Observable {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
