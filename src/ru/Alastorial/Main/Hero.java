package ru.Alastorial.Main;

public class Hero {

    private final String name;

//    public static Hero createAlyansHero(String name) {
//        return new Hero("Альянс", name);
//    }
//
//    public static Hero createOrdaHero(String name) {
//        return new Hero("Орда", name);
//    }
//
//    public static Hero createNezitHero(String name) {
//        return new Hero("Нежить", name);
//    }

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
