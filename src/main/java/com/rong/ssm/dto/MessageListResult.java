package com.rong.ssm.dto;

import com.rong.ssm.pojo.Message;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
public class MessageListResult {
    List<Message> messageList;


    public List<Message> getMessageList(){
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
