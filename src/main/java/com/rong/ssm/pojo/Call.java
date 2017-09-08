package com.rong.ssm.pojo;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class Call {
    private int id;
    private int uid;
    private int calledId;
    private Date startTime;
    private Date endTime;
    private String location;
    private int contentId;
    private String calling;
    private String called;
    private String accessNbr;
    private int operListId;
    private int ticketId;
    private String calledMscAddr;
    private String callingMscAddr;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public int getContentId() {
        return contentId;
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

    public String getAccessNbr() {
        return accessNbr;
    }

    public void setAccessNbr(String accessNbr) {
        this.accessNbr = accessNbr;
    }

    public int getOperListId() {
        return operListId;
    }

    public void setOperListId(int operListId) {
        this.operListId = operListId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getCalledMscAddr() {
        return calledMscAddr;
    }

    public void setCalledMscAddr(String calledMscAddr) {
        this.calledMscAddr = calledMscAddr;
    }

    public String getCallingMscAddr() {
        return callingMscAddr;
    }

    public void setCallingMscAddr(String callingMscAddr) {
        this.callingMscAddr = callingMscAddr;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }
}
