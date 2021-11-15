package ru.packages.packageB;

import ru.packages.packageA.SomeClassInPackageA;

public class SomeClassInPackageB extends SomeClassInPackageA{
    public static void main(String[] args) {
        SomeClassInPackageA p1 = new SomeClassInPackageA();
        int publicInt = p1.publicInt;
        // int privateInt = p1.privateInt;  // ошибка
    }

    void someLocalMethod() {
        int localProtectedInt = super.protectedInt;
    }
}
