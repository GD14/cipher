package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Call;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
public interface CallMapper {
    public List<Call> selectByCallingPhone(String phone);
}
