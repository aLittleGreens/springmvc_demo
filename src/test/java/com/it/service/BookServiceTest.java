package com.it.service;


import com.it.config.SpringConfig;
import com.it.po.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    BookService bookService;

    @Test
    public void findAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);

    }

}
