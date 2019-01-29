package com.mdh.springboot.controller;

import com.mdh.springboot.entity.User;
import com.mdh.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: madonghao
 * @Date: 2019/1/28 15:41
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    /**
     * http://localhost:8080/user/1
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") Integer id){
        //User user = userRepository.getOne(id);
        Optional<User> one = userRepository.findById(id);
        return one.get();
    }

    /**
     * http://localhost:8080/user?lastName=ls&email=lsqq.com
     * @param user
     * @return
     */
    @GetMapping("/user")
    private User saveUser(User user){
        User save = userRepository.save(user);
        return save;
    }
}
