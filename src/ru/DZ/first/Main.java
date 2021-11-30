package ru.DZ.first;

public class Main {
    public static void main(String[] args) {
        Object object = new Robot("R2D2", 100, 100);
        Unit unit = new Wizard("Gendalf", 100, 1000);

        //у Object нет метода printInfo, поэтому необходимо привести к Robot
        ((Robot)object).printInfo();
        System.out.println();

        //у Unit есть метод printInfo
        unit.printInfo();
        System.out.println();

        //у Unit нет метода getMana, поэтому необходимо привести к Wizard
        int num = ((Wizard)unit).getMana();

        Robot robot = new Terminator("T-100", 100, 100, "AK-47");
        robot.printInfo();

//        Animal animal = new Animal();
//        Time time = new Time(3661);
//        System.out.println(time);
    }

    public static void some() {
        System.out.println(1233);
    }
}

abstract class Unit{

    private String name;
    private int health;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void printInfo();
}


class Robot extends Unit{
    int armor;

    public Robot(String name, int health, int armor) {
        super(name, health);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }


    public void printInfo() {
        System.out.println("Name:" + super.getName());
        System.out.println("Health:" + super.getHealth());
        System.out.println("Armor:" + armor);
    }
}

class Terminator extends Robot{
    private String gun;
    public Terminator(String name, int health, int armor, String gun) {
        super(name, health, armor);
        this.gun = gun;
    }
}

class Wizard extends Unit{
    private int mana;

    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void printInfo() {
        System.out.println("Name:" + super.getName());
        System.out.println("Health:" + super.getHealth());
        System.out.println("Mana:" + mana);
    }
}


/*
class Animal{
    public Animal() {
//        System.out.println(Integer.toBinaryString(64+12+1));
    }
}


class Time extends Main {
    int hour, min, sec;
    public Time(int n) {
        this.hour = n / 3600;
        this.min = n / 60 % 60;
        this.sec = n % 60;
        some();
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
*/
