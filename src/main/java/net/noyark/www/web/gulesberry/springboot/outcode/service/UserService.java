package net.noyark.www.web.gulesberry.springboot.outcode.service;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.DuplicatedUsernameException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.InsertException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.PasswordNotCorrectException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.UserNotFoundException;

public interface UserService {
    void signUp(User user) throws DuplicatedUsernameException, InsertException;

    User signIn(String username, String password) throws UserNotFoundException, PasswordNotCorrectException;
}
