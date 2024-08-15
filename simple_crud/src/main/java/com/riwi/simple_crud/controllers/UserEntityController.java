package com.riwi.simple_crud.controllers;

import ch.qos.logback.core.model.processor.PhaseIndicator;
import com.riwi.simple_crud.entities.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/users")
public class UserEntityController {

    @GetMapping("/{id}")
    public String getUserById(
            @PathVariable String id){
        return "El id del usuario es :" + id;
    }

    @PostMapping("/create")
    public String postUser(
            @RequestBody UserEntity user
            ){
        return user.toString();
    }

    @DeleteMapping("/delete")
    public String deleteUser(
            @RequestParam Integer id
    ){
        return String.format("El id %d fue eliminado", id);
    }
}
