package com.example.upheroku.controllers;

import com.example.upheroku.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @GetMapping
    public ResponseEntity<?> getAllUser(){
        User user = new User(01,"Con lợn Huân", "Điện Biên");
        User user1 = new User(02,"Sáng đẹp trai","Nam Định");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        return ResponseEntity.status(200).body(users);
    }
}
