package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.UserMapper;
import com.rong.ssm.pojo.User;
import com.rong.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wh on 2017/8/31.
 */
public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserMapper userMapper;

    public User checkUser(User user) {
        return userMapper.findUserByName(user);
    }
}
