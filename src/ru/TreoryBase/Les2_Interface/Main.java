package ru.TreoryBase.Les2_Interface;

import ru.Hero.Archer;
import ru.Hero.Hero;
import ru.Hero.Swordman;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(4);
        Person person1 = new Person("Lisa");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();

        Info info1 = new Animal(12);
        Info info2 = new Person("misha");

        Info[] infos = {
                new Animal(2),
                new Animal(4),
                new Person("misha"),
        };

        for (Info i : infos) {
            i.showInfo();
        }


    }
}

