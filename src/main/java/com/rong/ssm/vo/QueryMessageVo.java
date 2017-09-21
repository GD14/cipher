package com.rong.ssm.vo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class QueryMessageVo {
    private String sendNbr;
    private String receiveNbr;
    private Date startTime;
    private Date endTime;

    public String getReceiveNbr() {
        return receiveNbr;
    }

    public void setReceiveNbr(String receiveNbr) {
        this.receiveNbr = receiveNbr;
    }

    public String getSendNbr() {
        return sendNbr;
    }

    public void setSendNbr(String sendNbr) {
        this.sendNbr = sendNbr;
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
