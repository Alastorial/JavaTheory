package ru.Uni.les3.task5;

import java.util.ArrayList;
import java.util.List;

public class DogHouse {
    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog d){
        dogs.add(d);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {
        return "DogHouse{" +
                "dogs=" + dogs +
                '}';
    }
}
