package com.rong.ssm.mapper;

import com.rong.ssm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by wh on 2017/8/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext-mapper.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void getUserById() throws Exception{

        User user=userMapper.findUserById(1);
//            ....
//            业务处理
    }
}