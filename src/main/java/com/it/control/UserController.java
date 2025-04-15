package com.it.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * User 控制类
 * 1、交给spring管理
 * 2、定义处理请求方法
 * 3、设置当前方法的访问路径
 * 4、设置返回数据类型为String
 */
//@Controller
//@ResponseBody
@RestController

@RequestMapping("/user")
public class UserController {

//    @RequestMapping(value = "/save",method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String save(){
//        System.out.println("user save");
//        return "springmvc:success";
//    }

//    @RequestMapping("/update")
//    @ResponseBody
//    public String update(){
//        System.out.println("user update");
//        return "springmvc update :success";
//    }

    //增
    @PutMapping
//    @RequestMapping(value = "",method = RequestMethod.PUT)
    public String update(){
        System.out.println("user update");
        return "springmvc update :success";
    }

    //删
    @DeleteMapping("/{id}")
//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        System.out.println("user delete:"+id);
        return "springmvc delete :success";
    }

    //改
    @PostMapping
//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseBody
    public String save(){
        System.out.println("user save");
        return "springmvc save :success";
    }




}
