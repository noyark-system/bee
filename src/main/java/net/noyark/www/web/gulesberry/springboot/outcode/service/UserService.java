package net.noyark.www.web.gulesberry.springboot.outcode.service;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.DuplicatedUsernameException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.InsertException;

public interface UserService {
    void signup(User user) throws DuplicatedUsernameException, InsertException;
}
