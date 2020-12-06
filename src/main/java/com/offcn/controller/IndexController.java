package com.offcn.controller;


import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/Index")
    public String Index(Model model) {
        model.addAttribute("message", "欢迎来到有就业学习");
        return "index";
    }

    @RequestMapping("/findUser")
    public String findUser(Model model) {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(25);


        Map<String,String> map=new HashMap();
        map.put("id","2");
        map.put("name","李四");
        map.put("sex","男");

        model.addAttribute("map",map);
        model.addAttribute("user",user);
        return "index02";
    }

    @RequestMapping("/findAll")
    public  String findAllUser(Model  model){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAge(25);
        User user3 = new User();
        user3.setId(1L);
        user3.setName("张三");
        user3.setAge(25);
        User user2 = new User();
        user2.setId(1L);
        user2.setName("张三");
        user2.setAge(25);
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("UserList",list);
        return "index03";
    }
}
