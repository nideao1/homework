package com.example.homework.bean;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 学生作业实体类
 */
public class studentHomework {
    /**
     * 序号ID
     */
    private int id;
    /**
     * 学生ID
     */
    private int sid;
    /**
     * 作业ID
     */
    private int hid;
    /**
     * 作业内容
     */
    private String homework_content;
    /**
     * 提交时间
     */
    private Long create_time;
    /**
     * 修改时间
     */
    private Long update_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return sid;
    }

    public void setStudentId(int studentId) {
        this.sid = studentId;
    }

    public int getHomeworkId() {
        return hid;
    }

    public void setHomeworkId(int homeworkId) {
        this.hid = homeworkId;
    }

    public String getHomeworkContent() {
        return homework_content;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homework_content = homeworkContent;
    }

    public Long getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Long createTime) {
        this.create_time = createTime;
    }

    public Long getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Long updateTime) {
        this.update_time = updateTime;
    }

    public String toString(){
        return super.toString();
    }
}
