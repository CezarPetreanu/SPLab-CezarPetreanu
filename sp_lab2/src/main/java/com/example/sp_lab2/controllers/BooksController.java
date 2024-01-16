package com.example.sp_lab2.controllers;

import com.example.sp_lab2.models.*;
import com.example.sp_lab2.persistence.BooksRepository;
import com.example.sp_lab2.persistence.CrudRepository;
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
    private final CrudRepository<Book, Long> crudRepository;

    @Autowired
    public BooksController(@Qualifier("synchronousCommandExecutor") CommandExecutor synchronousCommandExecutor,
                           @Qualifier("asynchronousCommandExecutor") CommandExecutor asynchronousCommandExecutor,
                           BookService bookService, CrudRepository<Book, Long> crudRepository) {
        this.synchronousCommandExecutor = synchronousCommandExecutor;
        this.asynchronousCommandExecutor = asynchronousCommandExecutor;
        this.bookService = bookService;
        this.crudRepository = crudRepository;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = crudRepository.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(crudRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
        Book savedBook = crudRepository.save(newBook);
        return ResponseEntity.ok(savedBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        if (crudRepository.findById(id) != null) {
            Book savedBook = crudRepository.save(updatedBook);
            return ResponseEntity.ok(savedBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        crudRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}