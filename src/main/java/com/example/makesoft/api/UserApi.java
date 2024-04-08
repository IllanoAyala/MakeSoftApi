package com.example.makesoft.api;


import com.example.makesoft.model.User;
import com.example.makesoft.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor

public class UserApi {

    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }


    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok(user);
    }
}
