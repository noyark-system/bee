package net.noyark.www.web.gulesberry.springboot.outcode.controller;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.service.UserService;
import net.noyark.www.web.gulesberry.springboot.outcode.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController
{
    @Autowired
    UserService userService;

    public ResponseResult<Void> signup(User user)
    {
        return new ResponseResult<Void>();
    }

}
