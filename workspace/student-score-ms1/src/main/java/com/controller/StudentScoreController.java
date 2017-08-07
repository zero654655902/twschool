package com.controller;

import com.core.Report;
import com.core.Student;
import com.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lwan on 07/08/2017.
 */
@RestController
public class StudentScoreController {

    @Autowired
    private StudentScoreService studentScoreService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public List<Student> addStudent(@RequestBody Student student) {
        return studentScoreService.addStudentMessage(student);
    }

//@RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
//    public String ReportStudentScore(@PathVariable String id){
//        String[] ids={id};
//       return studentScoreService.reportStudentScore(ids);
//
//}

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public String reportAllStudentsScore() {
        return studentScoreService.reportAllStudentScore();
    }

}
