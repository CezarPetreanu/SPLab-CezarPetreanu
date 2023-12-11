package com.example.sp_lab2.services;

public class DeleteBookCommand implements Command<Void>{
    BookService context;
    int id;
    public DeleteBookCommand(BookService context) {
        this.context = context;
    }
    public Void execute() {
        context.deleteBook(id);
        return null;
    }
    public void setArgs(int id) {
        this.id = id;
    }
}
