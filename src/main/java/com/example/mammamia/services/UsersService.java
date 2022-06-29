package com.example.mammamia.services;

import com.example.mammamia.entities.Users;
import com.example.mammamia.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService{

    private final UsersRepository repository;

    @Autowired // OTOMATİK OLARAK USER SERVİCE OLUŞTURUYOR NEWLEMEMİZE GEREK YOK
    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }

    public List<Users> getUsers(){
        return repository.findAll();
    }

    public void addNewUser(Users user){
        Optional<Users> optionalUsers = repository.findUsersByUsername(user.getUsername());
        if(optionalUsers.isPresent()){
            throw  new IllegalStateException("Username is already taken");
        }
        repository.save(user);

    }

    public void removeUser(Integer userId){
        boolean userExists = repository.existsById(userId);
        if( !userExists){
            throw new IllegalStateException("User not found");
        }

        repository.deleteById(userId);

    }



}
