package testpackage.services.interfaces;

import testpackage.dao.type.User;

import java.util.List;

public interface UserService {

    public User getUserById(int id);
    public User getUserByName(String name);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
    public List<User> getAll();

}
