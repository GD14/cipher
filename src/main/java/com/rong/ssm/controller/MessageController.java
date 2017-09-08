package com.rong.ssm.controller;

import com.rong.ssm.common.CommonResult;
import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.pojo.Message;
import com.rong.ssm.service.CustomerService;
import com.rong.ssm.service.MessageService;
import com.rong.ssm.vo.QueryMessageVo;
import com.rong.ssm.vo.SignInForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
@Controller
@RequestMapping(value = "/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public CommonResult<List<Message>> List(QueryMessageVo queryMessageVo, HttpServletRequest request){
        List<Message> messageList=messageService.listMessageByPhone(queryMessageVo.getCallingPhone());
        return new CommonResult<>("0",messageList);
    }

}
