package com.colydev.springboot.controller;

import com.colydev.springboot.model.User;
import com.colydev.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
   /* @PostMapping("/essai")
    public String test(String prenom){
        return prenom;
    }*/
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/ajoutuser")
    public User ajoutUser(User user){
       // user.setStatus(user.getStatus()+"test");
        userRepository.save(user);
        return user;
    }
    @GetMapping(value = "/listeuser")
    public List<User> liste(){
        return userRepository.findAll();
    }
}
