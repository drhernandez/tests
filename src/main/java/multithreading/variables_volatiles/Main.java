package multithreading.variables_volatiles;

import java.util.concurrent.CompletableFuture;

public class Main {

    /*
        Al ponerle el modificador volatile hago que cualquier hilo que consulte esta variable siempre vaya a la variable original
        y no se fije en la memoria cache del procesador donde puede quedar guardada una copia del objeto looper. Al existir esta
        copia, cuando el 1er thread modifica el valor de stop, el 2do thread nunca se entera porque siempre está leyendo el valor
        de la copia alojada en la cache. Si le pongo volatile "obligo" al procesador que vaya y busque el valor de la variable
        en la ram y no en la cache.
        https://medium.com/@pablocastelnovo/variables-vol%C3%A1tiles-en-java-f5ae078bf8b9
     */
    private volatile boolean _stop;

    //Así nunca va a salir del loop del thread 2
//    private boolean _stop;

    public static void main(String[] args) throws InterruptedException {

        Main looper = new Main();

        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            looper._stop = true;
        });

        CompletableFuture.runAsync(() -> {

            while (!looper._stop) {
            }
            System.out.println("Terminó hilo 2");
        });

        Thread.sleep(4000);
    }
}
