package com.stackroute.redispoc.controller;


import com.stackroute.redispoc.domain.User;
import com.stackroute.redispoc.repository.UserRepository;
import com.stackroute.redispoc.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {
    private UserService userService;
    private ResponseEntity responseEntity;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    public UserController() {
//    }

    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        User newUser = userService.saveUser(user);
        responseEntity = new ResponseEntity(newUser, HttpStatus.ACCEPTED);
        return responseEntity;
    }
    @GetMapping("users")
    public ResponseEntity<?> getAllUser(){
        responseEntity = new ResponseEntity(userService.getAllUser(),HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable String id){
        responseEntity = new ResponseEntity(userService.getUserById(id),HttpStatus.OK);
        return responseEntity;
    }
    @PutMapping("user")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        User newUser = userService.updateUser(user);
        responseEntity = new ResponseEntity(newUser,HttpStatus.OK);
        return responseEntity;
    }
}
