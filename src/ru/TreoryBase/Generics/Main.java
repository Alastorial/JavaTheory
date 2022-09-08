package ru.TreoryBase.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1 пример
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(1);
//        list2.add(2); // для себя проверил, что add - метод из интерфейса List
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
    }
}
