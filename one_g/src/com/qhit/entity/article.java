package com.qhit.entity;

import java.util.Date;

public class article {
    private int aid;//文章id
    private int atid;//文章类型
    private String aname;//文章名字
    private String aarticle;//文章内容
    private Date atime;//文章时间
    private String aauther;//文章作者

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAarticle() {
        return aarticle;
    }

    public void setAarticle(String aarticle) {
        this.aarticle = aarticle;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public String getAauther() {
        return aauther;
    }

    public void setAauther(String aauther) {
        this.aauther = aauther;
    }

    public Date getAltertime() {
        return altertime;
    }

    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise;
    }

    private Date altertime;//文章更改时间
    private String appraise;//文章评价

    @Override
    public String toString() {
        return "article{" +
                "aid=" + aid +
                ", atid=" + atid +
                ", aname='" + aname + '\'' +
                ", aarticle='" + aarticle + '\'' +
                ", atime=" + atime +
                ", aauther='" + aauther + '\'' +
                ", altertime=" + altertime +
                ", appraise='" + appraise + '\'' +
                '}';
    }
}
