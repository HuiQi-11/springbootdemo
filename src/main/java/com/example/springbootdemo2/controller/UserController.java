package com.example.springbootdemo2.controller;

import com.example.springbootdemo2.entity.User;
import com.example.springbootdemo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huiqi
 * @CreateTime: 2019-10-21 18:09
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(String name, int age) {
        User user = new User(name,age);
        userService.save(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public boolean deleteUserById(int id) {
        return userService.deleteById(id);
    }


    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public boolean deleteUserById(int id, String name, int age) {
        User user = new User(id,name,age);
        return userService.updateById(user);
    }


    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    public User getUserById(int id) {
        System.out.println(id);
        return userService.getUser(id);
    }
}