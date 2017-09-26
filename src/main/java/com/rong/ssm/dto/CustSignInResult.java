package com.rong.ssm.dto;

import com.rong.ssm.pojo.Customer;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class CustSignInResult {
    private Integer custId;
    private String custName;
    private Date regTime;
    private String custNbr;
    private Date loginTime;
    private String custSex;
    private Date updateTime;

    public CustSignInResult(Customer customer){

        this.custId=customer.getCustId();
        this.custName=customer.getCustName();
        this.custNbr=customer.getCustNbr();
        this.regTime=customer.getRegisterTime();
        this.loginTime=customer.getLoginTime();
        this.custSex=customer.getCustSex();
        this.updateTime=customer.getUpdateTime();
    }
    @Override
    public String toString() {
        return "CustSignInResult{" +
                "cust_id=" + custId +
                ", cust_name='" + custName + '\'' +
                ", reg_time=" + regTime +
                ", cust_nbr='" + custNbr + '\'' +
                ", login_time=" + loginTime +
                '}';
    }

    public boolean isSuccess(){
        return (custId!=null);
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getCustSex() {
        return custSex;
    }

    public void setCustSex(String custSex) {
        this.custSex = custSex;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
