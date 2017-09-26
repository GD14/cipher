package com.rong.ssm.util;

import bswabe.BswabeMsk;
import bswabe.BswabePub;
import bswabe.SerializeUtils;
import com.rong.ssm.pojo.ManagerIdentity;
import com.rong.ssm.util.cpabe.Common;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * Created by rong on 2017/9/25.
 */
public class CipherFieldTool {

    public static Map<String,Set<String>> map=null;
    public static byte[] seed;
    public static BswabePub pub;
    public static BswabeMsk msk;
    public static String encFile;
    public static Map<String,Set<String>> getMap() throws Exception{
        if(map==null)
            map=getCipherField();
        return map;
    }
    public static String getEncFile() throws Exception{
        if(encFile==null)
        {
            Resource resource= new ClassPathResource("cpabe/encfile");
            if(resource.isReadable()){
                encFile=resource.getURL().getPath();
            }
        }
        return encFile;
    }
    public static BswabePub getPub() throws Exception{
        if(pub==null){
            Resource resource =new ClassPathResource("cpabe/pub_key");
            if (resource.isReadable()) {
                byte[]  pub_byte = Common.suckFile(resource.getURL().getPath());
                pub = SerializeUtils.unserializeBswabePub(pub_byte);
            }
        }
        return pub;
    }
    public static BswabeMsk getMsk() throws Exception{
        if(msk==null){
            Resource resource =new ClassPathResource("cpabe/master_key");
            if (resource.isReadable()) {
                byte[]  msk_byte = Common.suckFile(resource.getURL().getPath());
                msk= SerializeUtils.unserializeBswabeMsk(getPub(),msk_byte);
            }
        }
        return msk;
    }
    public static byte[] getSeed() throws Exception{
        if(seed==null){
            Resource resource =  new ClassPathResource("cpabe/input");
            String inputfile=null;
            if (resource.isReadable()) {
                //每次都会打开一个新的流
                seed= Common.suckFile(resource.getURL().getPath());
            }
        }
        return seed;
    }

    public static String getAttribute(List<ManagerIdentity> managerIdentities){
        String attr="";
        for (ManagerIdentity managerIdentity:managerIdentities) {
            attr=attr+" "+managerIdentity.getIdentityName()+":"+managerIdentity.getIdentityValue();
        }
        return attr.trim();
    }
    private static Map<String,Set<String>> getCipherField() throws Exception{
        Properties pps = new Properties();
        Resource resource =  new ClassPathResource("aes/encField.properties");
        Map<String,Set<String>> map=new HashMap<>();

           pps.load(new FileInputStream(resource.getURL().getPath()));
           Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
           while(enum1.hasMoreElements()) {
                 String strKey = (String) enum1.nextElement();
                 String[] tableAndFiels=strKey.split("\\.");
                 if(tableAndFiels.length!=2)
                     throw new Exception();
                 String  table=tableAndFiels[0];
                 String  field=tableAndFiels[1];
                 String strValue = pps.getProperty(strKey);
                 if(map.get(table)==null){
                     map.put(table,new HashSet<>());
                 }
                 if(strValue.equals("1"))
                     map.get(table).add(field);
                 System.out.println(strKey + "=" + strValue);
               }
        return map;
    }
}
