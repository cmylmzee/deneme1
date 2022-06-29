package com.example.mammamia;

import com.example.mammamia.entities.Users;
import com.example.mammamia.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class UsersConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository){
        return  args -> {
            Users users = new Users("yarkins", "yarkin sakinci", "12345", "türkis", "male", "a.@gmail.com", 1, new Date(2020,10,10));
            Users users2 = new Users("cem", "yarkin sakinci", "12345", "türkis", "male", "a.@gmail.com", 1, new Date(2020,10,10));
            Users users3 = new Users("değişik biri", "yarkin sakinci", "12345", "türkis", "male", "a.@gmail.com", 1, new Date(2020,10,10));

            repository.saveAll(List.of(users, users2, users3));
        };

    }
}
