package com.rong.ssm.pojo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class Message {
    private int id;
    private int callingId;
    private int calledId;
    private Date startTime;
    private Date endTime;
    private String location;
    private String context;
    private String calling;
    private String called;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCallingId() {
        return callingId;
    }

    public void setCallingId(int callingId) {
        this.callingId = callingId;
    }

    public int getCalledId() {
        return calledId;
    }

    public void setCalledId(int calledId) {
        this.calledId = calledId;
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

    public String getCalling() {
        return calling;
    }

    public void setCalling(String calling) {
        this.calling = calling;
    }

    public String getCalled() {
        return called;
    }

    public void setCalled(String called) {
        this.called = called;
    }
}
