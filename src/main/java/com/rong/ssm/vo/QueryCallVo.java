package com.rong.ssm.vo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/8.
 */
public class QueryCallVo {
    private String callingPhone;
    private String calledPhone;
    private Date startTime;
    private Date endTime;

    public String getCalledPhone() {
        return calledPhone;
    }

    public void setCalledPhone(String calledPhone) {
        this.calledPhone = calledPhone;
    }

    public String getCallingPhone() {
        return callingPhone;
    }

    public void setCallingPhone(String callingPhone) {
        this.callingPhone = callingPhone;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date starTime) {
        this.startTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
