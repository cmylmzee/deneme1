package com.example.mammamia.controllers;

import com.example.mammamia.entities.Users;
import com.example.mammamia.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UsersController {

    private  final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public List<Users> getUsers (){
        return usersService.getUsers();
    }

    @PostMapping("/register")
    public void registerUsers(@RequestBody Users user){
        usersService.addNewUser(user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudent( @PathVariable("id") Integer id){
        usersService.removeUser(id);
    }

}
