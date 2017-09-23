package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Manager;
import com.rong.ssm.vo.SignInForm;

/**
 * Created by GD14 on 2017/9/8.
 */
public interface ManagerMapper {
    public Manager selectByPhone(String ManagerNbr);
}
