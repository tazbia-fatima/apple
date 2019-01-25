package dao;


import models.Food;
import play.db.jpa.JPAApi;
import play.libs.F;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FoodDaoImpl implements FoodDao{

    final JPAApi jpaApi;

    @Inject
    public FoodDaoImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    public Food create(Food food){

        if(null == food) {
            throw new IllegalArgumentException("Food must be provided");
        }

        jpaApi.em().persist(food);
        return food;
    }

    public Optional<Food> read(Integer Id) {

        if(null == Id){
            throw new IllegalArgumentException("Id must be provided");
        }

        final Food food = jpaApi.em().find(Food.class, Id);
        return food != null ? Optional.of(food) : Optional.empty();

    }

    public Food update(Food food) {

        if(null == food) {
            throw new IllegalArgumentException("Food must be provided");
        }

        if(null == food.getName()){
            throw new IllegalArgumentException("Food Id must be provided");
        }

        final Food existingFood = jpaApi.em().find(Food.class, food.getName());
        if(null == existingFood) {
            return null;
        }
        existingFood.setCalories(food.getCalories());

        jpaApi.em().persist(existingFood);

        return existingFood;
    }

    public Food delete(Integer Id) {

        if(null == Id) {
            throw new IllegalArgumentException("Food Id must be provided");
        }

        final Food existingFood = jpaApi.em().find(Food.class, Id);
        if(null == existingFood) {
            return null;
        }

        jpaApi.em().remove(existingFood);
        return existingFood;

    }

    public Collection<Food> all() {

        TypedQuery<Food> query = jpaApi.em().createQuery("SELECT f FROM Food f", Food.class);
        List<Food> foods = query.getResultList();

        return foods;
    }


    @Override
    public Collection<Food> createFoods(Collection<Food> foodItems) {



        for(Food item: foodItems){
            jpaApi.em().persist(item);
        }


        return foodItems;
    }
}