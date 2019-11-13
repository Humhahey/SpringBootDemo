package cn.humhahey.controller;

import cn.humhahey.pojo.User;
import cn.humhahey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/user")
    public List<User> postUser(@RequestBody List<User> users) {
        return users;
    }

    @PostMapping("/userString")
    public User postUser(User user) {
        return user;
    }
}
