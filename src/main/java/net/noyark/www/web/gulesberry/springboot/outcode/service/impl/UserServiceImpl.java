package net.noyark.www.web.gulesberry.springboot.outcode.service.impl;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;
import net.noyark.www.web.gulesberry.springboot.outcode.mapper.UserMapper;
import net.noyark.www.web.gulesberry.springboot.outcode.service.UserService;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.DuplicatedUsernameException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.InsertException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.PasswordNotCorrectException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserMapper userMapper;

    @Override
    public void signUp(User user) throws DuplicatedUsernameException, InsertException {
        User result = userMapper.findByUsername(user.getUsername());
        if (result == null||result.getIsDelete()==1)
        {
            //密码加密
            String salt = UUID.randomUUID().toString();
            System.out.println(salt);
            System.out.println(salt);
            user.setSalt(salt);
            user.setIsDelete(0);
            //执行加密
            String md5Password = getMd5Password(user.getPassword(), salt);
            System.out.println(md5Password);
            user.setPassword(md5Password);

            user.setCreatedUser(user.getUsername());
            user.setCreatedTime(new Date());
            user.setModifiedTime(new Date());
            user.setModifiedUser(user.getUsername());

            Integer row = userMapper.insertUser(user);
            System.err.println(row);

            if (row != 1) {
                throw new InsertException("注册发生未知错误:数据库插入异常,请联系管理员");
            }
        } else {
            throw new DuplicatedUsernameException("用户名已存在,请重新输入");
        }

    }

    @Override
    public User signIn(String username, String password) throws UserNotFoundException, PasswordNotCorrectException {
        System.out.println("signIn");
        User result = userMapper.findByUsername(username);

        if(result==null||result.getIsDelete()==1){
            throw new UserNotFoundException("用户名或密码错误");
        }

        String resultSalt = result.getSalt();
        String md5 = getMd5Password(password,resultSalt);

        if(!result.getPassword().equals(md5)){
            throw new PasswordNotCorrectException("用户名或密码错误");
        }

        result.setIsDelete(null);
        result.setSalt(null);
        result.setPassword(null);

        return result;
    }


    //-------------------private method (for this class)-----------------

    private String getMd5Password(String password,String salt)
    {
        String str = salt + password + salt;

        for (int i = 0;i < 5;i++)
        {
            str = DigestUtils.md5DigestAsHex(str.getBytes());
        }

        return str;
    }



}
