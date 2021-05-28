package com.example.homework.controller;

import com.example.homework.bean.Student;
import com.example.homework.dto.ResultDto;
import com.example.homework.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class studentController {

    @Autowired
    private studentService studentService;
    @RequestMapping("/getStudent/{sid}")
    public String GetStudent(@PathVariable int sid){
        return studentService.Sel(sid).toString();
    }

//  学生登录
    @RequestMapping("/login")
    public String checkStudentLogin(@RequestParam(value = "sid") int sid,
                                    @RequestParam(value = "sPassword") String sPassword){
        Student student=studentService.Sel(sid);
        ResultDto resultDto = new ResultDto();
        if(student==null){
            resultDto.setMsg("登录失败");
            return "Login fail";
        }
        if(sPassword.equals(student.getsPassword())){
            resultDto.setMsg("登录成功");
            return student.getsName();
        }else {
            resultDto.setMsg("登录失败");
            return "Login fail";
        }
    }

//  登录成功返回学生数据
    @RequestMapping("/getStudentList")
    public List<Student> GetStudentList(){
        return studentService.studentList();
    }

//  学生注册
    @RequestMapping("/insertStudent")
    public String insertStudent(@RequestParam(value = "sid") int sid,
                                @RequestParam(value = "sName") String sName,
                              @RequestParam(value = "sPassword") String sPassword){
        Student student=new Student();
        student.setSid(sid);
        student.setsName(sName);
        student.setsPassword(sPassword);
        ResultDto resultDto = new ResultDto();
        if(studentService.insertStudent(student)==1){
            resultDto.setMsg("学生注册成功");
            return "Successful insert";
        }
        else {
            resultDto.setMsg("学生注册失败");
            return "Fail insert";
        }
    }

}
