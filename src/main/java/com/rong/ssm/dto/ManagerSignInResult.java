package com.rong.ssm.dto;


import com.rong.ssm.pojo.Manager;

import java.util.Date;

/**
 * Created by luter on 2017-9-23-0023.
 */
public class ManagerSignInResult {
    private  int managerId;
    private  String managerName;
    private  String managerPwd;
    private  String managerSex;
    private  String managerNbr;
    private Date registerTime;
    private  Date   updateTime;
    private  String type;
    private  int status;
    private  Date    activeTime;
    public ManagerSignInResult( Manager manager){

        this.managerId=manager.getManagerId();
        this.managerName=manager.getManagerName();
        this.managerNbr=manager.getManagerNbr();
        this.registerTime=manager.getRegisterTime();
        this.activeTime=manager.getActiveTime();
        this.managerSex=manager.getManagerSex();
        this.updateTime=manager.getUpdateTime();
    }
    @Override
    public String toString() {
        return "ManagerSignInResult{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", registerTime=" + registerTime +
                ", managerNbr='" + managerNbr + '\'' +
                ", managerSex='" + managerSex + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }

    public boolean isSuccess(){
        return (managerId!=0);
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerSex() {
        return managerSex;
    }

    public void setManagerSex(String managerSex) {
        this.managerSex = managerSex;
    }

    public String getManagerPwd() {
        return managerPwd;
    }

    public void setManagerPwd(String managerPwd) {
        this.managerPwd = managerPwd;
    }

    public String getManagerNbr() {
        return managerNbr;
    }

    public void setManagerNbr(String managerNbr) {
        this.managerNbr = managerNbr;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }
}
