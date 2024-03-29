package ru.TreoryBase.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("People.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person person1 = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();

        ois.close();

        System.out.println(person1);
        System.out.println(person2);
    }
}
