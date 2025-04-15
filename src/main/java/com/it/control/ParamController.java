package com.it.control;

import com.it.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 参数控制器
 */
@Controller
public class ParamController {

    @RequestMapping(value = "/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String username){
        System.out.println("name:"+username);
        return "commonParam";
    }

    @RequestMapping(value = "/pojoParam") //对象
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("user:"+user);
        return "pojoParam";
    }

    @RequestMapping(value = "/pojoContentParam") //对象
    @ResponseBody
    public String pojoContainerParam(User user){
        System.out.println("user:"+user);
        return "pojoContainerParam";
    }

    @RequestMapping(value = "/arrayParam") //对象
    @ResponseBody
    public String arrayParam(String[] arr){
        System.out.println("arr:"+ Arrays.toString(arr));
        return "arrayParam";
    }

    @RequestMapping(value = "/listParam") //对象
    @ResponseBody
    public String listParam(@RequestParam List<String> list){
        System.out.println("list:"+ list);
        return "listParam";
    }

    @RequestMapping(value = "/mapParam") //对象
    @ResponseBody
    public String mapParam(@RequestParam Map<String,String> map){
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        return "mapParam";
    }

}
