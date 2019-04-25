package net.noyark.www.web.gulesberry.springboot.outcode.controller;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.service.UserService;
import net.noyark.www.web.gulesberry.springboot.outcode.util.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
@RequestMapping("user")
public class UserController extends BaseController
{
    @Autowired
    UserService userService;

    @RequestMapping("reg")
    public ResponseResult<Void> reg(User user)
    {
        /*
         * 执行注册
         * 如果userService.reg()抛出异常,则userService.reg()方法会从抛出异常处终止,
         * public ResponseResult<Void> reg(User user) 方法也会就此终止,
         * 且异常会被(从BaseController中继承的)handleException()捕获
         * 所以,这里的return new ResponseResult<>(SUCCESS) 不会执行
         */
        userService.signUp(user);
        return new ResponseResult<>(SUCCESS);
    }

    @RequestMapping("login")
    public ResponseResult<Void> login(@Param("username") String username, @Param("password") String password, HttpSession session){
        User user = userService.signIn(username,password);
        session.setAttribute("uid",user.getUid());
        session.setAttribute("username",user.getUsername());
        return new ResponseResult<>(SUCCESS);
    }
}
