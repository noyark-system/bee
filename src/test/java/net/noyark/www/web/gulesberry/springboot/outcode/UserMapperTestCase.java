package net.noyark.www.web.gulesberry.springboot.outcode;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {

    @Autowired
    UserMapper mapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("ccc");
        user.setPassword("123");
        user.setSalt("3333");
        user.setNickname("nickname123");
        user.setAddress("luluRoad");
        user.setAvatar("/aa/ab");
        user.setEmail("email123");
        user.setGender(0);
        user.setBirthday(new Date());
        user.setLevelId(0);
        user.setIsDelete(0);
        user.setIsAdmin(0);
        Integer rows = mapper.insertUser(user);
        System.out.println(rows);
    }

    @Test
    public void findByUid(){
        Integer uid = 1;
        User user = mapper.findByUid(uid);
        System.out.println(user);
    }
}
