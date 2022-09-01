package ru.Uni.les1;

import java.util.*;


// сгенерировать массив случайным образом, вывести, отсортировать, потом опять отсортировать и вывести и подход к генерации случайных числе - два способа - Random и map.random
public class Main {
    public static void main(String[] args) {
//        workWithMass();
//        harmonic();
//        summator();


    }

    // сгерерировать рандомный массив двумя способами, потом отсортировать его
    private static void workWithMass() {
//        Scanner sc = new Scanner(System.in);
        int n = 10;
        Random random = new Random();
        int[] Array = new int[n];
        int[] Array2 = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = random.nextInt() % 100;
            Array2[i] = (int) (Math.random() * 100);
        }


        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(Array2[i] + " ");
        }

        Arrays.sort(Array);
        Arrays.sort(Array2);
        System.out.println('\n');

        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(Array2[i] + " ");
        }
    }

    // вывести гармонический ряд
    private static void harmonic() {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
            System.out.printf("%.3f%n", (1.0f / i));
        }
        System.out.printf("%.3f%n", sum);
    }
    // проинициализировать массив и вывести сумму его элементов
    private static void summator() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] Array = new int[n];
        for (int i = 0; i < n; ++i) {
            int input = sc.nextInt();
            Array[i] = input;
            sum += input;
        }
        System.out.println("Сумма - " + sum);

        int i = 0;
        sum = 0;
        while (i < n) {
            sum += Array[i];
            i++;
        }
        System.out.println("Сумма - " + sum);

        i = 0;
        sum = 0;
        do {
            sum += Array[i];
            i++;
        } while (i < n);

        System.out.println("Сумма - " + sum);
    }
}
