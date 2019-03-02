package dao;


import models.Profile;
import play.Logger;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import java.util.Collection;
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
            throw new IllegalArgumentException("Intake must be provided");
        }

        jpaApi.em().persist(profile);
        return profile;
    }

    @Override
    public Optional<Profile> read(Integer Id) {
        return Optional.empty();
    }

    @Override
    public Profile update(Profile profile) {
        if(null == profile){
            throw new IllegalArgumentException("Food must be provided");
        }

        if(null == profile.getId()){
            throw new IllegalArgumentException("Food Id must be provided");
        }

        final Profile existingProfile = jpaApi.em().find(Profile.class, profile.getId());
        if(null == existingProfile) {
            return null;
        }
        existingProfile.setAge(profile.getAge());

        existingProfile.setHeight(profile.getHeight());
        existingProfile.setWeight(profile.getWeight());

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
