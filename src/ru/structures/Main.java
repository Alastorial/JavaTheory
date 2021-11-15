package ru.structures;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // FIFO
        // First In First Out
        Queue<String> queue = new LinkedList<>();
        queue.add("item 1");
        queue.add("item 2");
        queue.add("item 3");

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }

    private static void workWithStack() {
        // FILO
        // First In Last Out
        Stack<String> exampleStack = new Stack<>();
        exampleStack.push("item 1");
        exampleStack.push("item 2");
        exampleStack.push("item 3");

        System.out.println(exampleStack);

        System.out.println(exampleStack.peek());

        System.out.println(exampleStack.pop());
        System.out.println(exampleStack.peek());
    }

    private static void workWithSet() {
        Set<Integer> ints = new HashSet<>();
        ints.add(45);
        ints.add(45);
        ints.add(56);

        System.out.println(ints.contains(45));

        System.out.println(ints);
    }

    private static void workWithList() {
        List<Integer> ints = new ArrayList<>();

        ints.add(546);
        ints.add(2);
        ints.add(55);
        System.out.println(ints);
        ints.remove((Integer) 55);
        System.out.println(ints);
        ints.remove(0);
        System.out.println(ints);


        List<String> strings = new LinkedList<>();

        strings.add(0, "sdfsf0");
        strings.add(0, "sdfsf1");
        strings.add(0, "sdfsf2");

        System.out.println(strings);
    }

    private static void dynamicArray() {
        int[] array = {3, 3};
        print(array);
        array = appendItem(array, 8);
        print(array);
    }

    private static void print(int[] array) {
        for(int v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    private static int[] appendItem(int[] array, int newValue) {
        int[] temp = new int[array.length + 1];
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = newValue;
        return temp;
    }
}
