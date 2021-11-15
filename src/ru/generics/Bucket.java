package ru.generics;

public class Bucket<T> { // значения типа T
    private final T a;
    private final T b;
    private final T c;

    public Bucket(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
