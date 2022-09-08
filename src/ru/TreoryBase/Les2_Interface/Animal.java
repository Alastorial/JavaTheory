package ru.TreoryBase.Les2_Interface;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("im sleep");
    }

    @Override
    public void showInfo() {
        System.out.printf("My id - %d\n", id);
    }
}
