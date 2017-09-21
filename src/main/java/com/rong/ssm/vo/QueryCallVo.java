package com.rong.ssm.vo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/8.
 */
public class QueryCallVo {
    private String callingNbr;
    private String calledNbr;
    private Date startTime;
    private Date endTime;

    public String getCalledPhone() {
        return calledNbr;
    }

    public void setCalledPhone(String calledNbr) {
        this.calledNbr = calledNbr;
    }

    public String getCallingPhone() {
        return callingNbr;
    }

    public void setCallingPhone(String callingNbr) {
        this.callingNbr= callingNbr;
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
