package ru.Alastorial.test1;

import java.util.Locale;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), m = in.nextInt(), k = 0;
//        int[][] matrix = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < m; j++) {
//                    matrix[i][j] = k;
//                    k++;
//                }
//            } else {
//                for (int j = m - 1; j >= 0; j--) {
//                    matrix[i][j] = k;
//                    k++;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int n = in.nextInt();
//        int a = 0;
//        int r = 0;
//        for (int i = 0; i < n; i++) {
//            r = in.nextInt();
//            if (r == 0){
//                a += 1;
//            } else {
//                System.out.print(r + " ");
//            }
//        }
//        for (int i = 0; i < a; i++) {
//            System.out.print(0 + " ");
//        }
        int a = 2;
        while (a < 17){
            a *= a;
        }
        System.out.println(a);
    }
}
