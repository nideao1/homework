package com.example.homework.bean;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 作业实体类
 */
public class Homework {
    /**
     * 作业ID
     */
    private int hid;
    /**
     * 老师ID
     */
    private int tid;
    /**
     * 作业标题
     */
    private String htitle;
    /**
     * 作业内容
     */
    private String hcontent;
    /**
     * 作业开始时间
     */
    private Long start_time;
    /**
     * 作业结束时间
     */
    private Long end_time;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle;
    }

    public String getHcontent() {
        return hcontent;
    }

    public void setHcontent(String hcontent) {
        this.hcontent = hcontent;
    }

    public Long getStartTime() {
        return start_time;
    }

    public void setStartTime(Long startTime) {
        this.start_time = startTime;
    }

    public Long getEndTime() {
        return end_time;
    }

    public void setEndTime(Long endTime) {
        this.end_time = endTime;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
