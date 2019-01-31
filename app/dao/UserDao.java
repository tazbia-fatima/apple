package dao;

import models.User;

import java.util.Collection;

public interface UserDao extends CrudDao<User, String>{
    Collection<User> createUsers(Collection<User> userList);

}