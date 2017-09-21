package com.rong.ssm.service;

import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.pojo.Message;
import com.rong.ssm.vo.QueryMessageVo;
import com.rong.ssm.vo.SignInForm;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
public interface MessageService {
    public List<Message> listMessageByPhone(QueryMessageVo queryMessageVo);
}
