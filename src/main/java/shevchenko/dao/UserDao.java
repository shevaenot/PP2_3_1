package shevchenko.dao;

import shevchenko.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User getUserId(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}
