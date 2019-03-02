package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import controllers.Security.Authenticator;
import dao.ProfileDao;
import dao.UserDao;
import models.Profile;
import models.User;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


public class ProfileController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(ProfileController.class);


    private  UserDao userDao;

    private  ProfileDao profileDao;

    @Inject
    public ProfileController(UserDao userDao, ProfileDao profileDao) {
        this.userDao = userDao;
        this.profileDao = profileDao;
    }

    @Transactional
    @Authenticator
    public Result createProfile() {

        final JsonNode json = request().body().asJson();

        final Profile profile = Json.fromJson(json, Profile.class);

        final User user = (User) ctx().args.get("user");

        profile.setUser(user);

        LOGGER.debug("Details {} ",profile);

        final Profile newProfile = profileDao.create(profile);

        final JsonNode result = Json.toJson(newProfile);

        return ok(result);

    }

    @Transactional
    public Result updateProfileByAge(Integer age) {

        if(null == age){
            return badRequest("Id must be provided");
        }
        final JsonNode json = request().body().asJson();
        final Profile newProfile = Json.fromJson(json, Profile.class);

        newProfile.setAge(age);

        final Profile updatedProfile = profileDao.update(newProfile);

        final JsonNode result = Json.toJson(updatedProfile);


        return ok(result);
    }


    @Transactional
    public Result updateProfileByHeight(Integer height) {

        if(null == height){
            return badRequest("Height must be provided");
        }
        final JsonNode json = request().body().asJson();
        final Profile newProfile = Json.fromJson(json, Profile.class);

        newProfile.setAge(height);

        final Profile updatedProfile= profileDao.update(newProfile);

        final JsonNode result = Json.toJson(updatedProfile);

        return ok(result);
    }

    @Transactional
    public Result updateProfileByWeight(Integer weight) {

        if(null == weight){
            return badRequest("Age must be provided");
        }
        final JsonNode json = request().body().asJson();
        final Profile newProfile = Json.fromJson(json, Profile.class);

        newProfile.setAge(weight);

        final Profile updatedProfile= profileDao.update(newProfile);

        final JsonNode result = Json.toJson(updatedProfile);

        return ok(result);
    }



}
