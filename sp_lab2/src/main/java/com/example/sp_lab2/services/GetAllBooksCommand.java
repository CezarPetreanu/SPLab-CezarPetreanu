package com.example.sp_lab2.services;
import com.example.sp_lab2.models.Book;
import java.util.List;

public class GetAllBooksCommand implements Command<List<Book>>{
    BookService context;
    public GetAllBooksCommand(BookService context) {
        this.context = context;
    }
    public List<Book> execute() {
        return context.getBooks();
    }
}
