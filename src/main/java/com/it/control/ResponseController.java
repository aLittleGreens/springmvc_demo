package com.it.control;

import com.it.vo.Address;
import com.it.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {

    /**
     * @return html页面，   不加 @ResponseBody的话，会把返回值当作一个页面
     */
    @RequestMapping("/toPage")
    public String toPage() {
        System.out.println("toPage");
        return "index.jsp";
    }

    // 返回json数据
    @RequestMapping("/toJson")
    @ResponseBody
    public User toJson() {
        User user = new User();
        user.setName("name");
        user.setAge(20);
        Address address = new Address();
        address.setCity("city");
        address.setProvince("guangzhou");
        user.setAddress(address);
        return user;
    }

}
