package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.MessageMapper;
import com.rong.ssm.pojo.Message;
import com.rong.ssm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    MessageMapper messageMapper;
    @Override
    public List<Message> listMessageByUid(Integer uid){
     List<Message> messageList=messageMapper.selectByCallingId(uid);
     return messageList;
    }

    @Override
    public List<Message> listMessageByPhone(String phone) {
        List<Message> messageList=messageMapper.selectByCallingPhone(phone);
        return messageList;
    }
}
