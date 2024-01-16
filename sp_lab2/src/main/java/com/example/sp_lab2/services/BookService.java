package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final Map<Long, Book> books = new HashMap<>();
    private Long nextId = 1L;
    public Book createBook(Book bookData) {
        Long bookId = getNextId();
        books.put(bookId, bookData);
        return books.get(bookId);
    }
    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }
    public Book getBookById(Long bookId) {
        return books.get(bookId);
    }
    public Book updateBook(Long bookId, Book updatedBookData) {
        if (books.containsKey(bookId)) {
            books.put(bookId, updatedBookData);
        }
        return updatedBookData;
    }
    public void deleteBook(Long bookId) {
        books.remove(bookId);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    private synchronized Long getNextId() {
        return nextId++;
    }
}
