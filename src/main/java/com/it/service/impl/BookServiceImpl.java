package com.it.service.impl;

import com.it.dao.BookDao;
import com.it.exception.BusinessException;
import com.it.po.Book;
import com.it.service.BookService;
import com.it.vo.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        int save = bookDao.save(book);

        return save > 0;
    }

    @Override
    public boolean delete(int id) {
        int delete = bookDao.delete(id);
        return delete > 0;
    }

    @Override
    public boolean update(Book book) {
        int update = bookDao.update(book);
        return update > 0;
    }

    @Override
    public List<Book> getAll() {
//        try {
//            int a = 1 / 0;
//        } catch (Exception e) {
//            throw new BusinessException("业务出错", Code.BUSINESS_CODE);
//        }
        return bookDao.getAll();
    }

    @Override
    public Book getById(int id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getByName(String name) {
        return bookDao.getByName(name);
    }
}
