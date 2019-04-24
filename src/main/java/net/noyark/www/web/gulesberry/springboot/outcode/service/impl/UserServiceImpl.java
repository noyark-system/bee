package net.noyark.www.web.gulesberry.springboot.outcode.service.impl;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.mapper.UserMapper;
import net.noyark.www.web.gulesberry.springboot.outcode.service.UserService;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.DuplicatedUsernameException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.security.DigestException;
import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserMapper userMapper;

    @Override
    public void signup(User user) throws DuplicatedUsernameException, InsertException
    {
        User result = userMapper.findByUsername(user.getUsername());
        if(result!=null||result.getIsDelete()==0){
            throw new DuplicatedUsernameException("用户名已存在,请重新输入");
        }


        //密码加密
        String salt = UUID.randomUUID().toString();
        System.out.println(salt);
        System.out.println(salt);
        user.setSalt(salt);

        //执行加密
        String md5Password = getMd5Password(user.getPassword(),salt);
        System.out.println(md5Password);
        user.setPassword(md5Password);

        user.setCreatedUser(user.getUsername());
        user.setCreatedTime(new Date());
        user.setModifiedTime(new Date());
        user.setModifiedUser(user.getUsername());

        Integer row = userMapper.insertUser(user);

        if(row!=1){
            throw new InsertException("注册发生未知错误:数据库插入异常,请联系管理员");
        }
    }

    private String getMd5Password(String password,String salt)
    {
        String str = salt + password + salt;

        for (int i = 0;i < 5;i++)
        {
            str = DigestUtils.md5DigestAsHex(str.getBytes()).toString();
        }

        return str;
    }
}
