package com.gavin.model;

/**
 * Created by Administrator on 2017/6/12.
 */
public class User {

    private String loginid;
    private String password;
    private String username;
    private int usertype;

    public String getLoginid() {
        return loginid;
    }
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }
    public String getPassword() {return password;}
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {return username;}
    public void setUserName(String username) {
        this.username = username;
    }
    public int getUserType() { return usertype; }
    public void setUserType(int usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginid='" + loginid + '\'' +
                "password='" + password + '\'' +
                "username='" + username + '\'' +
                "usertype='" + usertype + '\'' +
                '}';
    }
}
