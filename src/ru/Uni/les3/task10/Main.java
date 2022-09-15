package ru.Uni.les3.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        var res = s.split(" ");
        System.out.println(res.length);
    }
}
