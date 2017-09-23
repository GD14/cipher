package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Manager;
import com.rong.ssm.vo.SignInForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/9/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext-mapper.xml")
public class ManagerMapperTest {

    @Autowired
    private ManagerMapper managerMapper;


    @Test
    public  void testSelectByPhone(){
        SignInForm signInForm=new SignInForm();
        signInForm.setPhone("15527185222");
        signInForm.setPasswd("123123");

       Manager manager= managerMapper.selectByPhone(null);
        System.out.println(manager);
    }
}