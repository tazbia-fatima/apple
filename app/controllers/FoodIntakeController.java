package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import controllers.Security.Authenticator;
import dao.FoodDao;
import dao.FoodIntakeDao;
import models.Food;
import models.FoodIntake;
import models.User;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class FoodIntakeController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(FoodIntakeController.class);

    private FoodDao foodDao;

    private FoodIntakeDao foodIntakeDao;

    @Inject
    public FoodIntakeController(FoodDao foodDao, FoodIntakeDao foodIntake) {
        this.foodDao = foodDao;
        this.foodIntakeDao = foodIntake;
    }

    @Transactional
    @Authenticator
    public Result createFoodIntake() {

        final JsonNode json = request().body().asJson();

        final User user = (User) ctx().args.get("user");

        final List<FoodIntake> intakes = new ArrayList<>();
        if (!json.isArray()) {
            return badRequest("please enter food items");
        }

        for (JsonNode node : json) {
            final FoodIntake intake = Json.fromJson(node, FoodIntake.class);

            LOGGER.debug("food id {}", node.get("foodId"));

            final Integer foodId = node.get("foodId").asInt();
            final Optional<Food> optionalFood = foodDao.read(foodId);
            if(!optionalFood.isPresent()){
                return badRequest("No food found");
            }
            final Food food = optionalFood.get();
            intake.setFood(food);

            intake.setUser(user);

            intakes.add(intake);

        }

        if (intakes.isEmpty()) {
            return badRequest();
        }

        LOGGER.debug("Intakes {} ",intakes);

        final Collection<FoodIntake> newIntake = foodIntakeDao.createFoodIntake(intakes);

        final JsonNode result = Json.toJson(newIntake);

        return ok(result);

    }

    @Transactional
    @Authenticator
    public  Result deleteFoodIntake() {

        return ok();
    }

}
