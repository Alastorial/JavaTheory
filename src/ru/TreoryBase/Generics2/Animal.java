package ru.TreoryBase.Generics2;

public class Animal {
    private int id;
    // необходимо выполнить перегрузку конструкторов, прописав дефолтный, чтобы класс Dog мог спокойно создаваться
    // тк у него по умолчанию такой же дефолтный конструктор, который вызывает конструктор родителя, но ничего(id) не передает, от этого ошибка

    public Animal(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println("im eat..");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
