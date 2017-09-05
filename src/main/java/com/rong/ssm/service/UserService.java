package com.rong.ssm.service;

import com.rong.ssm.dto.UserSignInResult;
import com.rong.ssm.pojo.User;
import com.rong.ssm.vo.UserSignInForm;

/**
 * Created by wh on 2017/8/29.
 */

public interface UserService {
   public UserSignInResult signIn(UserSignInForm userSignInForm)throws  Exception;
}
