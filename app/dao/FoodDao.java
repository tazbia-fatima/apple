package dao;

import com.google.inject.Inject;
import models.Food;
import play.db.jpa.JPAApi;

import java.util.Collection;

public interface FoodDao extends CrudDao<Food, Integer>{
    Collection<Food> createFoods(Collection<Food> foodItems);

}