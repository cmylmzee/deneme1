package com.example.mammamia.entities;

import javax.persistence.*;

@Entity
@Table
public class Food {

    @SequenceGenerator(
            name = "yemek_sequence",
            sequenceName = "yemek_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "yemek_sequence"
    )

    @Id
    private Integer id;
    private Integer user_id;
    private String name, description, calories, image, ingredients, chef_name;


    public Food(Integer id, Integer user_id, String name, String description, String calories, String image, String ingredients, String chef_name) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.image = image;
        this.ingredients = ingredients;
        this.chef_name = chef_name;
    }

    public Food(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getChef_name() {
        return chef_name;
    }

    public void setChef_name(String chef_name) {
        this.chef_name = chef_name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", calories='" + calories + '\'' +
                ", image='" + image + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", chef_name='" + chef_name + '\'' +
                '}';
    }



}
