package com.controller;

import com.core.Report;
import com.core.Student;
import com.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lwan on 07/08/2017.
 */
@RestController
public class StudentScoreController {

@Autowired
    private StudentScoreService studentScoreService;
@RequestMapping(value = "/students",method = RequestMethod.POST)
    public List<Student> addStudent(@RequestBody Student student){
    return studentScoreService.addStudentMessage(student);
}

}
