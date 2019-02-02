package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import dao.UserDao;
import models.User;
import org.apache.commons.lang3.RandomStringUtils;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Collection;
import java.util.Optional;


public class UserController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(UserController.class);

    final UserDao userDao;

    @Inject
    public UserController(UserDao userDao){

        this.userDao = userDao;
    }


    @Transactional
    public Result registerUser()  {

        final JsonNode json = request().body().asJson();

        final User user = Json.fromJson(json, User.class);

        LOGGER.debug("User name is  = " + user.getName());
        LOGGER.error("This is an error");

        if (null == user.getName() || null == user.getPassword() || null == user.getEmail()) {
            return badRequest("Missing Mandatory Parameters");
        }

        if (userDao.read(user.getName()).isPresent()){
            return badRequest("User Name already taken!");
        }

        user.setState(User.State.VERIFIED);
        user.setRole(User.Role.USER);

        final User newUser = userDao.create(user);

        final JsonNode result = Json.toJson(newUser);

        return ok(result);

    }

    @Transactional
    public Result signInUser() {

        final JsonNode json = request().body().asJson();
        final User user = Json.fromJson(json,User.class);

        if(null == user.getName() || null == user.getPassword()){
            return badRequest("Missing Mandatory Parameters");
        }

        final Optional<User> optionalExistingUser = userDao.read(user.getName());

        if(!optionalExistingUser.isPresent()) {
            return unauthorized("Wrong username!");
        }

        final User existingUser = optionalExistingUser.get();

        if(!existingUser.getPassword().equals(user.getPassword())) {
            return unauthorized("Wrong password!");
        }

        if(existingUser.getState() != User.State.VERIFIED) {
            return unauthorized("Account not verified");
        }

        existingUser.setAccessToken(generateAccessToken());

        userDao.update(existingUser);

        final JsonNode result = Json.toJson(existingUser);

        return ok(result);

    }

    private String generateAccessToken() {

        String authToken = RandomStringUtils.randomAlphabetic(10);
        return authToken;
    }

    @Transactional
    public Result signOutUser() {

        //TODO

        return status(NOT_IMPLEMENTED);
    }

    @Transactional
    public Result getCurrentUser() {

        final Optional<String> authHeader = request().header("Authorization");

        if (!authHeader.isPresent()) {
            return unauthorized("Go and sign in");
        }

        LOGGER.debug("Auth token = {}", authHeader.get());

        if (!authHeader.get().startsWith("Bearer ")) {
            return unauthorized("Invalid auth header format");
        }

        final String accessToken = authHeader.get().substring(7);
        LOGGER.debug("accessToken {}", accessToken);
        if (accessToken.isEmpty()) {
            return unauthorized("Invalid auth header format");
        }

        final User user = userDao.findUserByAuthToken(accessToken);
        if (null == user) {
            return unauthorized("User not found");
        }

        if (user.getRole() != User.Role.ADMIN) {
            return forbidden();
        }

        final JsonNode result = Json.toJson(user);

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
