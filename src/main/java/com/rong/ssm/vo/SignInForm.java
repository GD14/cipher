package com.rong.ssm.vo;

/**
 * Created by GD14 on 2017/9/5.
 */
public class SignInForm {
    private String phone;
    private String passwd;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
