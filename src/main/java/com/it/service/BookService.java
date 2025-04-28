package com.it.service;

import com.it.po.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    boolean save(Book book);

    boolean delete(int id);

    boolean update(Book book);

    List<Book> getAll();

    Book getById(int id);

    List<Book> getByName(String name);

}
