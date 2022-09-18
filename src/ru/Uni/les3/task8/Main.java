package ru.Uni.les3.task8;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"aaaaa", "bbbbbb", "ccccccc", "dddddd", "eeeee"};
        String buff;
        for (int i = 0; i < Math.floor(Math.sqrt(arr.length)); i++) {
            buff = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buff;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
