package com.rong.ssm.controller;

import com.rong.ssm.common.CommonResult;
import com.rong.ssm.common.CommonValue;
import com.rong.ssm.dto.UserSignInResult;
import com.rong.ssm.service.UserService;
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


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public CommonResult<UserSignInResult> signIn(UserSignInForm userSignInForm, HttpServletRequest request) {
//        logger.info("userSignInForm={}", userSignInForm);
        try {
            UserSignInResult userSignInResult = userService.signIn(userSignInForm);
            //判断登录成功则将用户名保存在session中
            if (userSignInResult.isSuccess()) {
                HttpSession userNameSession = request.getSession(true);
                userNameSession.setAttribute("userNameSession", userSignInResult.getUserName());
                userNameSession.setMaxInactiveInterval(CommonValue.USER_SESSION_TIMEOUT_MINUTE);
            }
            return new CommonResult<>(true, userSignInResult);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new CommonResult<>(false, e.getMessage());
        }
    }
    @ResponseBody
    @RequestMapping(value = "/signOut", method = RequestMethod.GET)
    public CommonResult signOut(HttpServletRequest request) {
        HttpSession userNameSession = request.getSession(true);
        userNameSession.removeAttribute("userNameSession");
        return new CommonResult(true);
    }
}
