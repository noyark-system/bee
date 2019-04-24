package net.noyark.www.web.gulesberry.springboot.outcode.mapper;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

public interface UserMapper
{
    Integer insertUser(User user);

    User findByUid(Integer uid);
}
