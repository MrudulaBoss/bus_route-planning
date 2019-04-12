package com.example.myapplication;

public class Conductor {
    private String empid;
    private String pass;
    private String rnum;

    public Conductor() {
    }

    public Conductor(String empid, String pass, String rnum) {
        this.empid = empid;
        this.pass = pass;
        this.rnum = rnum;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }
}
