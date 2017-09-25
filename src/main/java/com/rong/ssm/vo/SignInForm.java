package com.rong.ssm.vo;

/**
 * Created by GD14 on 2017/9/5.
 */
public class SignInForm {
    private String phone;
    private String passwd;
    private String cust_nbr;


    public String getCust_nbr() {
        return cust_nbr;
    }

    public void setCust_nbr(String cust_nbr) {
        this.cust_nbr = cust_nbr;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
