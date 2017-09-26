package com.rong.ssm.service.Impl;

import com.rong.ssm.dto.MessageListResult;
import com.rong.ssm.mapper.MessageMapper;
import com.rong.ssm.pojo.Message;
import com.rong.ssm.service.MessageService;
import com.rong.ssm.util.DataProcessTool;
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
    public List<Message> listMessageBySendNbr(QueryMessageVo queryMessageVo) throws Exception {
        DataProcessTool.Process(queryMessageVo);
        List<Message> messageList = messageMapper.selectBySendNbr(queryMessageVo);
        List<Message> receiveList = messageMapper.selectByReceiveNbr(queryMessageVo);
        messageList.addAll(receiveList);
        for(Message message :messageList){
            DataProcessTool.Process(message);
        }
        return messageList;

    }
}
