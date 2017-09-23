package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Message;
import com.rong.ssm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/9/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext-mapper.xml")
public class MessageMapperTest {
    @Autowired
    private MessageMapper messageMapper;
    @Test
    public  void getMessageByPhone(){
        List<Message> messageList=messageMapper.selectByReceiveNbr(null);
//            ....
//            业务处理
        System.out.println(messageList);
    }
}