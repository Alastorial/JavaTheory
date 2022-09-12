package ru.TreoryBase.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // 1 момент
        // инициализируя дочерний класс с типом родителя мы не будем иметь доступ к методам дочернего, но будем иметь доступ
        // к методам родителя, а так же переопределенным методам родителя в этом дочернем классе
        Animal animal = new Dog();
        animal.eat();
//        animal.bark(); // не можем

        // 2 момент
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal1); // вызовется метод класса Animal
        test(dog); // Вызовется переопределенный метод класса dog
        test(cat);  // Вызовется метод класса Animal


    }


    public static void test(Animal animal) {
        animal.eat();
    }

}
