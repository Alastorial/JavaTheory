package ru.Alastorial.test1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println(number + 67);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        System.out.println("Sum is: " + (n1 + n2));



    for (int i = 60; i >= 50; i--) {
        System.out.println("for loop: " + i);
    }

    int[] array1 = new int[3];
    array1[0] = 65;
    array1[1] = 5;
    array1[2] = 8;

    int[] array2 = {65, 5, 8};

    for (int value : array2) {
        System.out.println(value);
    }
// хуйпиздавагиначмодавалкалесбиянкапидормудилапидорас
    int[][] dem2Arr = new int[2][5];
    for (int[] row : dem2Arr) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("ХУЙ");
    }

        float N = sc.nextInt();
//        int[] ans = new int[N];
//        while (N > 0) {
//            if (N >= 10) {
//                System.out.print("10 ");
//                N -= 10;
//            }
//            else if (N >= 9) {
//                System.out.print("9 ");
//                N -= 9;
//            }
//            else if (N >= 5) {
//                System.out.print("5 ");
//                N -= 5;
//            }
//            else if (N >= 1) {
//                System.out.print("1 ");
//                N -= 1;
//            }
//        }


//        while (N > 0) {
//
//            if (N % 10 == 0) {
//                for (int i = 0; i < N / 10; i++) {
//                    System.out.print("10 ");
//                    N -= 10;
//                }
//            }
//            else if (N % 9 == 0) {
//                for (int i = 0; i < N / 9; i++) {
//                    System.out.print("9 ");
//                    N -= 9;
//                    if (N % 10 == 0) {
//                        for (int j = 0; j < N / 10; j++) {
//                            System.out.print("10 ");
//                            N -= 10;
//                        }
//                        break;
//                    }
//                }
//            }
//            else if (N % 5 == 0) {
//                for (int i = 0; i < N / 5; i++) {
//                    System.out.print("5 ");
//                    N -= 5;
//                    if (N % 10 == 0) {
//                        for (int j = 0; j < N / 10; j++) {
//                            System.out.print("10 ");
//                            N -= 10;
//                        }
//                        break;
//                    }
//                    if (N % 9 == 0) {
//                        for (int j = 0; j < N / 9; j++) {
//                            System.out.print("9 ");
//                            N -= 9;
//                        }
//                        break;
//                    }
//                }
//            }
//            else {
//                System.out.print("1 ");
//                N -= 1;
//            }
//        }


    }

}
