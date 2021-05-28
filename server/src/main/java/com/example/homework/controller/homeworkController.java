package com.example.homework.controller;

import com.example.homework.bean.Homework;
import com.example.homework.dto.ResultDto;
import com.example.homework.service.homeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/homework")
@CrossOrigin
public class homeworkController {
    @Autowired
    homeworkService homeworkService;

//  获得作业列表
    @RequestMapping("/getHomeworkList")
    public List<Homework> GetHomeworkList(){
        return homeworkService.homeworkList();
    }

//  获得老师作业列表
    @RequestMapping("/getTHomeworkList")
    public List<Homework> GetTHomeworkList(@RequestParam(value = "tid") int tid){
        return homeworkService.ThomeworkList(tid);
    }

//  添加作业
    @RequestMapping("/addHomework")
    @ResponseBody
    public String addHomework(@RequestParam(value = "tid") int tid,
                                 @RequestParam(value = "htitle") String htitle,
                                 @RequestParam(value = "hcontent") String hcontent,
                                 @RequestParam(value = "start_time") Long start_time,
                                 @RequestParam(value = "end_time") Long end_time){
        Homework homework=new Homework();
        homework.setTid(tid);
        homework.setHtitle(htitle);
        homework.setHcontent(hcontent);
        homework.setStartTime(start_time);
        homework.setEndTime(end_time);

        System.out.println(homework.getStartTime());

        ResultDto resultDto = new ResultDto();
        if(homeworkService.insertHomework(homework)==1) {
            resultDto.setMsg("添加作业成功");
            return "Successful insert";

        }
        else {
            resultDto.setMsg("添加作业失败");
            return "Fail insert";
        }
    }

//  修改作业
    @RequestMapping("/updateHome")
    public String updateHome(@RequestParam(value = "hid") int hid,
                              @RequestParam(value = "htitle") String htitle,
                              @RequestParam(value = "hcontent") String hcontent,
                              @RequestParam(value = "start_time") Long start_time,
                              @RequestParam(value = "end_time") Long end_time){
        Homework homework=new Homework();
        homework.setHid(hid);
        homework.setHtitle(htitle);
        homework.setHcontent(hcontent);
        homework.setStartTime(start_time);
        homework.setEndTime(end_time);

        ResultDto resultDto = new ResultDto();
        if(homeworkService.updateHome(homework)==1){
            resultDto.setMsg("修改作业失败");
            return "Successful update";
        }
        else {
            resultDto.setMsg("修改作业失败");
            return "Fail update";
        }
    }

//  删除作业
    @RequestMapping("/deleteHomework")
    public String deleteHomework(@RequestParam(value="hid") int hid){
        ResultDto resultDto = new ResultDto();
        if(homeworkService.deleteHomework(hid)==1){
            resultDto.setMsg("删除作业失败");
            return "Successful delete";
        }else{
            resultDto.setMsg("删除作业失败");
            return "Fail delete";
        }
    }

}
