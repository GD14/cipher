package com.rong.ssm.util;
import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.util.cpabe.AESCoder;
import com.rong.ssm.vo.QueryMessageVo;
import com.rong.ssm.vo.SignInForm;
import org.springframework.util.xml.SimpleNamespaceContext;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
/**
 * Created by rong on 2017/9/23.
 */
public class DataProcessTool {
    private static String seed="IMTHESEED";
    private static Map<String,Set<String>> map=null;
    public static Integer DATA_ENCRYPT=0;
    public static Integer DATA_DECRYPT=1;

    public static void Process(SignInForm o) throws  Exception{
        o.setCust_nbr(o.getPhone());
        Map<String,Set<String>> tableMap=getMap();
        Set<String> fields=null;
        Class c=null;
        c= Class.forName("com.rong.ssm.vo.SignInForm");
        fields=tableMap.get("customer");
        process(o,c,fields,DATA_ENCRYPT);
        o.setPhone(o.getCust_nbr());
    }

    public static void Process(CustSignInResult o) throws  Exception{
        Map<String,Set<String>> tableMap=getMap();
        Set<String> fields=null;
        Class c=null;
        c= Class.forName("com.rong.ssm.dto.CustSignInResult");
        fields=tableMap.get("customer");
        process(o,c,fields,DATA_DECRYPT);
    }
    public static void Process(QueryMessageVo o,Integer type) throws  Exception{
        Map<String,Set<String>> tableMap=getMap();
        Set<String> fields=null;
        Class c=null;
        c= Class.forName("com.rong.ssm.vo.QueryMessageVo");
        fields=tableMap.get("message");
       process(o,c,fields,type);
    }


    private static void process(Object o, Class c, Set<String> fields, Integer type)throws  Exception{
        /**
         * 如果o的字段type!=customer 那么进行cpabe校验
         */
        for(String field:fields){
            Field f=c.getDeclaredField(field);
            f.setAccessible(true);
            String str=null;
            if(type==DATA_ENCRYPT)
                str=AESCoder.Ancrypt(seed.getBytes(),(String) f.get(o));
            else
            if(type==DATA_DECRYPT) {
                str = AESCoder.Decrypt(seed.getBytes(), (String) f.get(o));
            }
            f.set(o,str);
            System.out.println(str);
        }
    }

    public static Map<String,Set<String>> getMap() throws Exception {
        if(map==null)
            map=CipherFieldTool.getCipherField();
        return map;
    }
}
