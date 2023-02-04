package com.example.ecommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.ecommerce.repository.UserRepository;



import com.example.ecommerce.entity.*;
import com.example.ecommerce.repository.UserRepository;



@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    
    @GetMapping(value = "/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }
    
    @GetMapping(value = "/{userid}")
    public User get(@PathVariable("userid") int userid) {
        return userRepository.findById(userid).get();
    }
    
    @PostMapping(value = "/add")
    public User persist(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findById(user.getUserid()).get();
    }
   
    @DeleteMapping(value = "/delete")
    public List<User> delete(@PathVariable int userid) {
        userRepository.deleteById(userid);
        return userRepository.findAll();
    }
    
    @PutMapping(value = "/{userid}/put")
    public List<User> put(@PathVariable int userid, @RequestBody User user) {
        if (userRepository.existsById(userid)) {
            userRepository.deleteById(userid);
            userRepository.save(user);
        }
        
        return userRepository.findAll();
    }
}