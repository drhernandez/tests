package multithreading.syncronized_methods;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Executor executor = Executors.newFixedThreadPool(2);

        Book libro = new Book();
        libro.setName("Sincronized");


        CompletableFuture.runAsync(() -> {
            synchronized (libro) {
                System.out.printf("Thread 1. Nombre antes del sleep: %s\n", libro.getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Thread 1. Nombre después del sleep: %s\n", libro.getName());
            }
        });
//        }, executor);

        CompletableFuture.runAsync(() -> {
            synchronized (libro) {
                System.out.printf("Thread 2. Nombre antes de modificar: %s\n", libro.getName());
                libro.setName("Multithreading");
                System.out.printf("Thread 2. Nombre después de modificar: %s\n", libro.getName());
            }
        });
//        }, executor);

        Thread.sleep(5000);
    }
}
