package com.rong.ssm.mapper;

import com.rong.ssm.pojo.User;

/**
 * Created by wh on 2017/8/29.
 */
public interface UserMapper {

   public User findUserById(int id);
   public User findUserByName(User user);
   public User selectByUserName(String userName);
}
