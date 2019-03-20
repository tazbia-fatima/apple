package dao;


import models.Profile;
import play.Logger;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ProfileDaoImpl implements ProfileDao {

    private final static Logger.ALogger LOGGER = Logger.of(ProfileDaoImpl.class);

    final JPAApi jpaApi;


    @Inject
    public ProfileDaoImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    @Override
    public Profile create(Profile profile) {
        if (null == profile) {
            throw new IllegalArgumentException("Details must be provided");
        }

        jpaApi.em().persist(profile);
        return profile;
    }

    @Override
    public Optional<Profile> read(Integer Id) {
        return Optional.empty();
    }

    @Override
    public Profile searchByUserName(String username) {

        if(null == username){
            throw new IllegalArgumentException("Name must be provided");
        }

        String queryString = "SELECT p from Profile p where user_name = '" + username + "'";
        TypedQuery<Profile> query = jpaApi.em().createQuery(queryString, Profile.class);

        List<Profile> profile = query.getResultList();
        return profile.isEmpty() ? null : profile.get(0);
    }

    @Override
    public Profile update(Profile profile) {
        if(null == profile){
            throw new IllegalArgumentException("Details must be provided");
        }

        if(null == profile.getId()){
            throw new IllegalArgumentException("Id must be provided");
        }

        final Profile existingProfile = jpaApi.em().find(Profile.class, profile.getId());
        if(null == existingProfile) {
            return null;
        }
        existingProfile.setAge(profile.getAge());

        existingProfile.setHeight(profile.getHeight());
        existingProfile.setWeight(profile.getWeight());
        existingProfile.setGoalPlan(profile.getGoalPlan());

        jpaApi.em().persist(existingProfile);

        return existingProfile;
    }

    @Override
    public Profile delete(Integer Id) {
        return null;
    }

    @Override
    public Collection<Profile> all() {
        return null;
    }


}
