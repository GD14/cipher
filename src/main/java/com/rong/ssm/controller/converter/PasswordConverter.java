package com.rong.ssm.controller.converter;

import com.rong.ssm.util.MD5Tools;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;

/**
 * Created by wh on 2017/8/31.
 */
public class PasswordConverter implements Converter<String,String> {
    public String convert(String pwd) {
        String password=null;
        try {
          password=MD5Tools.MD5(pwd);
         }catch (Exception e) {
             e.printStackTrace();
         }
         return password;
    }
}
