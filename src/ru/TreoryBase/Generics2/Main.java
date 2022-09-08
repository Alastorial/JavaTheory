package ru.TreoryBase.Generics2;

import java.util.ArrayList;
import java.util.List;

// в данном уроке мы получаем в метод лист с объектами типа Animal или его дочерними

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(4));
        listOfDogs.add(new Dog(55));

        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

//    private static void test2(List<? super Dog> list) {
//        for (Animal animal : list) {
//            System.out.println(animal);
//        }
//    }
}
