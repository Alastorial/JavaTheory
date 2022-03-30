package ru.Lists;

import java.util.ArrayList;
import java.util.Random;
//  короче бинарный поиск

public class Lists {
    public static void main(String[] args) {
        ArrayList<Person> list =new ArrayList<>();
        Random random = new Random(123);
        for (int i = 0; i < 80; i++) {
            list.add(new Person(random.nextInt() / 2, "deault name"));

        }
        list.get(random.nextInt() % list.size()).setAge(15);
        list.sort((p1, p2) -> p1.getAge() - p2.getAge());
        int counter = 0;
        int step = list.size() / 2;
        int pointer = list.size() / 2;
        Person x = list.get(pointer);
        counter++;
        System.out.println(counter + " " + x);
        while (x.getAge() != 15) {
            if (x.getAge() > 15) {
                step /= 2;
                pointer += x.getAge() < 15 ? step : -step;
            }
        }

        for (Person person : list) {
            counter++;
            if (person.getAge() >= 15 && person.getAge() <=22) {
                System.out.println(person);
            } else if (person.getAge() > 22) {
                break;
            }
        }
        System.out.println("ierations:" + counter);
//        for (Person value : list) {
//            System.out.println(value);
//        }
    }

    private static int compare(int a1, int a2) {
        System.out.println( a1 + " " + a2);
        return a1 - a2;
    }
}

class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}