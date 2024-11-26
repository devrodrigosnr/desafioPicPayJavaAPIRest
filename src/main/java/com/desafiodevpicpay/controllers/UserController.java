package com.desafiodevpicpay.controllers;

import com.desafiodevpicpay.domain.user.User;
import com.desafiodevpicpay.dtos.UserDTO;
import com.desafiodevpicpay.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user){
        User newUser = userService.createUser(user);
        System.out.println("Cadastrando usuário ");
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        System.out.println("Buscando todos os usuários cadastrados");
        List<User> users = this.userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
