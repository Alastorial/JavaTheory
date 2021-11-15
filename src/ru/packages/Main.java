package ru.packages;


import ru.packages.packageA.SomeClassInPackageA;

public class Main {
    public static void main(String[] args) {
        SomeClassInPackageA p1 = new SomeClassInPackageA();
        int publicInt = p1.publicInt;
        // int privateInt = p1.privateInt;  // ошибка
        // int protectedInt = p1.protectedInt;  // ошибка
    }
}
