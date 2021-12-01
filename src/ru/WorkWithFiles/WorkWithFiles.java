package ru.WorkWithFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) {
        Path rootPath = Paths.get("src/ru/WorkWithFiles").toAbsolutePath();
        System.out.println(rootPath);

        File src = new File(rootPath.toString(), "content.txt");
        File dest = new File(rootPath.toString(), "fromJava.txt");

        try(
                FileInputStream inputStream = new FileInputStream(src);
                FileOutputStream outStream = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void workWithReading() {
        Path rootPath = Paths.get("src/ru/WorkWithFiles").toAbsolutePath();
        System.out.println(rootPath);

        File file = new File(rootPath.toString(), "content.txt"); // Объект с файлом и его путем

        if (!file.isFile() && !file.canRead()) {
            System.out.println("Некорректный файл " + file);
            return;
        }
        System.out.println("#1");
        try(FileReader fileReader = new FileReader(file)) {
             // пытаемся открыть файл
            char[] symbols = new char[5];
            int read;
            while ((read = fileReader.read(symbols)) != -1) {
//                System.out.println(read);
                System.out.print(new String(symbols, 0, read));
            }
            System.out.println("File was read");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("#2");
        try(Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("#3");
        try {
            System.out.println(Files.readString(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void workWithDirs() {
        Path rootPath = Paths.get("src/ru/WorkWithFiles").toAbsolutePath();
        System.out.println(rootPath);
        File fileInfo = new File(rootPath.toString());
        System.out.println(fileInfo);

        if (!fileInfo.isDirectory()) {
            System.out.println("path is not dir " + fileInfo.getAbsolutePath());
            return;
        }

        // Два способа вывести все в какой-то папке
        // Именно файлы
        String[] list = fileInfo.list();
        for (String file : list) {
            System.out.println(file);
        }

        // Полные пути файлов
        File[] listFiles = fileInfo.listFiles();
        for (File file : listFiles) {
            System.out.println((file.isDirectory() ? "DIR " : "FILE ") + (file.isHidden() ? "hidden " : "") + file);

            if (file.isDirectory()) {
                File[] listFiles2 = file.listFiles();
                if (listFiles2 == null) {
                    System.out.println("попався" + file.canRead());
                } else {
                    for (File file2 : listFiles2) {
                        System.out.println(file2);
                    }
                }

            }
        }
        doSome(1, 2);
    }

    /**
     * doSome
     * Документация, клева да?
     *
     */
    public static void doSome(int a, int b) {

    }
//        System.out.println(fileInfo.isDirectory()); // директория ли
//        System.out.println(fileInfo.isFile()); // файл ли
//        System.out.println(fileInfo.exists()); // существует директория


    private static void wotkWithPath() {
        Path path = Paths.get("src", "ru", "Alastorial");
        System.out.println(path.toAbsolutePath());
        Path path1 = Paths.get("src/ru/Alastorial");
        System.out.println(path1);
        System.out.println(path1.toAbsolutePath().getParent()); //
        System.out.println(path1.toAbsolutePath().getRoot());  // Корень
    }

    private static void worhWithFinally() {
        boolean isloading = true;
        try {
            System.out.println("long loading");
            System.out.println("hard code");

        } finally {
            isloading = false;
        }
    }
}
