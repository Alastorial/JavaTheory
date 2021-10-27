package ru.Alastorial.Main;

public class Square extends Rectangle{

    public Square(int size) {
        super(size, size);
    }

    public void setSize(int size) {
        setWidth(size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeigth(width);
    }

    @Override
    public void setHeigth(int heigth) {
        super.setHeigth(heigth);
        super.setWidth(heigth);
    }
}
