package ru.Alastorial.Main;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        workWithStatic();

//        workWithCalc();

    }

    private static void workWithStatic() {
        Person[] people = {
                new Person("Bolek"),
                new Person("Lelek"),
                new Person(null),
                new Person("Tolek"),
                new Person("Maksim"),
                new Person(null),
                new Person("Maksim"),
                new Person("Maksim")
        };
        Random random = new Random( 300);
        for (Person p : people) {
            p.setHeightInMeter(random.nextDouble() * 2.5);
        }
        for (Person p : people) {
            System.out.println(p.getName() + " " + p.getHeightInMeter() * 100 + " " + p.getPrettyheight());
        }
        Person.setHeightPoints(1.3, 1.51);
    }

    public static void workWithSetName() {
        Person person = new Person(null);  // вызываем конструктор
        System.out.println(person.getName().length()); // получили бы по jопе если бы объекта не юыло

        person.setName("first");
        System.out.println(person.getName());
        System.out.println(person.getName().length());
    }

    public static void workWithCalc() {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5));
        System.out.println(calc.sum(5));
        System.out.println(calc.getCurrent());
        System.out.println(new Calculator().getCurrent());  // Создали новый экземпляр


//        System.out.println(tc.a);
//        tc.a++;
//        System.out.println(tc.a);
//
////        Calculator tc2 = new Calculator();
//        Calculator tc2 = tc;
//        tc2.a++;
//        System.out.println(tc2.a);
//
//        System.out.println(tc2.sum(5));

    }


}
