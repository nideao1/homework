package com.example.homework.bean;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 老师实体类
 */
public class Teacher {
    /**
     * 老师ID
     */
    private int tid;
    /**
     * 老师姓名
     */
    private String tName;
    /**
     * 老师密码
     */
    private String tPassword;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
