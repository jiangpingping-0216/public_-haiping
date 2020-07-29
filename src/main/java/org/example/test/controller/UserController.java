package org.example.test.controller;

import org.example.test.entity.User;
import org.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String success(){
        return "success";
    }

    @RequestMapping(value = "/failure",method = RequestMethod.GET)
    public String failure(){
        return "failure";
    }

    @RequestMapping(value = "/register",method= RequestMethod.POST)
    @ResponseBody
    public boolean register(String name, String gender){
        User user=new User();
        user.setName(name);
        user.setGender(gender);
        System.out.println(user.getName()+"--"+user.getGender());
        return userService.register(user);
    }

    @RequestMapping(value = "/query",method= RequestMethod.GET)
    @ResponseBody
    public List<User> query(){
        return userService.query();
    }
}
