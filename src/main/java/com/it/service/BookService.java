package com.it.service;

import com.it.po.Book;

import java.util.List;

public interface BookService {

    boolean save(Book book);

    boolean delete(int id);

    boolean update(Book book);

    List<Book> getAll();

    Book getById(int id);

    List<Book> getByName(String name);

}
