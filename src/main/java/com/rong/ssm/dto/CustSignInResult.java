package com.rong.ssm.dto;

import com.rong.ssm.pojo.Customer;

import java.util.Date;

/**
 * Created by GD14 on 2017/9/5.
 */
public class CustSignInResult {
    private Integer cust_id;
    private String cust_name;
    private Date reg_time;
    private String cust_nbr;
    private Date login_time;
    private String cust_sex;
    private Date updateTime;

    public CustSignInResult(Customer customer){

        this.cust_id=customer.getCustId();
        this.cust_name=customer.getCustName();
        this.cust_nbr=customer.getCustNbr();
        this.reg_time=customer.getRegisterTime();
        this.login_time=customer.getLoginTime();
        this.cust_sex=customer.getCustSex();
        this.updateTime=customer.getUpdateTime();
    }
    @Override
    public String toString() {
        return "CustSignInResult{" +
                "cust_id=" + cust_id +
                ", cust_name='" + cust_name + '\'' +
                ", reg_time=" + reg_time +
                ", cust_nbr='" + cust_nbr + '\'' +
                ", login_time=" + login_time +
                '}';
    }

    public boolean isSuccess(){
        return (cust_id!=null);
    }
    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public String getCust_nbr() {
        return cust_nbr;
    }

    public void setCust_nbr(String cust_nbr) {
        this.cust_nbr = cust_nbr;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_sex() {
        return cust_sex;
    }

    public void setCust_sex(String cust_sex) {
        this.cust_sex = cust_sex;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
