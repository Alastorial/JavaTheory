package ru.Uni.les3.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.next();
        System.out.println("Введите пол: ");
        char gender = sc.next().charAt(0);
        Author auth = new Author(name, "123@mail.ru", gender);

        System.out.println("Данные автора:");
        System.out.println(auth.getEmail());
        System.out.println(auth.getGender());
        System.out.println(auth.getName());
        System.out.println("Введите новый email");
        String email = sc.next();
        auth.setEmail(email);
        System.out.println(auth);

    }
}
