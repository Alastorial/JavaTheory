package ru.generics;

public class Main {
    public static void main(String[] args) {
//        workWithHeroes();
//        workWithObjectLogic();
//        workWithBucket();
        System.out.println(sumHp(new Archer(60), new Swordsman(40)));

        Hero alex = getHero("No Alex");
        System.out.println(alex);

    }

    private static <H extends Hero> H getHero(String name) {
        switch (name) {
            case "Alex": return (H)new Swordsman(23);
            default: return (H)new Archer(32);
        }
    }

    private static <H extends Hero> int sumHp(H hero1, H hero2) { // <какой тип принимаем>, какой отдаем (тип первая пер, тип вторая пер)
        return hero1.getHp() + hero2.getHp();
    }

    private static void workWithHeroes() {
        Archer[] heroes = {
                new Archer(20),
                new Archer(50),
                new Archer(20)
        };

        Squad<Archer> archers = new Squad<Archer>(heroes);
        System.out.println(archers.getHp());
        Archer hero = archers.getHero(1);
    }

    private static void workWithBucket() {
        Bucket<Double> doubleBucket = new Bucket<>(12.3, 23., 23.);

        Bucket<Integer> b1 = new Bucket<>(123, 543, 43); // указываем параметризованный тип

        int valueFromMethod =  sumFirstInts(b1);

        System.out.println(valueFromMethod);

        Bucket<String> b2 = new Bucket<String>("row1", null, "row3");
        Object b = b2.getB();
//        System.out.println(sumFirstInts(b2));

        int variable = 12;
        doSome(variable);

        Bucket<Integer> b3 = new Bucket<>(1, 2, 4);
        System.out.println(sumFirstInts(b3));
    }

    private static void doSome(Object o) {
        System.out.println(o);
    }

    private static int sumFirstInts(Bucket<Integer> bucket) {  // Может обработать только объекты с типом Integer
        return bucket.getA() + bucket.getB();
    }

    private static void workWithObjectLogic() {
        Example example = new Example();
        System.out.println(example);
        workWithObject(example);
        workWithObject(new Main());  // Main не наследуется от Object
        workWithObject(new SecondExample());
    }

    public static void workWithObject(Object object) {  // закидываем example, но даем тип Object тк от этого супер класса все наследуется
        // System.out.println(object.getString()); // тк в классе Object нет метода getString, мы не можем его вызвать

        // Пример проверки на наследование (не идеальный, см комментарии)
        /*
        if ("Example{}".equals(object.toString())) { // проверяем, что возвращает toString, если Example{}, значит у Object есть дочерний класс Example
            // Однако, если в Main будет toString, который возвращает Example{}, то прога упадет тк мы не может сделать каст вниз от Object

            Example ex = (Example) object; // Явно даем понять, что хотим смотреть на объект через призму класса Example (каст вниз)
            System.out.println(ex.getString());
        } else {
            System.out.println("bad class");
        }
        */

        if (object instanceof Example) { // проверяем, что объект является экземляром класса Example или его наследником(есть нужный нам дочерний класс)

            Example ex = (Example) object; // Явно даем понять, что хотим смотреть на объект через призму класса Example (каст вниз)
            System.out.println(ex.getString());
        } else {
            System.out.println("bad class");
        }


    }

    @Override
    public String toString() {
        return "Example{}";
    }
}
