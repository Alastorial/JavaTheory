package ru.Alastorial.Main;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 5);
        showInfo(r);
        formatRectToPalka(r, 6);
        showInfo(r);
        Square s = new Square(4);
        showInfo(s);
        s.setSize(16);
        s.setHeigth(6);
        showInfo(s);
        Rectangle someRec = s;
//        formatRectToPalka(someRec, 7);
        showInfo(someRec);


        //        workWithHero();

        //        workWithStatic();

        //        workWithCalc();

    }

    private static void showInfo(Rectangle r) {
        System.out.println(r.getWidth() + " x " + r.getHeigth());
    }

    private static void formatRectToPalka(Rectangle r, int baseSize) {
        r.setWidth(baseSize);
        r.setHeigth(baseSize * 2);
    }

    private static void workWithHero() {
        Hero hero = new Hero("Рабочий");
//        System.out.println(hero.getPhrase());
        AlyansHero hero2 = new AlyansHero("Крестьянин");
        Hero[] heroes = {hero, hero2};

        for (Hero h: heroes) {
            System.out.println(h.getPhrase());
        }
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
