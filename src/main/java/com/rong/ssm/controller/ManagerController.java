package com.rong.ssm.controller;

import com.rong.ssm.common.CommonResult;
import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.service.ManagerService;
import com.rong.ssm.vo.SignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GD14 on 2017/9/8.
 */
@RequestMapping(value="/api/manager")
@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;
    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public CommonResult<CustSignInResult> signIn(SignInForm signInForm, HttpServletRequest request){
        try {
            managerService.signIn(signInForm);
            return new CommonResult<>("0");
        }catch (Exception e){
            return new CommonResult<>("1",e.getMessage());
        }
    }
}
