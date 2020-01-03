package com.qhit.entity;

public class appraise {
    private int pid;//评价id
    private String pname;//评价内容
    private int paid;//评价文章

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "appraise{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", paid=" + paid +
                '}';
    }
}
