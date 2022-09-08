package ru.TreoryBase.Les2_Interface;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.printf("My name - %s\n", name);
    }
}
