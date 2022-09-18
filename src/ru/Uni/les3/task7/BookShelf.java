package ru.Uni.les3.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookShelf {
    private List<Book> bookShelf= new ArrayList<>();
    private int numOfBooks;

    public BookShelf(List<Book> bookShelf) {
        this.bookShelf = bookShelf;
        numOfBooks = bookShelf.size();
    }

    public List<Book> getBooks() {
        return bookShelf;
    }
    public void sort(){
        bookShelf = bookShelf.stream().sorted(Comparator.comparingInt(Book::getYear)).toList();
    }
    public void reverseSort(){
        bookShelf = bookShelf.stream().sorted(Comparator.comparingInt(Book::getYear)).sorted(Collections.reverseOrder()).toList();
    }
}
