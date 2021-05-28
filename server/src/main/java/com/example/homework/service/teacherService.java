package com.example.homework.service;

import com.example.homework.bean.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teacherService {
    @Autowired
    com.example.homework.mapper.teacherMapper teacherMapper;

    public int insertTeacher(Teacher teacher){
        return teacherMapper.insertTeacher(teacher);
    }

    public Teacher select(int tid){
        return teacherMapper.select(tid);
    }

}
