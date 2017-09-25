package com.rong.ssm.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.util.*;

/**
 * Created by rong on 2017/9/25.
 */
public class CipherFieldTool {

    public static Map<String,Set<String>> getCipherField() throws Exception{
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
