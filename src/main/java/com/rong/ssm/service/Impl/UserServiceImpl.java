package com.rong.ssm.service.Impl;

import com.rong.ssm.dto.UserSignInResult;
import com.rong.ssm.exception.DataExistException;
import com.rong.ssm.exception.DataMatchException;
import com.rong.ssm.mapper.UserMapper;
import com.rong.ssm.pojo.User;
import com.rong.ssm.service.UserService;
import com.rong.ssm.vo.UserSignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wh on 2017/8/29.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public UserSignInResult signIn(UserSignInForm userSignInForm) throws Exception {
        User user=userMapper.selectByUserName(userSignInForm.getUserName());
        if (user == null) {
            throw new DataExistException("用户不存在");
        }
        if (!user.getUserPass().equals(userSignInForm.getUserPass())) {
            throw new DataMatchException("用户名或密码错误");
        } else {
            // PS 用户登录状态保存处理操作在Controller中
            return new UserSignInResult(true, userSignInForm.getUserName());
        }
    }
}
