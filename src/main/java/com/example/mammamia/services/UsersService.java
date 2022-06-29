package com.example.mammamia.services;

import com.example.mammamia.entities.Users;
import com.example.mammamia.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        System.out.println("save öncesi");
        repository.save(user);
        System.out.println("save sonrası");

    }

    public void removeUser(Integer userId){
        boolean userExists = repository.existsById(userId);
        if( !userExists){
            throw new IllegalStateException("User not found");
        }

        repository.deleteById(userId);

    }
    @Transactional // UPDATE ETMESİ İÇİN YANİ ÜSTÜNE YAZMASI İÇİN GEREKLİ BİR ANOTASYON

    public void changePassword(Integer id, String password ){
        Optional<Users> optionalUsers = repository.findUsersById(id);
        if(!optionalUsers.isPresent()){
            throw new IllegalStateException("User not found");
        }
        optionalUsers.get().setPassword(password);
    }
    @Transactional
    public  void changeRoleId(Integer id, Integer roleId){
        Optional<Users> optionalUsers = repository.findUsersById(id);
        if(!optionalUsers.isPresent()){
            throw new IllegalStateException("User not found");
        }
        optionalUsers.get().setRoleId(roleId);
    }
    @Transactional
    public  void changeEmail(Integer id, String email){
        Optional<Users> optionalUsers = repository.findUsersById(id);
        if(!optionalUsers.isPresent()){
            throw new IllegalStateException("User not found");
        }
        optionalUsers.get().setEmail(email);
    }





}
