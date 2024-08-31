package com.example.userplay.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userplay.model.User;
import com.example.userplay.service.UserService;



import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/users")
public class UserController {
	


    @Autowired
    private UserService userService;
    

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }
    
    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        User user = userService.findByUsername(username);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

   

//    @PostMapping("/{id}/reviews")
//    public void writeReview(@PathVariable Long id, @RequestBody Review review) {
//        userService.writeReview(id, review);
//    }
//
//    @PostMapping("/{id}/download")
//    public void downloadApp(@PathVariable Long id) {
//        // Implement download logic
//    }
}
