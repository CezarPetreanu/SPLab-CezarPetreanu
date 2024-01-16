package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;

public class UpdateBookCommand implements Command<Book> {
    private final BookService bookService;
    private final Long id;
    private final Book updatedBook;

    public UpdateBookCommand(BookService bookService, Long id, Book updatedBook) {
        this.bookService = bookService;
        this.id = id;
        this.updatedBook = updatedBook;
    }

    @Override
    public Book execute() {
        return bookService.updateBook(id, updatedBook);
    }
}