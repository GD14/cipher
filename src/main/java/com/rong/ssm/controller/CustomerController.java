package com.rong.ssm.controller;

import com.rong.ssm.common.CommonResult;
import com.rong.ssm.common.CommonValue;
import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.dto.UserSignInResult;
import com.rong.ssm.service.CustomerService;
import com.rong.ssm.service.UserService;
import com.rong.ssm.vo.SignInForm;
import com.rong.ssm.vo.UserSignInForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by GD14 on 2017/9/5.
 */
@Controller
@RequestMapping(value = "/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public CommonResult<CustSignInResult> signIn(SignInForm signInForm, HttpServletRequest request) {
//        logger.info("userSignInForm={}", userSignInForm);
        try {
            CustSignInResult custSignInResult = customerService.signIn(signInForm);
            //判断登录成功则将用户名保存在session中
            if (custSignInResult.isSuccess()) {
                HttpSession userNameSession = request.getSession(true);
                userNameSession.setAttribute("userNameSession", custSignInResult.getCust_name());
                userNameSession.setMaxInactiveInterval(CommonValue.USER_SESSION_TIMEOUT_MINUTE);
            }
            return new CommonResult<>("0", custSignInResult);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new CommonResult<>("0", e.getMessage());
        }
    }
    @ResponseBody
    @RequestMapping(value = "/signOut", method = RequestMethod.GET)
    public CommonResult signOut(HttpServletRequest request) {
        HttpSession userNameSession = request.getSession(true);
        userNameSession.removeAttribute("userNameSession");
        return new CommonResult("0");
    }
}
