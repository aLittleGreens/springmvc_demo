package com.it.dao;

import com.it.po.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    // 插入
    @Insert("insert into book (type,name,description) values(#{type},#{name},#{description})")
    int save(Book book);

    @Delete("delete from book where id=#{id}")
    int delete(int id);

    @Update("update book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    int update(Book book);

    //查询全部
    @Select("select * from book")
    List<Book> getAll();

    //根据id查询
    @Select("select * from book where id=#{id}")
    Book getById(int id);

    //根据名称模糊查询
    @Select("select * from book where name like concat('%',#{name},'%')")
    List<Book> getByName(String name);

}
