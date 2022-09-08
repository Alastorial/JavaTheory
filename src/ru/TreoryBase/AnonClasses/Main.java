package ru.TreoryBase.AnonClasses;

/** задача 1: переопределить метод eat, если такое переопределние потребуется только 1 раз (ну или два, короче немного)*/

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
/* плохой вариант - создать отдельный класс, наследуемый от Animal, у которого переопределяется метод eat
//class OtherAnimal extends Animal {
//    @Override
//    public void eat() {
//        System.out.println("OtherAnimal is eating...");
//    }
}*/


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        /* другой вариант(не самый полезный) - сделать как ниже, создается под капотом анонимный класс, который наследуется от Animal и переопределяет метод eat */
        Animal animal1 = new Animal() {
            @Override
            public void eat() {
                System.out.println("OtherAnimal is eating...");
            }
        };

        animal1.eat();
    }
}
