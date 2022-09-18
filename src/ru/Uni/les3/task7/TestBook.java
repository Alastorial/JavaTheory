package ru.Uni.les3.task7;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("leha");
        book.setName("harry potter");
        book.setYear(1987);
        System.out.println(book);
    }
}
