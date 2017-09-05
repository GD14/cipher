package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/9/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext-mapper.xml")
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;
    @Test
    public void test(){
        Customer customer=customerMapper.selectByPhone("15527185212");
        System.out.println(customer);
    }
}