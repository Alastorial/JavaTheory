package ru.Alastorial.test1;

import java.util.Locale;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a % 10 == 1) {
            System.out.println(a + " TOPT");
        } else if (a > 1 && a < 5) {
            System.out.println(a + " TOPTA");
        } else if (a == 13) {
            System.out.println(a + " TOPTA");
        } else {
            System.out.println(a + " TOPTOB");
        }
    }
}
