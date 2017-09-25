package com.rong.ssm.service.Impl;

import com.rong.ssm.dto.ManagerSignInResult;
import com.rong.ssm.exception.DataExistException;
import com.rong.ssm.exception.DataMatchException;
import com.rong.ssm.mapper.ManagerMapper;
import com.rong.ssm.pojo.Manager;
import com.rong.ssm.service.ManagerService;
import com.rong.ssm.vo.SignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by GD14 on 2017/9/8.
 */
@Service
public class ManagerServiceImpl  implements ManagerService{

    @Autowired
    private ManagerMapper managerMapper;

    public ManagerSignInResult signIn(SignInForm signInForm){
        Manager manager= managerMapper.selectByPhone(signInForm.getPhone());
        if (manager == null) {
            throw new DataExistException("用户不存在");
        }
        if (!manager.getManagerPwd().equals(signInForm.getPasswd())) {
            throw new DataMatchException("用户名或密码错误");
        } else {
            // PS 用户登录状态保存处理操作在Controller中
            //进行解密
            return new ManagerSignInResult(manager);
        }
    }
}
