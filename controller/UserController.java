package controller;

import model.User;

public interface UserController {
    
    <T extends User> User createUser (T user);

}
