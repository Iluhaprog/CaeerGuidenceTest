package testpackage.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import testpackage.dao.type.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public User getUserById(int id);
    public User getUserByName(String name);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
    public List<User> getAll();

}
