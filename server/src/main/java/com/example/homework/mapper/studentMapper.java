package com.example.homework.mapper;

import com.example.homework.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 对学生请求操作的功能
 */
@Repository
public interface studentMapper {
    Student Sel(int sid);

    List<Student> studentList();

    int insertStudent(Student student);

}
