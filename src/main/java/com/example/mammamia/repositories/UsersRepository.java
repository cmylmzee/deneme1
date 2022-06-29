package com.example.mammamia.repositories;
import com.example.mammamia.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findUsersByUsername(String username);
    Optional<Users> findUsersById(Integer id);

    Optional<Users> findUsersByEmail(String email);
}
