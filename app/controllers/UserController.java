package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.io.BaseEncoding;
import com.google.inject.Inject;
import controllers.Security.Authenticator;
import dao.UserDao;
import models.User;
import org.apache.commons.lang3.RandomStringUtils;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

<<<<<<< HEAD
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
=======
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
import java.util.Collection;
import java.util.Optional;


public class UserController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(UserController.class);

<<<<<<< HEAD
    private final static int HASH_ITERATIONS = 100;

    private UserDao userDao;
=======
    final UserDao userDao;
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0

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

<<<<<<< HEAD
        if (null == user.getName()  || null == user.getEmail()) {
            return badRequest("Missing Mandatory Parameters");
        }

        final String password = json.get("password").asText();

        if(null == password){
            return badRequest("Missing mandatory parameters");
        }

        if(userDao.read(user.getName()).isPresent()){
            return badRequest("user taken!");
        }

        final String salt = generateSalt();

        final String hash = generateHash(salt,password,HASH_ITERATIONS);

        user.setHashIterations(HASH_ITERATIONS);
        user.setSalt(salt);
        user.setPasswordHash(hash);
=======
        if (null == user.getName() || null == user.getPassword() || null == user.getEmail()) {
            return badRequest("Missing Mandatory Parameters");
        }

        if (userDao.read(user.getName()).isPresent()){
            return badRequest("User Name already taken!");
        }

>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
        user.setState(User.State.VERIFIED);
        user.setRole(User.Role.USER);

        final User newUser = userDao.create(user);

        final JsonNode result = Json.toJson(newUser);

        return ok(result);

    }

<<<<<<< HEAD
    private String generateSalt() {

        String mySalt = RandomStringUtils.randomAlphabetic(10);
        return mySalt;

    }

    private String generateHash(String salt,String password,int iterations) {

        try{

            final String concat = salt + ":" + password;
            //TODO Run in a loo x iterations
            //TODO Use a better hash function

            final MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(concat.getBytes());
            final String passwordHash = BaseEncoding.base16().lowerCase().encode(messageDigest);

            LOGGER.debug("Password hash {}", passwordHash);

            return passwordHash;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

=======
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
    @Transactional
    public Result signInUser() {

        final JsonNode json = request().body().asJson();
        final User user = Json.fromJson(json,User.class);

        if(null == user.getName() || null == user.getPassword()){
            return badRequest("Missing Mandatory Parameters");
        }

        final Optional<User> optionalExistingUser = userDao.read(user.getName());

<<<<<<< HEAD
        final String name = json.get("name").asText();
        final String password = json.get("password").asText();

        if(null == password || null == name){
            return badRequest("Missing Mandatory Parameters");
        }

        final Optional<User> optionalExistingUser = userDao.read(name);

        if(!optionalExistingUser.isPresent()) {
            return unauthorized("Wrong username!");
        }

        final User existingUser = optionalExistingUser.get();

        final String salt = existingUser.getSalt();
        final int iterations = existingUser.getHashIterations();
        final String hash = generateHash(salt,password, iterations);


        if(!existingUser.getPasswordHash().equals(hash)) {
            return unauthorized("Wrong password!");
        }

=======
        if(!optionalExistingUser.isPresent()) {
            return unauthorized("Wrong username!");
        }

        final User existingUser = optionalExistingUser.get();

        if(!existingUser.getPassword().equals(user.getPassword())) {
            return unauthorized("Wrong password!");
        }

>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
        if(existingUser.getState() != User.State.VERIFIED) {
            return unauthorized("Account not verified");
        }

        existingUser.setAccessToken(generateAccessToken());

        userDao.update(existingUser);

        final JsonNode result = Json.toJson(existingUser);

        return ok(result);

    }

<<<<<<< HEAD

    private String generateAccessToken() {

        return "ABC123";

//        String authToken = RandomStringUtils.randomAlphabetic(100);
//        System.out.println(authToken);
//        return authToken;
=======
    private String generateAccessToken() {

        String authToken = RandomStringUtils.randomAlphabetic(10);
        return authToken;
    }

    @Transactional
    public Result signOutUser() {

        //TODO

        return status(NOT_IMPLEMENTED);
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
    }

    @Authenticator
    @Transactional
<<<<<<< HEAD
    public Result signOutUser() {

        final User user = (User) ctx().args.get("user");

        user.setAccessToken(null);

        userDao.update(user);

        return ok();
    }
=======
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
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0

        if (user.getRole() != User.Role.ADMIN) {
            return forbidden();
        }

<<<<<<< HEAD
    @Authenticator
    @Transactional
    public Result getCurrentUser() {

        final User user = (User) ctx().args.get("user");

        if(null == user.getAccessToken()){
            System.out.println("token is"+user.getAccessToken());
        }

=======
>>>>>>> 0511057228a9fb6077501750f6762884c4fbeea0
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
