package ru.Uni.les2;

/*1. Получаем два числа, первое число - длинну серии чисел фибоначи, второе - с какого элемента. 10, 5 - 10 элементов с пятого элемента
* 2. В массиве элемент может изменять ся от 0 до 100, массив динамический, после ввода получаем на вывод сам массви икол=во элеентво в нем, далее вводим число, которое необходимо удалить из массива, после удаления вывод массива и длины
* опять вводим число от 0 до 9, которое удаляет все элементвы, которые окончиваются на это число
* 2. 1 число, то, что будем перводить, 2 - система счисления. Перевести + двоичная и 16-ти ричная*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        third();
//        Scanner in = new Scanner(System.in);
//
//        double num = in.nextDouble();
//        int new_base = in.nextInt();
//        third2(num, new_base);
//        third2(num, 2);
//        third2(num, 16);

    }

    public static void third2(double num, int new_base){
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int int_part = (int) (num);
        double frac_part = num - (int) num;
        ArrayList<Integer> new_int_part = new ArrayList<>();
        ArrayList<Integer> new_frac_part = new ArrayList<>();
        while (int_part != 0) {
            new_int_part.add(int_part % new_base);
            int_part /= new_base;
        }
        Collections.reverse(new_int_part);
        for (Integer i : new_int_part) {
            if (i >= 10) System.out.print(alph.charAt(i - 10));
            else System.out.print(i);
        }
        System.out.print(",");
        //if (frac_part != 0) {
        for (int i = 0; i < 3; i++) {
            new_frac_part.add((int) (frac_part * new_base));
            frac_part = (frac_part * new_base) - (int) (frac_part * new_base);
        }
        //}
        for (Integer i : new_frac_part) {
            if (i >= 10) System.out.print(alph.charAt(i - 10));
            else System.out.print(i);
        }
        System.out.println();
    }


    private static void third() {
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        first();
//        second();
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int to = sc.nextInt();
        int topN = (int) n;
        double bottomN = n % 1;
//        System.out.println(topN);
//        System.out.println(bottomN);

        String firstAns = "";
        while (true) {
            if (topN < to) {
                firstAns = alphabet.charAt(topN) + firstAns;
                break;
            }
//            if (to > 10) {
//                firstAns = alphabet.charAt((topN - topN / to * to) - 10) + firstAns;
//            }
            firstAns = alphabet.charAt(topN - topN / to * to) + firstAns;
            topN = topN / to;
        }
        System.out.print(firstAns + ".");

        String secondAns = "";
        for (int i = 0; i < 4; i++)  {
            secondAns = secondAns + (int)(bottomN * to);
//            System.out.println((bottomN * to));
            bottomN = bottomN * to - (int)(bottomN * to);
        }
        System.out.println(secondAns);
    }

    private static void second() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите длинну массива ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(random.nextInt( 10));
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("\nДлина массива: ");
        System.out.println(arr.size());
        System.out.print("Элемент, который необходимо удалить: ");
        Integer a = sc.nextInt();
        while (true) {
            boolean success = arr.remove(a);
            if (!success) break;
        }
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.print("\nДлина массива: ");
        System.out.println(arr.size());

        System.out.print("Цифра, на которую будут оканчиваться удаленные числа: ");
        Integer b = sc.nextInt();
        int suM = 0;

        for (Integer integer : arr) {
            if (integer % 10 != b) {
                System.out.print(integer + " ");
                suM += 1;
            }
        }
        System.out.print("\nДлина массива: ");
        System.out.println(suM);
    }

    private static void first() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int from = sc.nextInt();
//        int n = 5;
//        int from = 3;
        int a = 0;
        int b = 1;
        for (int i = 0; i < (from + n); i++ ) {
            if (i >= from){
                System.out.println(b);
            }
            int buff = b;
            b += a;
            a = buff;
        }
    }
}
