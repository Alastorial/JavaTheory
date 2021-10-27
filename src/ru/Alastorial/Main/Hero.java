package ru.Alastorial.Main;

public class Hero {

    private final String name;



    public Hero(String name) {
        this.name = name;
    }

    public String getPhrase() {
        return "*Неловкое молчание*";
    }

    public String getName() {
        return name;
    }

//    public String getPhrase() {
//        switch (type) {
//            case "Альянс": return "За Альянс!";
//            case "Орда": return "Опять работа?";
//            case "Нежить": return "Смерть за Нерзула!";
//            case "Нежить2": return "Смерть за Нерзула!2";
//            default: return "*Неловкое молчание*";
//        }
//
//    }
}
