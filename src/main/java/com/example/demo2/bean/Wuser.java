package com.example.demo2.bean;

public class Wuser {
    private int wid;
    private String wname;
    private String sex;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Wuser{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
