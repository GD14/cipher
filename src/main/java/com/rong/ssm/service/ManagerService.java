package com.rong.ssm.service;

import com.rong.ssm.dto.ManagerSignInResult;
import com.rong.ssm.vo.SignInForm;

/**
 * Created by GD14 on 2017/9/8.
 */
public interface ManagerService {
    public ManagerSignInResult signIn(SignInForm signInForm)throws  Exception;
}
