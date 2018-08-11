package testpackage.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import testpackage.dao.type.User;
import testpackage.services.interfaces.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public User getUserById(int id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public User getUserByName(String name){
        return userService.getUserByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void inserUser(User user){
        userService.insertUser(user);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteUserById(int id){
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

}
