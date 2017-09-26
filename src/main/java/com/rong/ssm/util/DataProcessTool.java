package com.rong.ssm.util;
import com.rong.ssm.dto.CustSignInResult;
import com.rong.ssm.pojo.Call;
import com.rong.ssm.pojo.Message;
import com.rong.ssm.util.cpabe.AESCoder;
import com.rong.ssm.vo.QueryCallVo;
import com.rong.ssm.vo.QueryMessageVo;
import com.rong.ssm.vo.SignInForm;
import org.springframework.util.xml.SimpleNamespaceContext;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * Created by rong on 2017/9/23.
 */
public class DataProcessTool {
    //private static String seed="IMTHESEED";
//    private static Map<String,Set<String>> map=null;
    public static Integer DATA_ENCRYPT=0;
    public static Integer DATA_DECRYPT=1;
    public static void Encrypt(QueryMessageVo o) throws  Exception{
        Set<String> fields=CipherFieldTool.getMap().get("message");
        Class c=Class.forName("com.rong.ssm.vo.QueryMessageVo");
        process(o,c,fields,DATA_ENCRYPT,CipherFieldTool.getSeed());
    }
    public static void Decrypt(Message message,byte[] seed)throws Exception{
        Set<String> fields=CipherFieldTool.getMap().get("message");
        Class c=Class.forName("com.rong.ssm.pojo.Message");
        if(seed==null)
            seed=CipherFieldTool.getSeed();
        process(message,c,fields,DATA_DECRYPT,seed);
    }
    public static void Encrypt(QueryCallVo o) throws  Exception{
        Set<String> fields=CipherFieldTool.getMap().get("call");
        Class c=Class.forName("com.rong.ssm.vo.QueryCallVo");
        process(o,c,fields,DATA_ENCRYPT,CipherFieldTool.getSeed());
    }
    public static void Decrypt(Call calls,byte[] seed)throws Exception{
        Set<String> fields=CipherFieldTool.getMap().get("call");
        Class c=Class.forName("com.rong.ssm.pojo.Call");
        if(seed==null)
            seed=CipherFieldTool.getSeed();
        process(calls,c,fields,DATA_DECRYPT,seed);
    }
    public static void Encrypt(SignInForm o) throws  Exception{
        o.setCust_nbr(o.getPhone());
        Set<String> fields=CipherFieldTool.getMap().get("customer");
        Class c= Class.forName("com.rong.ssm.vo.SignInForm");
        process(o,c,fields,DATA_ENCRYPT,CipherFieldTool.getSeed());
        o.setPhone(o.getCust_nbr());
    }
    public static void Decrypt(CustSignInResult o,byte[] seed) throws  Exception{
        Set<String> fields=CipherFieldTool.getMap().get("customer");
        Class c=Class.forName("com.rong.ssm.dto.CustSignInResult");
        if(seed==null)
            seed=CipherFieldTool.getSeed();
        process(o,c,fields,DATA_DECRYPT,seed);
    }
    private static void process(Object o, Class c, Set<String> fields, Integer type,byte[] seed)throws  Exception{
        for(String field:fields){
            Field f=c.getDeclaredField(field);
            f.setAccessible(true);
            String str=null;
            if(type==DATA_ENCRYPT&& (f.get(o)!=null))
                str=AESCoder.Ancrypt(seed,(String) f.get(o));
            else
            if(type==DATA_DECRYPT&&((f.get(o)!=null))) {
                str = AESCoder.Decrypt(seed, (String) f.get(o));
            }
            f.set(o,str);
            System.out.println(str);
        }
    }

}
