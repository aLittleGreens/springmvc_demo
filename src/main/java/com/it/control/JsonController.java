package com.it.control;

import com.it.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JsonController {

    @RequestMapping("pojoParamJson")
    @ResponseBody
    public String pojoParamJson(@RequestBody User user){
        System.out.println(user);

        return "pojoParamJson";
    }


    @RequestMapping("arrayParamJson")
    @ResponseBody
    public String arrayParamJson(@RequestBody List<User> list){
        System.out.println(list);

        return "arrayParamJson";
    }

}
