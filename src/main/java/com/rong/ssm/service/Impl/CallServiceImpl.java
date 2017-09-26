package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.CallMapper;
import com.rong.ssm.mapper.ManagerIdentityMapper;
import com.rong.ssm.pojo.Call;
import com.rong.ssm.pojo.ManagerIdentity;
import com.rong.ssm.service.CallService;
import com.rong.ssm.util.CipherFieldTool;
import com.rong.ssm.util.DataProcessTool;
import com.rong.ssm.util.cpabe.CpabeTool;
import com.rong.ssm.vo.QueryCallVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GD14 on 2017/9/5.
 */
@Service
public class CallServiceImpl implements CallService {
    @Autowired
    CallMapper callMapper;
    @Autowired
    ManagerIdentityMapper managerIdentityMapper;
    @Override
    public List<Call> listCallByPhone(QueryCallVo queryCallVo) throws Exception{
        /**
         * 加密数据
         */
        DataProcessTool.Encrypt(queryCallVo);
        /**
         * 查询
         */
        List<Call> callList=callMapper.selectByCallingPhone(queryCallVo);
        List<Call> calledList=callMapper.selectByCalledPhone(queryCallVo);
        callList.addAll(calledList);

        /**
         * 解密数据
         */
        byte[] seed=null;
        if(queryCallVo.getType()!=null&&queryCallVo.getType().equals("manager")){
            CpabeTool cpabeTool =new CpabeTool();
            List<ManagerIdentity> managerIdentities=managerIdentityMapper.seleManagerIdentityById(queryCallVo.getId());
            String attr=CipherFieldTool.getAttribute(managerIdentities);
            byte[] prv_Bytes=cpabeTool.keygen(CipherFieldTool.getPub(),CipherFieldTool.getMsk(),attr);
            seed=cpabeTool.dec(CipherFieldTool.getPub(),prv_Bytes,CipherFieldTool.getEncFile());
            System.out.println(new String(seed));
        }
        for(Call call:callList){
            DataProcessTool.Decrypt(call,seed);
        }
        return callList;
    }

    public void setCalledNbr(Integer uid,String nbr){

    }
}
