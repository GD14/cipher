package com.rong.ssm.service;

import com.rong.ssm.pojo.Call;
import com.rong.ssm.vo.QueryCallVo;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
public interface CallService {
    public List<Call> listCallByPhone(QueryCallVo queryCallVo) throws Exception;
}
