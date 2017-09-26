package com.rong.ssm.mapper;

import com.rong.ssm.pojo.ManagerIdentity;

import java.util.List;

/**
 * Created by rong on 2017/9/26.
 */
public interface ManagerIdentityMapper {
    public List<ManagerIdentity> seleManagerIdentityById(Integer id);
}
