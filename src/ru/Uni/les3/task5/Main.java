package ru.Uni.les3.task5;

public class Main {
    public static void main(String[] args) {
        DogHouse dogHouse = new DogHouse();
        dogHouse.addDog(new Dog("bobik", 2));
        dogHouse.addDog(new Dog("rex", 4));
        dogHouse.addDog(new Dog("max", 1));
        System.out.println(dogHouse);

        for (Dog d : dogHouse.getDogs()) {
            System.out.println("Возраст собаки " + d.getName() + " - " + d.getAge());
            System.out.println("Возраст в человеческих годах - " + d.getHumanAge());
            System.out.println();
        }
    }
}
