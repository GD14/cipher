package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.CallMapper;
import com.rong.ssm.pojo.Call;
import com.rong.ssm.service.CallService;
import com.rong.ssm.util.DataProcessTool;
import com.rong.ssm.vo.QueryCallVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
@Service
public class CallServiceImpl implements CallService {
    @Autowired
    CallMapper callMapper;
    @Override
    public List<Call> listCallByPhone(QueryCallVo queryCallVo) throws Exception{
        DataProcessTool.Process(queryCallVo);
        List<Call> callList=callMapper.selectByCallingPhone(queryCallVo);
        List<Call> calledList=callMapper.selectByCalledPhone(queryCallVo);
        callList.addAll(calledList);
        for(Call call:callList){
            DataProcessTool.Process(call);
        }
        return callList;
    }

    public void setCalledNbr(Integer uid,String nbr){

    }
}
