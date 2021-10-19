package ru.Alastorial.Main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Person person = new Person(null);  // вызываем конструктор
        System.out.println(person.getName().length()); // получили бы по jопе если бы объекта не юыло

        person.setName("first");
        System.out.println(person.getName());
        System.out.println(person.getName().length());
        workWithCalc();

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
