package ru.TreoryBase.AnonClasses;

/*3 вариант*/

interface AbleToEat {
    public void eat();
}

/*class Animal2 implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("im eating....");
    }
}*/

public class Main2 {
    public static void main(String[] args) {
        // за кулисами создается анон класс, который расширяется интерфейсом и в нем мы переопределяем методы (в данном случае просто реализовываем)
        // создали объект на один раз
        AbleToEat animal = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("im eating....");
            }
        };
        animal.eat();
    }
}
