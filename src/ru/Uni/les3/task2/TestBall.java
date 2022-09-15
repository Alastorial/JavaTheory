package ru.Uni.les3.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Ball ball = new Ball(0, 0);
        System.out.println("X - " + ball.getX());
        System.out.println("Y - " + ball.getY());
        System.out.println("Установите новые значения для X и Y");
        ball.setX(sc.nextDouble());
        ball.setY(sc.nextDouble());
        System.out.println(ball);
        System.out.println("Установите новые значения для X и Y");
        ball.setXY(sc.nextDouble(), sc.nextDouble());
        System.out.println(ball);
        System.out.println("Напишите по порядку на сколько передвинуть мяч вдоль X и Y координат");
        ball.move(sc.nextDouble(), sc.nextDouble());
        System.out.println(ball);

    }
}
