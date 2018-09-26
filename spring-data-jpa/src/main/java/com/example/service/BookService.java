package com.example.service;

import com.example.entity.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List<Book> getAll();
    Book get(int id);
    void delete(int id);
}
