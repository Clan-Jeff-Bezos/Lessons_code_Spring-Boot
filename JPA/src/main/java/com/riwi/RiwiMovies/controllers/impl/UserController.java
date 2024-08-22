package com.riwi.RiwiMovies.controllers.impl;

import com.riwi.RiwiMovies.controllers.interfaces.IUserController;
import com.riwi.RiwiMovies.entities.UserEntity;
import com.riwi.RiwiMovies.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // View (Thymeleaf)
// @ResponseBody <- @RestController
@RequestMapping("/users")
public class UserController implements IUserController {

    @Autowired
    IUserService userService;

    @Override
    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<UserEntity> create(
            @RequestBody UserEntity userEntity) {
        return ResponseEntity.ok(userService.save(userEntity));
    }

    @GetMapping("/hello")
    public String hello(){
        return "holaMundo";
    }
}
