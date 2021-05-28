package com.example.homework.bean;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 学生实体类
 */
public class Student {
    /**
     * 学生ID
     */
    private int sid;
    /**
     * 学生姓名
     */
    private String sName;
    /**
     * 学生密码
     */
    private String sPassword;

    public int getSid(){
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
