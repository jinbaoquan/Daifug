package com.xiaobao.provider.user;

import com.xiaobao.domian.User;
import com.xiaobao.mapper.UserMapper;
import com.xiaobao.result.R;
import com.xiaobao.service.UserService;
import com.xiaobao.uitls.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/7 9:49
 */
@Service
public class UserServiceProvider implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public R save(User user) {
        System.err.println("provider---1111"+user.getUsername());
        return ResultUtil.createResult(userMapper.insert(user));
    }
}
