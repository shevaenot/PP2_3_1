package shevchenko.service;

import shevchenko.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserId(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}
