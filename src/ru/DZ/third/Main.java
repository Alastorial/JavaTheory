package ru.DZ.third;

public class Main {
    public static void main(String[] args) {





//        Archer archer = new Archer(100);
//        System.out.println(archer.speak());



        Action[] heroes = {
                new Archer(123),
                new Archer(23),
                new Swordsman(233),
                new Swordsman(1323),
        };

        for (Action h: heroes) {
            System.out.print(h.speak() + " ");
            System.out.println(h.getHealth());
        }


    }
}

interface Action{
    public String speak();
    public int getHealth();
}

class Hero{
    private final int health;
    public Hero(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

}


class Archer extends Hero implements Action{
    public Archer(int health) {
        super(health);
    }

    @Override
    public String speak() {
        return "im Archer!";
    }
}

class Swordsman extends Hero implements Action{
    public Swordsman(int health) {
        super(health);
    }

    @Override
    public String speak() {
        return "im Swordsman!";
    }
}



















/*
abstract class Hero {
    private final int health;

    public Hero(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract String speak();
}


class Archer extends Hero{
    public Archer(int health) {
        super(health);
    }

    @Override
    public String speak() {
        return "im Archer!";
    }
}

class Swordsman extends Hero {
    public Swordsman(int health) {
        super(health);
    }

    @Override
    public String speak() {
        return "im Swordsman!";
    }
} */
