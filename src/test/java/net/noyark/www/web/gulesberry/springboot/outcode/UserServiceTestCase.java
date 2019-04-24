package net.noyark.www.web.gulesberry.springboot.outcode;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {

    @Autowired
    UserService userService;

    @Test
    public void signup() {
        User user = new User();
        user.setUsername("eee");
        user.setPassword("123");
        user.setNickname("nickname123");
        user.setAddress("luluRoad");
        user.setAvatar("/aa/ab");
        user.setEmail("email123");
        user.setGender(0);
        user.setBirthday(new Date());
        user.setLevelId(0);
        user.setIsAdmin(0);
        userService.signup(user);
    }

}
