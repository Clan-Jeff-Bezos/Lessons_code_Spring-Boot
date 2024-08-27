package com.riwi.RiwiMovies.controllers.impl;

import com.riwi.RiwiMovies.entities.UserEntity;
import com.riwi.RiwiMovies.services.interfaces.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller // View (Thymeleaf)
// @ResponseBody <- @RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/readById")
    public String create(Model model) {
        model.addAttribute("user", new UserEntity());
        return "Form";
    }

    @GetMapping("/{id}/update")
    public String update(Model model, @PathVariable String id) {
        UserEntity user = new UserEntity();
        user.setId(id);

        model.addAttribute("user", user);
        return "Form";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute UserEntity user){
        userService.save(user);
        return "redirect:/users";
    }

    @PostMapping("/searchById")
    public String searchById(@RequestParam("userId") String id, Model model){
        List<UserEntity> users = new ArrayList<>();
        users.add(userService.readById(id));

        model.addAttribute("users", users);
        return "Users";
    }

    @GetMapping("/{id}/archive")
    public String archiveUser(@PathVariable String id){
        userService.archive(id);
        return "redirect:/users";
    }

    @GetMapping("/helloName")
    public String helloName(Model model){
        model.addAttribute("name","Antony");
        return "HelloName";
    }

    @GetMapping
    public String getUsers(Model model){
        model.addAttribute("users", userService.readAll());
        return "Users";
    }

}
