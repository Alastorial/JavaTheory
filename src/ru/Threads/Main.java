package ru.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> printNumbers(700)); // Создаем поток
        thread.setName("Worker");
        thread.setDaemon(false);  // поток демон лютый (отключается после завершения главного потока)
        thread.start(); // запускаем поток
//        Thread.sleep(500);  // делаем задержку перед своей логикой
        printNumbers(700  ); // запускаем свою логику
        System.out.println("Done");
    }

    private static void printNumbers(int delay) {
        try {
            Thread currentThread = Thread.currentThread();
            for (int i = 0; i < 10; i++) {

                System.out.println(currentThread.getName() + ": " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void hardWork() {
        System.out.println("\u001B[31mHell\u001B[0mo world!!");

        long start = System.currentTimeMillis();

        double sum = 0;

        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i * i * i - Math.sqrt(i + 1);
        }
        long end = System.currentTimeMillis();
        System.out.println("Dome in " + (end - start) / 1000 + "s. Result: " + sum);
    }
}
