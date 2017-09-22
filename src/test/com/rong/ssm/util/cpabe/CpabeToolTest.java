package com.rong.ssm.util.cpabe;

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


        /**
         * 测试 keygen
         */
        CpabeTool cpabeTool =new CpabeTool();
        Resource resource = (Resource) new ClassPathResource("cpabe/pub_key");
        String pubfile=null;
        if (resource.isReadable()) {
            //每次都会打开一个新的流
            pubfile=resource.getURL().getPath();
        }
        resource = (Resource) new ClassPathResource("cpabe/master_key");
        String mskfile=null;
        if (resource.isReadable()) {
            //每次都会打开一个新的流
             mskfile=resource.getURL().getPath();
        }
        byte[] prv_Bytes=cpabeTool.keygen(pubfile,mskfile,student_attr);

        /**
         * 测试加密
         */
        resource = (Resource) new ClassPathResource("cpabe/input");
        String inputfile=null;
        if (resource.isReadable()) {
            //每次都会打开一个新的流
            inputfile=resource.getURL().getPath();
        }

        resource = (Resource) new ClassPathResource("cpabe/encfile");
        String encfile=null;
        if (resource.isReadable()) {
            //每次都会打开一个新的流
            encfile=resource.getURL().getPath();
        }
        cpabeTool.enc(pubfile,student_policy,inputfile,encfile);

        /**
         * 测试解密
         */

        byte[] ans=cpabeTool.dec(pubfile,prv_Bytes,encfile);
        System.out.println(new String(ans));
        return;
    }

}