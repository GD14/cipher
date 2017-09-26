package com.rong.ssm.util.cpabe;

import com.rong.ssm.util.CipherFieldTool;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

/**
 * Created by rong on 2017/9/23.
 */
public class CpabeToolTest {

    static String student_attr = "objectClass:inetOrgPerson objectClass:organizationalPerson "
            + "sn:student2 cn:student2 uid:student2 userPassword:student2 "
            + "ou:idp o:computer mail:student2@sdu.edu.cn title:student";

    static String policy = "foo bar fim 2of3 baf 1of2";
    static String student_policy = "sn:student2 cn:student2 uid:student2 3of3";
    @Test
    public  void TestKeygen() throws Exception {


        System.out.println(new String(CipherFieldTool.getSeed()));
        /**
         * 测试 keygen
         */
        CpabeTool cpabeTool =new CpabeTool();
        byte[] prv_Bytes=cpabeTool.keygen(CipherFieldTool.getPub(),CipherFieldTool.getMsk(),student_attr);

        /**
         * 测试加密
         */
        Resource resource = (Resource) new ClassPathResource("cpabe/input");
        String inputfile=null;
        if (resource.isReadable()) {
            inputfile=resource.getURL().getPath();
        }
        cpabeTool.enc(CipherFieldTool.getPub(),student_policy,inputfile,CipherFieldTool.getEncFile());

        /**
         * 测试解密
         */

        byte[] ans=cpabeTool.dec(CipherFieldTool.getPub(),prv_Bytes,CipherFieldTool.getEncFile());
        System.out.println(new String(ans));

        /**
         *  aes 获取密钥
         */

    }

    @Test
    public void test2() throws Exception{

        String str="hello rong";
        byte[] a=AESCoder.encrypt("100".getBytes(),str.getBytes());

        byte[] b=AESCoder.decrypt("130".getBytes(),a);
        System.out.println(new String(b));
    }
}