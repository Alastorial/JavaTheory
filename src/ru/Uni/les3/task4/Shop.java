package ru.Uni.les3.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public Shop() {
    }

    public Shop(List computers) {
        this.computers = computers;
    }

    public void appendComp(Computer c) {
        computers.add(c);
    }

    public void deleteComp(String name) {
        computers.removeIf(c -> c.getName().equals(name));
    }

    // возращает объект пк по названию
    public Computer getByName(String name) {
        for (Computer c : computers) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }
}
