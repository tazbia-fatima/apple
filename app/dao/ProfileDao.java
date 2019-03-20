package dao;

import models.Profile;

public interface ProfileDao extends CrudDao<Profile, Integer>{

    Profile searchByUserName(String username);

}