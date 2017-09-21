package com.rong.ssm.pojo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class Message {
    private int id;
    private int sendId;
    private int receiveId;
    private Date startTime;
    private Date endTime;
    private String location;
    private String context;
    private String sendNbr;
    private String receiveNbr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    public int getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    public String getSendNbr() {
        return sendNbr;
    }

    public void setSendNbr(String sendNbr) {
        this.sendNbr = sendNbr;
    }

    public String getReceiveNbr() {
        return receiveNbr;
    }

    public void setReceiveNbr(String receiveNbr) {
        this.receiveNbr = receiveNbr;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }


}
