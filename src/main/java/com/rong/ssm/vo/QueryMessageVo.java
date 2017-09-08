package com.rong.ssm.vo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class QueryMessageVo {
    private String callingPhone;
    private Date starTime;
    private Date endTime;

    public String getCallingPhone() {
        return callingPhone;
    }

    public void setCallingPhone(String callingPhone) {
        this.callingPhone = callingPhone;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
