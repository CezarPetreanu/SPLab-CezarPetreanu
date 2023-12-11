package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;

public class GetBookByIdCommand implements Command<Book>{
    BookService context;
    int id;
    public GetBookByIdCommand(BookService context) {
        this.context = context;
    }
    public Book execute() {
        return context.getBookById(id);
    }
    public void setArgs(int id) {
        this.id = id;
    }
}
