package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Customer;

/**
 * Created by GD14 on 2017/9/5.
 */
public interface CustomerMapper {
    public Customer selectByPhone(String custNbr);
}
