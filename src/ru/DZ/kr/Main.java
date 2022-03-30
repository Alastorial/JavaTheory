package ru.DZ.kr;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] mass = new String[3];
        Arrays.fill(mass, "1.txt");
        System.out.println(mass[0]);
        deleteFiles(mass);
    }

    private static void deleteFiles(String[] fileNames) throws IOException {
        for (String i : fileNames) {
            File file = new File("file.txt");
            Path path = Path.of(i);
            Files.delete(path);

        }

    }
}
