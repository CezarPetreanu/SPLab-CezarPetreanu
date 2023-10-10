package com.example.sp_lab2;

import org.springframework.boot.SpringApplication;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1");
        book1.addAuthor(new Author("A. Thor"));
        int indexCh1 = book1.addChapter("Chapter 1");
        Chapter ch1 = book1.getChapter(indexCh1);
        int indexCh2 = book1.addChapter("Chapter 2");
        Chapter ch2 = book1.getChapter(indexCh2);
        book1.print();
    }
}
