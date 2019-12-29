package com.brian.sprbootdemo.controller;

import com.brian.sprbootdemo.domain.User;
import com.brian.sprbootdemo.repository.UserRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brian in 18:18 2018/4/18
 */
@Scope
@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name){
        User user = new User();

        user.setName(name);
        if(userRepository.save(user)){
            System.out.println("user "+user.toString()+" 已保存");
        }


        return user;
    }
}
