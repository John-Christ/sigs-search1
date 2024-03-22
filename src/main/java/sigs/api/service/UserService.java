package sigs.api.service;

import sigs.api.dao.DAOUser;

import java.util.List;

public interface UserService {
    List<DAOUser> searchUsers(String query);

    DAOUser createUsers(DAOUser user);
}