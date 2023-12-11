package com.example.sp_lab2.services;

import com.example.sp_lab2.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private final Map<Integer, Book> books = new HashMap<>();
    private int nextId = 1;
    public Book createBook(Book bookData) {
        int bookId = getNextId();
        books.put(bookId, bookData);
        return books.get(bookId);
    }
    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }
    public Book getBookById(int bookId) {
        return books.get(bookId);
    }
    public void updateBook(int bookId, Book updatedBookData) {
        if (books.containsKey(bookId)) {
            books.put(bookId, updatedBookData);
        }
    }
    public void deleteBook(int bookId) {
        books.remove(bookId);
    }
    private synchronized int getNextId() {
        return nextId++;
    }
}
