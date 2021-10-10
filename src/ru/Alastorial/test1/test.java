package ru.Alastorial.test1;

import java.util.Locale;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);
//        int n1 = sc.nextInt();
//        System.out.println(n1);
//        double n2 = sc.nextDouble();
//        System.out.println(n2);

        System.out.println((-3) % 3);
        System.out.println((12.72) % 3);
    }
}
