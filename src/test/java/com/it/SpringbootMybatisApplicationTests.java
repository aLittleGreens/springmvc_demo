package com.it;


import com.it.po.Book;
import com.it.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringbootMybatisApplicationTests {
    @Autowired
    BookService bookService;

    @Test
    void contextLoads() {
        List<Book> all = bookService.getAll();
        System.out.println(all);

    }

}
