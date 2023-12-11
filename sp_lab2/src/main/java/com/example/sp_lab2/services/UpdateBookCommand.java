package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;

public class UpdateBookCommand implements Command<Book> {
    BookService context;
    int id;
    Book newBook;
    public UpdateBookCommand(BookService context) {
        this.context = context;
    }
    public void setArgs(int id, Book newBook) {
        this.id = id;
        this.newBook = newBook;
    }
    public Book execute(){
        context.updateBook(id, newBook);
        return context.getBookById(id);
    }
}