package com.example.carinfo;

public class car {
    String cname,oname,no,cimg;

    public car() {
    }

    public car(String cname,String oname,String no,String cimg) {
        this.cname = cname;
        this.oname=oname;
        this.no=no;
        this.cimg=cimg;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    @Override
    public String toString() {
        return "car{" +
                "cname='" + cname + '\'' +
                ", oname='" + oname + '\'' +
                ", no='" + no + '\'' +
                ", cimg='" + cimg + '\'' +
                '}';
    }
}
