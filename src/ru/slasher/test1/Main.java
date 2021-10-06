package ru.slasher.test1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//        System.out.println(number + 67);
        int n1 = readNumber();
        int n2 = readNumber();
        System.out.println("Sum is: " + (n1 + n2)
        );


    }

    static int readNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
