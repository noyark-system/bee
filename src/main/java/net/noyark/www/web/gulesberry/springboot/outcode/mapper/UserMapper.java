package net.noyark.www.web.gulesberry.springboot.outcode.mapper;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;


public interface UserMapper
{
    Integer insertUser(User user);

    User findByUid(Integer uid);
}
