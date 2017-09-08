package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Call;
import com.rong.ssm.pojo.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/9/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext-mapper.xml")
public class CallMapperTest {
    @Autowired
    private CallMapper callMapper;
    @Test
    public  void getMessageByPhone(){
        List<Call> callList=callMapper.selectByCallingPhone("15527185211");
//            ....
//            业务处理
        System.out.println(callList);
    }
}