package com.rong.ssm.controller.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GD14 on 2017/8/27.
 */
public class CustomDateConverter implements Converter<String,Date> {


    public Date convert(String s) {

        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1= simpleDateFormat.parse(s);
            java.sql.Date dbData= new java.sql.Date(date1.getTime());
            return dbData;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
