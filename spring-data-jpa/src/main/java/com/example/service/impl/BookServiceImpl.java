package com.example.service.impl;

import com.example.dao.BookRepository;
import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookRepository bookRepository;

    @Override
    @Transactional
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public Book get(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
