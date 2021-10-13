package ru.Alastorial.Main;

public class Calculator {
    private int current = 0;

    public int sum(int num) {
        current += num;
        return current;
    }

    public int getCurrent() {
        return current;
    }
}
