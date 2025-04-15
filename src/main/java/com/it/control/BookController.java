package com.it.control;

import com.it.vo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save:"+book);
        return "springmvc: book save success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete id:"+id);
        return "springmvc: delete success";
    }

    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update:"+book);
        return "springmvc update book:success";
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable Integer id){
        Book book = new Book(1,"Java入门","Java入门到精通");
        return book;
    }

    @GetMapping
    public List<Book> getAll(){
        Book book1 = new Book(1,"Java入门1","Java入门到精通1");
        Book book2 = new Book(1,"Java入门2","Java入门到精通2");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }

}
