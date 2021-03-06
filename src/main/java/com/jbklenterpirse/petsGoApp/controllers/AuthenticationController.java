package com.jbklenterpirse.petsGoApp.controllers;

import com.jbklenterpirse.petsGoApp.services.UserServiceImpl;
import com.jbklenterpirse.petsGoApp.services.dtos.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AuthenticationController {

    private final UserServiceImpl userService;

    public AuthenticationController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/user/save")
    public UUID saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @GetMapping("/users")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

}


