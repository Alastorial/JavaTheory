package ru.Hero;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hero[] army = {
                new Swordman(123),
                new Archer(),
                new Archer(),
                new Swordman(50)
        };

        DeathNotifier consoleDeathNotifier = new ConsoleDeathNotifier(army);  // связали классы (наверное)

        army[0].setDeathNotifier(consoleDeathNotifier);
        army[3].setDeathNotifier(consoleDeathNotifier);


        Tower tower = new Tower();
        for (Hero h : army) {
            System.out.println(h.toString());
        }

        System.out.println("============");
        applySomeDamage(army);
        applySomeDamage(army[0], army[3], tower);

        for (Hero h : army) {
            System.out.println(h.toString());
        }
    }
// используем интерфейс, чтобы связать классы через один метод
    private static void applySomeDamage(DamageTaker... army) {  // принимаем кучу разных классов
        Random random = new Random(451);
        for(DamageTaker damagetaker: army) {
            int damage = Math.abs(random.nextInt() % 200);
            damagetaker.takeDamage(damage);
        }
    }
}

