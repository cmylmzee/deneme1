package com.example.mammamia.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findUsersById(Integer id);

    Optional<Users> findUsersByEmail(String email);
}
