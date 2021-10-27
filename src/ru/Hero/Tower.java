package ru.Hero;

// реализуем интерфейс
// абстрактность не требует реализации, она может переложить это на дочерние элементы
public class Tower implements DamageTaker {

    @Override
    public void takeDamage(int damage) {
        // так делать не надо
        System.out.println("Стена впитывает " + damage + " урона");
    }
}
