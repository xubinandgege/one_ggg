package com.qhit.entity;

public class User {
    private int uid;//用户id
    private String uname;//用户名字

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upasswoed='" + upasswoed + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpasswoed() {
        return upasswoed;
    }

    public void setUpasswoed(String upasswoed) {
        this.upasswoed = upasswoed;
    }

    private String upasswoed;//用户密码
}
