package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.UserMapper;
import com.rong.ssm.pojo.User;
import com.rong.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wh on 2017/8/29.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserById(Integer id) throws Exception{

        User user=userMapper.findUserById(id);
//            ....
//            业务处理
        return user;
    }

}
