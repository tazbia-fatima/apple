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
    private Profile profile;

    @Inject
    public ProfileController(UserDao userDao, ProfileDao profileDao,Profile profile) {
        this.userDao = userDao;
        this.profileDao = profileDao;
        this.profile = profile;
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


    @Authenticator
    @Transactional
    public Result updateProfile() {

        final User user = (User) ctx().args.get("user");

        final JsonNode json = request().body().asJson();
        final Profile newProfile = Json.fromJson(json, Profile.class);
        newProfile.setUser(user);
        final Profile p = profileDao.update(newProfile);

        final JsonNode result = Json.toJson(p);

        return ok(result);


    }

    @Transactional
    @Authenticator
    public Result getCurrentProfile() {

        final User user = (User) ctx().args.get("user");

        if(null == user.getAccessToken()){
            return unauthorized("Account not verified");
        }

        final String username = user.getName();

        LOGGER.debug("username :{}",username);

        final Profile currentProfile = profileDao.searchByUserName(username);

        final JsonNode result = Json.toJson(currentProfile);

        return ok(result);

    }

}
