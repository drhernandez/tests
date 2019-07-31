package patterns.strategy;

public interface I3PL {

    void generateLabel();

    default void sarasa() {
        System.out.println("Sarasa");
    }
}
