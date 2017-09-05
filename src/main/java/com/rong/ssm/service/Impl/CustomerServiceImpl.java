package com.rong.ssm.service.Impl;

import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.dto.UserSignInResult;
import com.rong.ssm.exception.DataExistException;
import com.rong.ssm.exception.DataMatchException;
import com.rong.ssm.mapper.CustomerMapper;
import com.rong.ssm.pojo.Customer;
import com.rong.ssm.service.CustomerService;
import com.rong.ssm.vo.SignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by GD14 on 2017/9/5.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public CustSignInResult signIn(SignInForm signInForm) throws Exception {
        Customer customer=customerMapper.selectByPhone(signInForm.getPhone());
        if (customer == null) {
            throw new DataExistException("用户不存在");
        }
        if (!customer.getCustPwd().equals(signInForm.getPasswd())) {
            throw new DataMatchException("用户名或密码错误");
        } else {
            // PS 用户登录状态保存处理操作在Controller中
            //进行解密
            return new CustSignInResult(customer );
        }
    }
}
