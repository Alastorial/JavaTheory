package ru.TreoryBase.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        Animal animal = new Animal(); // не можем тк класс абстрактный, просто концепция животного
        cat.eat();
        Animal animal = new Cat();
        animal.makeSound();
    }
}

// интерфейс - это контракт, при котором необходимо реализовать некий набор методов
// абстрактный класс - это все же класс, который задает поведение наследникам