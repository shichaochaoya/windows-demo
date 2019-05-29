package com.wang.clouddemo.demo.controller;

import com.wang.clouddemo.demo.pojo.User;
import com.wang.clouddemo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/user")
    public @ResponseBody
    List<User> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/user/uid/{uid}")
    User getUserByPid(@PathVariable int uid){
        return userService.findByUid(uid);
    }

    @PutMapping("user/save")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("user/uid/{uid}")
    public String deleteByUid(@PathVariable int uid){
        return userService.deleteByUid(uid);
    }

    @PutMapping("user/update")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
