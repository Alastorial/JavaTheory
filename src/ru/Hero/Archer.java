package ru.Hero;

public class Archer extends Hero{
    public Archer() {
        super(100);
    }

    @Override
    public String getPhrase() {
        return "Привет всем, я - Лучник!";
    }
}
