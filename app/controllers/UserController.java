package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dao.UserDao;
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


public class UserController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(UserController.class);
    final UserDao userDao;

    @Inject
    public UserController(UserDao userDao){

        this.userDao = userDao;
    }

//    @Transactional
//    public Result registerUser() {
//        final JsonNode json = request().body().asJson();
//
//        final User user = Json.fromJson(json, User.class);
//
//        LOGGER.debug("User name is  = " + user.getName());
//        LOGGER.error("This is an error");
//
//        if(null == user.getName()){
//            return forbidden("Please enter name");
//
//        }


    @Transactional
    public Result createUser()  {
        final JsonNode json = request().body().asJson();

        final User user = Json.fromJson(json, User.class);

        LOGGER.debug("User name is  = " + user.getName());
        LOGGER.error("This is an error");

        if (null == user.getName()) {
            return badRequest("Title must be provided");
        }

        final User newUser = userDao.create(user);

        final JsonNode result = Json.toJson(newUser);

        return ok(result);

    }

    @Transactional
    public Result createUsers() {

        List<User> users = new ArrayList<>();

        final JsonNode json = request().body().asJson();

        if (!json.isArray()) {
            return badRequest("please enter users");
        }

        for (JsonNode node : json) {
            final User user = Json.fromJson(node, User.class);
            users.add(user);

        }
        if (users.isEmpty()) {
            return badRequest();
        }

        final Collection<User> newUserMem = userDao.createUsers(users);
        final JsonNode result = Json.toJson(newUserMem);
        return ok(result);

    }

    @Transactional
    public Result getUserByName(String name) {

        if (null == name) {
            return badRequest("Name must be provided");
        }
        final Optional<User> user = userDao.read(name);
        if(user.isPresent()) {

            final JsonNode result = Json.toJson(user.get());
            return ok(result);
        }
        else {
            return notFound();
        }

    }

    @Transactional
    public Result updateUserByName(String name) {

        if(null == name){
            return badRequest("Name must be provided");
        }
        final JsonNode json = request().body().asJson();
        final User newUser = Json.fromJson(json, User.class);

        newUser.setName(name);

        final User updatedUser = userDao.update(newUser);

        final JsonNode result = Json.toJson(updatedUser);



        return ok(result);
    }

    @Transactional
    public Result deleteUserByName(String name) {
        if (null == name) {
            return badRequest("Name must be provided");
        }

        final User user = userDao.delete(name);


        final JsonNode result = Json.toJson(user);
        return ok(result);
    }

    @Transactional
    public Result getAllUsers() {

        Collection<User> users = userDao.all();

        final JsonNode result = Json.toJson(users);

        return ok(result);
    }

}
