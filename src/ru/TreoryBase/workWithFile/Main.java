package ru.TreoryBase.workWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;  // раздилитель адреса файла для текущей системы - / или \
//        String path = "\\src\\ru\\TreoryBase\\workWithFile\\test.txt";
//        String filePath = new File("").getAbsolutePath();
//        File file = new File(filePath + separator + path);
        String path = "test.txt";
        String pathOutput = "testOutput.txt";
        File file = new File(path);
        File file2 = new File(pathOutput);
        PrintWriter pw = new PrintWriter(file2);




//        Scanner sc = new Scanner(System.in); // в констансте in находится стандартный поток ввода

        // чтение из файла строки чисел, ее разбитие и каст к инту с записью в целочисленный массив
        // + запись в файл
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
            pw.println(Arrays.toString(numbers));
        }
        sc.close();
        pw.close();

    }
}
