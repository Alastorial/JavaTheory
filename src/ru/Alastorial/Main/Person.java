package ru.Alastorial.Main;

public class Person {

    private static int lastId;  // единственная статичная переменная на все вызванные классы

    private static double soShortPeoplePoint = 1.2;
    private static double ShortPeoplePoint = 1.5;

    private String name;
    private double heightInMeter = 180;
    private final int id;  // final типо константы, мы обязаны сами ее определить


    public Person(String name) { // метод должен быть назван как класс (это конструктор)
        id = lastId++;
        System.out.println("вызван конструктор");
        if (name == null || name.length() == 0) {
            name = "default name #" + id;
        }
        this.name = name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            return;
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void setHeightPoints(
            double soShortPeoplePoint,
            double shortPeoplePoint
    ) {
        Person.soShortPeoplePoint = soShortPeoplePoint;
        Person.ShortPeoplePoint = shortPeoplePoint;
    }


    public String getPrettyheight() {
        if (heightInMeter < soShortPeoplePoint) {
            return "Стремянка";
        }
        if (heightInMeter < ShortPeoplePoint) {
            return "Полторашка";
        }
        return "Вроде норм";

    }




    public void setHeightInMeter(double heightInMeter) {
        this.heightInMeter = heightInMeter;
    }

    public double getHeightInMeter() {
        return heightInMeter;
    }


}
