package com.qf.controller;

import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ding on 2019/11/27.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public List<User>findAll(){
        List<User> all = userService.findAll();
        System.out.println("启动了");
        return all;
    }
    @RequestMapping(value = "/findOne",method = RequestMethod.POST)
    public User findOne( @RequestBody User user){
        Integer id = user.getId();
        return userService.findById(id);
    }
    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    public User updateuser(@RequestBody User user){
       return userService.update(user);
    }
    @RequestMapping(value = "/deleteById/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable("id") Integer id){
       return userService.deleteById(id);
    }
}
