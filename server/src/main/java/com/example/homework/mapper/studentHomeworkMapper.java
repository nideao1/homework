package com.example.homework.mapper;

import com.example.homework.bean.studentHomework;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 对学生作业请求操作的功能
 */
@Repository
public interface studentHomeworkMapper {

    //  学生提交作业情况
    List<studentHomework> DetailHomeworkList(int hid);

    List<studentHomework> myHomeworkList(int sid);

    int updateHomework(int id, String homework_content, Long update_time);

    int addStudentHomework(studentHomework studentHomework);


}
