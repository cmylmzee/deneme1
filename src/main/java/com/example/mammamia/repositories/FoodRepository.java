package com.example.mammamia.repositories;
import com.example.mammamia.entities.Food;
import com.example.mammamia.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
    Optional<Food> findFoodById(Integer id);
    Optional<Food> findFoodByName(String name);
    Optional<Food> findFoodByChef_name(String name);

}
