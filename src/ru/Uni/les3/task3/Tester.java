package ru.Uni.les3.task3;

public class Tester {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(new Point(0, 2), 5),
                new Circle(new Point(8, 0), 6),
                new Circle(new Point(2, 2), 3),
        };

        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
