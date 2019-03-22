package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dao.FoodDao;
import models.Food;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


public class FoodController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(FoodController.class);
    final FoodDao foodDao;

    @Inject
    public FoodController(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @Transactional
    public Result createFood()  {
        final JsonNode json = request().body().asJson();

        final Food food = Json.fromJson(json, Food.class);

        LOGGER.debug("Food title = " + food.getName());
        LOGGER.error("This is an error");

        if (null == food.getName()) {
            return badRequest("Title must be provided");
        }

        final Food newFood = foodDao.create(food);

        final JsonNode result = Json.toJson(newFood);

        return ok(result);

    }

    @Transactional
    public Result createFoods() {

        List<Food> foods = new ArrayList<>();


        final JsonNode json = request().body().asJson();

        if (!json.isArray()) {
            return badRequest("please enter food items");
        }

        for (JsonNode node : json) {
            final Food food = Json.fromJson(node, Food.class);
            foods.add(food);

        }
        if (foods.isEmpty()) {
            return badRequest();
        }

        final Collection<Food> newFoodItems = foodDao.createFoods(foods);
        final JsonNode result = Json.toJson(newFoodItems);
        return ok(result);

    }

    @Transactional
    public Result getFoodById(Integer Id) {

        if (null == Id) {
            return badRequest("Name must be provided");
        }
        final Optional<Food> food = foodDao.read(Id);
        if(food.isPresent()) {

            final JsonNode result = Json.toJson(food.get());
            return ok(result);
        }
        else {
            return notFound();
        }

    }

    @Transactional
    public Result updateFoodByName(String name) {

        if(null == name){
            return badRequest("Name must be provided");
        }
        final JsonNode json = request().body().asJson();
        final Food newFood = Json.fromJson(json, Food.class);

        newFood.setName(name);

        final Food updatedFood = foodDao.update(newFood);

        final JsonNode result = Json.toJson(updatedFood);

        return ok(result);
    }

    @Transactional
    public Result deleteFoodById(Integer Id) {
        if (null == Id) {
            return badRequest("Id must be provided");
        }

        final Food food = foodDao.delete(Id);


        final JsonNode result = Json.toJson(food);
        return ok(result);
    }

    @Transactional
    public Result getAllFood() {

    /*TypedQuery<Book> query = jpaApi.em().createQuery("SELECT b FROM Book b", Book.class);
    List<Book> books = query.getResultList();*/

        Collection<Food> foods = foodDao.all();

        final JsonNode result = Json.toJson(foods);

        return ok(result);
    }

}

