package com.example.sp_lab2.controllers;

import com.example.sp_lab2.models.*;
import com.example.sp_lab2.persistence.BooksRepository;
import com.example.sp_lab2.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class BooksController {
    private final CommandExecutor synchronousCommandExecutor;
    private final CommandExecutor asynchronousCommandExecutor;
    private final BookService bookService;
    private final BooksRepository booksRepository;

    @Autowired
    public BooksController(@Qualifier("synchronousCommandExecutor") CommandExecutor synchronousCommandExecutor,
                           @Qualifier("asynchronousCommandExecutor") CommandExecutor asynchronousCommandExecutor,
                           BookService bookService, BooksRepository booksRepository) {
        this.synchronousCommandExecutor = synchronousCommandExecutor;
        this.asynchronousCommandExecutor = asynchronousCommandExecutor;
        this.bookService = bookService;
        this.booksRepository = booksRepository;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(synchronousCommandExecutor.execute(new GetAllBooksCommand(bookService)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(synchronousCommandExecutor.execute(new GetBookByIdCommand(bookService, id)));
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
        return ResponseEntity.ok(asynchronousCommandExecutor.execute(new AddBookCommand(bookService, newBook)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return ResponseEntity.ok(asynchronousCommandExecutor.execute(new UpdateBookCommand(bookService, id, updatedBook)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        asynchronousCommandExecutor.execute(new DeleteBookCommand(bookService, id));
        return ResponseEntity.noContent().build();
    }
}