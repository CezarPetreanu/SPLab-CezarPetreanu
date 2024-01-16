package com.example.sp_lab2.services;

public class DeleteBookCommand implements Command<Void>{
    private final BookService bookService;
    private final Long bookId;

    public DeleteBookCommand(BookService bookService, Long bookId) {
        this.bookService = bookService;
        this.bookId = bookId;
    }

    @Override
    public Void execute() {
        bookService.deleteBook(bookId);
        return null;
    }
}
