package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Message;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
public interface MessageMapper {
    public List<Message> selectByCallingId(int id);
}
