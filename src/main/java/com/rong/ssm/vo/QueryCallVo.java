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
    private Integer id;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCalledNbr() {
        return calledNbr;
    }

    public void setCalledNbr(String calledNbr) {
        this.calledNbr = calledNbr;
    }

    public String getCallingNbr() {
        return callingNbr;
    }

    public void setCallingNbr(String callingNbr) {
        this.callingNbr = callingNbr;
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
