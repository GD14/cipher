package com.rong.ssm.util;

import com.rong.ssm.vo.QueryMessageVo;
import com.rong.ssm.vo.SignInForm;
import org.junit.Test;

/**
 * Created by rong on 2017/9/25.
 */
public class DataProcessToolTest {

    @Test
    public  void TestEn() throws Exception{
        SignInForm signInForm = new SignInForm();
        DataProcessTool dataEncTool= new DataProcessTool();
        signInForm.setPhone("15527185212");
        dataEncTool.Process(signInForm);

        QueryMessageVo queryMessageVo=new QueryMessageVo();
        queryMessageVo.setSendNbr("15527185212");
        dataEncTool.Process(queryMessageVo,DataProcessTool.DATA_ENCRYPT);


    }
}