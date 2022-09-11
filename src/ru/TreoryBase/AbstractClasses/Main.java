package ru.TreoryBase.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        Animal animal = new Animal(); // не можем тк класс абстрактный, просто концепция животного
        cat.eat();
    }
}
