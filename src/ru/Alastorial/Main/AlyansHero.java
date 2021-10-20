package ru.Alastorial.Main;

public class AlyansHero extends Hero { // наследник класса Hero
    public AlyansHero(String name) {
        super(name);
    }



    @Override
    public String getPhrase() {
        return "Раньше бы я сказал " + super.getPhrase() + " " + super.getName() + " A теперь, За Альянс!!";
    }
}
