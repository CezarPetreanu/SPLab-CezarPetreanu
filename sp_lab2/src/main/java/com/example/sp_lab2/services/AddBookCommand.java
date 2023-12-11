package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;

public class AddBookCommand implements Command<Book> {
    BookService context;
    Book newBook;
    public AddBookCommand(BookService context) {
        this.context = context;
    }
    public Book execute() {
        return context.createBook(newBook);
    }
    public void setArgs(Book newBook) {
        this.newBook = newBook;
    }
}