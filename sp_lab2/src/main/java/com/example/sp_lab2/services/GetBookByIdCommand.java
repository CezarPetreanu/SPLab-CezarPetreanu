package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;

import java.util.Optional;

public class GetBookByIdCommand implements Command<Book>{
    private final BookService bookService;
    private final Long bookId;

    public GetBookByIdCommand(BookService bookService, Long bookId) {
        this.bookService = bookService;
        this.bookId = bookId;
    }

    @Override
    public Book execute() {
        return bookService.getBookById(bookId);
    }
}
