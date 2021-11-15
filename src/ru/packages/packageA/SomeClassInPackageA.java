package ru.packages.packageA;

public class SomeClassInPackageA {
    public int publicInt;
    private int privateInt;
    protected int protectedInt;  // доступно в рамках пакета, а так же наследникам (ПЕРВЫМ)
    int defaultInt; // доступно только рядом находящимся классам
}
