package ru.TreoryBase.Casting;

public class Main {
    public static void main(String[] args) {
        // 1 пример
        //upcasting - восходящее преобразование тк dog наследуется от animal, но здесь dog воспринимается как Animal (вверх по иерархии)
        // инициализируя дочерний класс с типом родителя мы не будем иметь доступ к методам дочернего, но будем иметь доступ
        // к методам родителя, а так же переопределенным методам родителя в этом дочернем классе
        Animal animal = new Dog();
//      animal.bark() // не можем


        // downcasting - нисходящее преобразование
        Dog dog2 = (Dog)animal;  // каст вниз
//      animal.bark() // не можем
        dog2.bark(); // можем, можно еще вот так ((Dog) animal).bark();

        // 2 пример
        Animal a = new Animal();
        // Dog dog = (Dog)a;  // каст Animal к Dog уже тут случится ошибка
        // dog.bark(); // не получится, тк изначально a - тип Animal, там нет метода bark, поэтому при касту к Dog - этого метода по прежнему нет



    }
}
