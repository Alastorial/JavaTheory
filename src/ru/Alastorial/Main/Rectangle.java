package ru.Alastorial.Main;

public class Rectangle extends Shape {
    private int width;
    private int heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(int width) {
        this.width = this.heigth = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
