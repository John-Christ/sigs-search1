package sigs.api.service;


import org.springframework.stereotype.Service;
import sigs.api.dao.DAOUser;
import sigs.api.repository.DaoUser;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private DaoUser daoUser;

    public UserServiceImpl(DaoUser daoUser) {
        this.daoUser = daoUser;
    }

    @Override
    public List<DAOUser> searchUsers(String query) {
        List<DAOUser> users = daoUser.searchUsers(query);
        return users;
    }

    @Override
    public DAOUser createUsers(DAOUser user) {
        return daoUser.save(user);
    }
}
