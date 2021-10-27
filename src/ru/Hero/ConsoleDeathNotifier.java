package ru.Hero;

public class ConsoleDeathNotifier implements DeathNotifier {

    private Hero[] army;

    public ConsoleDeathNotifier(Hero[] army) {
        this.army = army;
    }

    @Override
    public void newDeath(Hero hero){
        System.out.println("hero " + hero + " was die");
        System.out.println("осталось в живых " + calcAliveHeroesCount());
    }

    private int calcAliveHeroesCount() {
        int count = 0;
        for (Hero h: army) {
            if (h.isAlive()) {
                count++;
            }
        }
        return count;
    }
}
