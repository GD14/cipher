package com.rong.ssm.service;

import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.vo.SignInForm;

/**
 * Created by GD14 on 2017/9/8.
 */
public interface ManagerService {
    public CustSignInResult signIn(SignInForm signInForm)throws  Exception;
}
