package com.example.mammamia.controllers;

import com.example.mammamia.entities.Food;
import com.example.mammamia.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/food")
public class FoodController {
    private  final FoodService foodService;
(
    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
    @GetMapping
    public List<Food> getFoods(){
       return foodService.getFoods();
    }
    @DeleteMapping("delete")
    public void  deleteFood(Integer foodId){
        foodService.removeFood(foodId);
    }
    @PostMapping("changeDescription")
    public void changeDescription(Integer id, String description ){
        foodService.changeDescription(id,description);
    }
    @PostMapping("changeImage")
    public  void changeImage(Integer id, String img){
        foodService.changeImage(id,img);
    }
    @PostMapping("changeIngredients")
    public  void changeIngredients(Integer id,String ingredients){
        foodService.changeIngredients(id,ingredients);
    }
}









}
