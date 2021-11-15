package ru.generics;

public class Squad<T extends Hero> { // ставим ограничение, что обхекты должны наследоваться от Hero
    private final T[] heroes;

    public Squad(T[] heroes) {
        this.heroes = heroes;
    }

    public int getCount() {
        return heroes.length;
    }

    public T getHero(int position) {
        return heroes[position];
    }

    public int getHp(){
        int hp = 0;
        for (Hero h : heroes) {
            hp += h.getHp();
        }
        return hp;
    }

}
