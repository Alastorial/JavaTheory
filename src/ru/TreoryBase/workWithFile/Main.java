package ru.TreoryBase.workWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;  // раздилитель адреса файла для текущей системы - / или \
//        String path = "\\src\\ru\\TreoryBase\\workWithFile\\test.txt";
//        String filePath = new File("").getAbsolutePath();
//        File file = new File(filePath + separator + path);
        String path = "test.txt";
        File file = new File( path);




//        Scanner sc = new Scanner(System.in); // в констансте in находится стандартный поток ввода

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            int counter = 0;
            for (String s : numbersString) {
                numbers[counter++] = Integer.parseInt(s);
            }
            System.out.println(Arrays.toString(numbers));
        }
        sc.close();
    }
}
