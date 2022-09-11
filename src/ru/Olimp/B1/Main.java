package ru.Olimp.B1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int success = 1;
        if (word.length() == 1 && (word.charAt(0) == 'O'
                || word.charAt(0) == 'o'
                || word.charAt(0) == 'A'
                || word.charAt(0) == 'x'
                || word.charAt(0) == 'X'
                || word.charAt(0) == 'H'
                || word.charAt(0) == 'I'
                || word.charAt(0) == 'M'
                || word.charAt(0) == 'T'
                || word.charAt(0) == 'U'
                || word.charAt(0) == 'V'
                || word.charAt(0) == 'v'
                || word.charAt(0) == 'W'
                || word.charAt(0) == 'w'
                || word.charAt(0) == 'Y')) {
        } else if(word.length() == 1) {
            System.out.println("NIE");
            success = 0;
        }
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == 'o' && word.charAt(word.length() - 1 - i) == 'o'
                    || word.charAt(i) == 'O' && word.charAt(word.length() - 1 - i) == 'O'
                    || word.charAt(i) == 'A' && word.charAt(word.length() - 1 - i) == 'A'
                    || word.charAt(i) == 'x' && word.charAt(word.length() - 1 - i) == 'x'
                    || word.charAt(i) == 'X' && word.charAt(word.length() - 1 - i) == 'X'
                    || word.charAt(i) == 'b' && word.charAt(word.length() - 1 - i) == 'd'
                    || word.charAt(i) == 'd' && word.charAt(word.length() - 1 - i) == 'b'
                    || word.charAt(i) == 'H' && word.charAt(word.length() - 1 - i) == 'H'
                    || word.charAt(i) == 'I' && word.charAt(word.length() - 1 - i) == 'I'
                    || word.charAt(i) == 'M' && word.charAt(word.length() - 1 - i) == 'M'
                    || word.charAt(i) == 'T' && word.charAt(word.length() - 1 - i) == 'T'
                    || word.charAt(i) == 'U' && word.charAt(word.length() - 1 - i) == 'U'
                    || word.charAt(i) == 'V' && word.charAt(word.length() - 1 - i) == 'V'
                    || word.charAt(i) == 'v' && word.charAt(word.length() - 1 - i) == 'v'
                    || word.charAt(i) == 'W' && word.charAt(word.length() - 1 - i) == 'W'
                    || word.charAt(i) == 'w' && word.charAt(word.length() - 1 - i) == 'w'
                    || word.charAt(i) == 'Y' && word.charAt(word.length() - 1 - i) == 'Y'
                    || word.charAt(i) == 'p' && word.charAt(word.length() - 1 - i) == 'q'
                    || word.charAt(i) == 'q' && word.charAt(word.length() - 1 - i) == 'p') {

            } else {
                System.out.println("NIE");
                success = 0;
                break;
            }
        }
        if (word.length() % 2 == 1 && success == 1) {
            if (word.charAt(word.length() / 2) == 'O'
                    || word.charAt(word.length() / 2) == 'o'
                    || word.charAt(word.length() / 2) == 'A'
                    || word.charAt(word.length() / 2) == 'x'
                    || word.charAt(word.length() / 2) == 'X'
                    || word.charAt(word.length() / 2) == 'H'
                    || word.charAt(word.length() / 2) == 'I'
                    || word.charAt(word.length() / 2) == 'M'
                    || word.charAt(word.length() / 2) == 'T'
                    || word.charAt(word.length() / 2) == 'U'
                    || word.charAt(word.length() / 2) == 'V'
                    || word.charAt(word.length() / 2) == 'v'
                    || word.charAt(word.length() / 2) == 'W'
                    || word.charAt(word.length() / 2) == 'w'
                    || word.charAt(word.length() / 2) == 'Y') {
            } else {
                System.out.println("NIE");
                success = 0;
            }
        }
        if (success == 1) {
            System.out.println("TAK");
        }
    }
}
