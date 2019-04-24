package net.noyark.www.web.gulesberry.springboot.outcode.mapper;

import net.noyark.www.web.gulesberry.springboot.outcode.entity.User;

/**
 * 这是用户与数据交互的持久层接口，其映射为UserMapper.xml
 *
 * @author Kevin J.
 */

public interface UserMapper
{
    /**
     * 将用户信息插入数据库
     * @param user 用户实体，封装用户信息
     * @return 返回影响的行数
     */
    Integer insertUser(User user);

    /**
     * 通过uid获取用户的全部信息
     * @param uid 用户的id
     * @return 返回用户实体
     */
    User findByUid(Integer uid);
}
