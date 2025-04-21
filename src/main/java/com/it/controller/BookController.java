package com.it.controller;

import com.it.po.Book;
import com.it.service.BookService;
import com.it.vo.Code;
import com.it.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean result = bookService.save(book);
        Integer code = result ? Code.SAVE_OK : Code.SAVE_ERR;
        String msg = result ? "success" : "fail";
        return new Result(code, msg, result);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean result = bookService.delete(id);
        Integer code = result ? Code.DELETE_OK : Code.DELETE_ERR;
        String msg = result ? "success" : "fail";
        return new Result(code, msg, result);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean result = bookService.update(book);
        Integer code = result ? Code.UPDATE_OK : Code.UPDATE_ERR;
        String msg = result ? "success" : "fail";
        return new Result(code, msg, result);
    }

    @GetMapping
    public Result getAll(@RequestParam(required = false) String name) {
        List<Book> bookList;
        if(name != null && !name.isEmpty()) {
            bookList = bookService.getByName(name);
        } else {
            bookList = bookService.getAll();
        }
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "success" : "fail";
        return new Result(code, msg, bookList);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "success" : "fail";
        return new Result(code, msg, book);
    }

}
