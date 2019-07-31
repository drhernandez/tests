package patterns.observer;

public class Main {

    public static void main(String[] args) {

        Exhibitionist observado = new Exhibitionist();
        Miron observador = new Miron();

        observado.addObserver(observador);

        observado.setValue("Valor inicial");


        //Esto está mal, no está bien implementado lo de observer
    }
}
