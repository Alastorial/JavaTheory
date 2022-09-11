package ru.Olimp.A3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastNum = sc.nextInt();
        if (n > 1) {
            int num = sc.nextInt();
            int nextNum;
            int ans = 0;
            for (int i = 1; i < n - 1; ++i) {
                nextNum = sc.nextInt();
                if (num > lastNum && num > nextNum || num < lastNum && num < nextNum) ++ans;
                lastNum = num;
                num = nextNum;
                if (i == n - 1) {
                    nextNum = sc.nextInt();
                    if (num > lastNum && num > nextNum || num < lastNum && num < nextNum) ++ans;
                }
            }

            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
