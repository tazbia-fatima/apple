package dao;

import models.FoodIntake;

import java.util.Collection;

public interface FoodIntakeDao extends CrudDao<FoodIntake, Integer>{

    Collection<FoodIntake> createFoodIntake(Collection<FoodIntake> intakes);

}