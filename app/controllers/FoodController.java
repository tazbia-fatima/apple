package controllers;

import akka.stream.impl.fusing.Collect;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.cj.xdevapi.JsonArray;
import dao.BookDao;
import dao.BookDaoImpl;
import com.google.inject.Inject;
import dao.FoodDao;
import models.Book;
import models.Food;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Array;
import scala.util.parsing.json.JSONArray$;
import scala.util.parsing.json.JSONObject;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.String;

import java.util.*;


public class FoodController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(FoodController.class);
    final FoodDao foodDao;

    @Inject
    public FoodController(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    //    int index = 0;
//    final Map<Integer , Book> books = new HashMap<>();
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

        // Adding new elements to the ArrayList
//        foods.add(new Food("Pecan",795));
//        foods.add(new Food("Grapes",67));
//        foods.add(new Food("Walnuts", 654));
//        foods.add(new Food("Almonds",575));
//        foods.add(new Food("Hazelnuts", 628));
//        foods.add(new Food("Sunflower Seeds", 573));
//        foods.add(new Food("Cranberry Beans", 335));
//        foods.add(new Food("Avocado", 160));
//        foods.add(new Food("Banana", 89));
//        foods.add(new Food("Sweet Potato", 86));
//        foods.add(new Food("Apples", 52));
//        foods.add(new Food("Papaya", 39));
//        foods.add(new Food("Okra", 31));
//        foods.add(new Food("Lemons", 28));
//
//        final Collection<Food> newFoodItems = foodDao.createFoods(foods);
//
//        final JsonNode result = Json.toJson(newFoodItems);
//        return ok(result);
        final JsonNode json = request().body().asJson();
        final Food food = Json.fromJson(json, Food.class);

        if (null == food.getName()) {
            return badRequest("Missing title");
        }


        foods.add(food);

        final Collection<Food> newFoodItems = foodDao.createFoods(foods);


        final JsonNode result = Json.toJson(newFoodItems);




        return ok(result);




    }


    @Transactional
    public Result getFoodById(Integer Id) {

        if (null == Id) {
            return badRequest("Id must be provided");
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
            return badRequest("Id must be provided");
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

