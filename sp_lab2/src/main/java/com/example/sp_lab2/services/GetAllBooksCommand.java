package com.example.sp_lab2.services;
import com.example.sp_lab2.models.Book;
import java.util.List;

public class GetAllBooksCommand implements Command<List<Book>>{
    private final BookService bookService;

    public GetAllBooksCommand(BookService booksService) {
        this.bookService = booksService;
    }

    @Override
    public List<Book> execute() {
        return bookService.getAllBooks();
    }
}
