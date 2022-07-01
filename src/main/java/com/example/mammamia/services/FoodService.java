package com.example.mammamia.services;

import com.example.mammamia.entities.Food;
import com.example.mammamia.entities.Users;
import com.example.mammamia.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getFoods(){
        return foodRepository.findAll();
    }

    public void addNewFood(Food food){
        Optional<Food> optionalFood = foodRepository.findFoodById(food.getId());
        if(optionalFood.isPresent()){
            throw  new IllegalStateException("Food is already taken");
        }
        foodRepository.save(food);

    }

    public void removeFood(Integer foodId){
        boolean userExists = foodRepository.existsById(foodId);
        if( !userExists){
            throw new IllegalStateException("User not found");
        }

        foodRepository.deleteById(foodId);

    }
    @Transactional // UPDATE ETMESİ İÇİN YANİ ÜSTÜNE YAZMASI İÇİN GEREKLİ BİR ANOTASYON

    public void changeDescription(Integer id, String description ){
        Optional<Food> optionalFood = foodRepository.findFoodById(id);
        if(!optionalFood.isPresent()){
            throw new IllegalStateException("Food not found");
        }
        optionalFood.get().setDescription(description);
    }
    @Transactional
    public  void changeImage(Integer id, String img){
        Optional<Food> optionalFood = foodRepository.findFoodById(id);
        if(!optionalFood.isPresent()){
            throw new IllegalStateException("Food not found");
        }
        optionalFood.get().setImage(img);
    }
    @Transactional
    public  void changeIngredients(Integer id,String ingredients){
        Optional<Food> optionalFood = foodRepository.findFoodById(id);
        if(!optionalFood.isPresent()){
            throw new IllegalStateException("Food not found");
        }
        optionalFood.get().setIngredients(ingredients);
    }
}
