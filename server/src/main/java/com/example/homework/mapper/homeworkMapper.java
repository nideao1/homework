package com.example.homework.mapper;

import com.example.homework.bean.Homework;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhu
 * @version 1.0.0 2020-11-30
 * 对作业请求操作的功能
 */
@Repository
public interface homeworkMapper {

    List<Homework> homeworkList();

    List<Homework> ThomeworkList(int tid);

    /**
     * 修改作业
     * @param homework
     * @return
     */
    int updateHome(Homework homework);

    /**
     * 增加作业
     * @param homework
     * @return
     */
    int insertHomework(Homework homework);

    /**
     * 删除作业
     */
    int deleteHomework(int hid);

}
