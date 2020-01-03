package com.qhit.entity;

public class text_type {
    private int tid;//文章类型id
    private String tname;//文章类型name

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "text_type{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
