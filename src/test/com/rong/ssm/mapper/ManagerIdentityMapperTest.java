package com.rong.ssm.mapper;

import com.rong.ssm.pojo.ManagerIdentity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rong on 2017/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext-mapper.xml")
public class ManagerIdentityMapperTest {

    @Autowired
    private ManagerIdentityMapper managerIdentityMapper;
    @Test
    public void test(){
      List<ManagerIdentity> managerIdentities= managerIdentityMapper.seleManagerIdentityById(11);
      return;
    }
}