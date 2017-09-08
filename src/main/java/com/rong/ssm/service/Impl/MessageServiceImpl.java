package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.MessageMapper;
import com.rong.ssm.pojo.Message;
import com.rong.ssm.service.MessageService;
import com.rong.ssm.vo.QueryMessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Message> listMessageByPhone(QueryMessageVo queryMessageVo) {
        List<Message> messageList=messageMapper.selectByCallingPhone(queryMessageVo.getCallingPhone());
        List<Message> result=new ArrayList<>();
        for (Message message:messageList){
            if(message.getStartTime().after(queryMessageVo.getStartTime())
                    &&message.getStartTime().before(queryMessageVo.getEndTime())){
                result.add(message);
            }
        }
        return result;
    }
}
