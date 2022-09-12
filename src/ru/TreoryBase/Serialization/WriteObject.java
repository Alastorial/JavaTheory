package ru.TreoryBase.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "Nick");
        Person person2 = new Person(2, "Alex");

        FileOutputStream fos = new FileOutputStream("People.bin"); // записывает последовательность байтов в файл
        ObjectOutputStream oos = new ObjectOutputStream(fos); // записывает именно объекты в байты и передает в fos

        oos.writeObject(person1);
        oos.writeObject(person2);

        oos.close();
    }
}
