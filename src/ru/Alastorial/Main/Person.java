package ru.Alastorial.Main;

public class Person {
    private String name;
    private double height;

    public Person(String name) { // метод должен быть назван как класс (это конструктор)
//        System.out.println("вызван класс");
        if (name == null) {
            name = "default name";
        }
        this.name = name;
    }

    public void setName(String name) {
        if (name == null) {
            return;
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
