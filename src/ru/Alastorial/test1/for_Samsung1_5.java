package ru.Alastorial.test1;

import java.util.Scanner;

public class for_Samsung1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0 || b % 2 == 0 && c % 2 == 0 ? "true" : "false");


    }
}

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        boolean h;
//        h = (a == b*-1 || a == c*-1 || a == d*-1 || b == c*-1 || b == d*-1 || c == d*-1 || a == 0 || b == 0 || c == 0 || d == 0);
//        System.out.print(h);

//        double n = sc.nextDouble();
//        System.out.println(n % 5 == 0 && n >= 100 && n < 1000 ? "true" : "false");

//        double n = sc.nextDouble();
//        System.out.println(n >= -2 && n <= 3 || n >= 6 && n <= 9 ? "false" : "true");

//        double n = sc.nextDouble();
//        System.out.println(n >= -3 && n <= 5 || n >= 9 && n <= 15 ? "true" : "false");

//        double n = sc.nextDouble();
//        System.out.println(n >= 3 && n <= 8 ? "true" : "false");