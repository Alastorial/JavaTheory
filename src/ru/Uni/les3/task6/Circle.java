package ru.Uni.les3.task6;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getS() {
        return Math.PI * r * r;
    }

    public double getP() {
        return 2 * Math.PI * r;
    }
}
