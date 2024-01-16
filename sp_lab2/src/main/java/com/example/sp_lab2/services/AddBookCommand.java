package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;

public class AddBookCommand implements Command<Book> {
    private final BookService bookService;
    private final Book newBook;

    public AddBookCommand(BookService bookService, Book newBook) {
        this.bookService = bookService;
        this.newBook = newBook;
    }

    @Override
    public Book execute() {
        return bookService.createBook(newBook);
    }
}