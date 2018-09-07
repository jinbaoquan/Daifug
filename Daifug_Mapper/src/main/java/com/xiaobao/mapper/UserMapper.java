package com.xiaobao.mapper;


import com.xiaobao.domian.User;

import java.util.List;

public interface UserMapper {


    /**
     * 新增用户
     * @param user
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/6 19:37
     */
    int insert(User user);

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/6 19:37
     */
    User selectById(String id);

    /**
     * 通过用户名查询用户 可用于登陆，也可用于查询个人信息
     * @param username
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/6 19:36
     */
    User selectByName(String username);

    /**
     * 查询所有用户
     * @param
     * @return
     * @author JIN BAO QUAN
     * @date 2018/9/6 19:35
     */
    List<User> selectAll();

}