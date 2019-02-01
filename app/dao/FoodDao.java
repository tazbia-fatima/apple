package dao;

import models.Food;

import java.util.Collection;

public interface FoodDao extends CrudDao<Food, Integer>{
    Collection<Food> createFoods(Collection<Food> foodItems);

}