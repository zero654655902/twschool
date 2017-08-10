package com.controller;

import com.core.Report.Report;
import com.core.Student;
import com.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lwan on 07/08/2017.
 */
@RestController
@CrossOrigin("*")
public class StudentScoreController {

    @Autowired
    private StudentScoreService studentScoreService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
//        System.out.println(student);
        return studentScoreService.addStudentMessage(student);
    }


//    @RequestMapping(value = "students", method = RequestMethod.GET)
//    public ResponseEntity<String> reportAllStudentsScore() {
//        return studentScoreService.reportAllStudentScore();
//    }

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public ResponseEntity<Report> reportAllStudentsScore(){
        return studentScoreService.reportAllStudentScore();
    }


    @RequestMapping(value = "/searchStudents",method = RequestMethod.GET)
    public ResponseEntity<Report> reportAllStudentsMessage(){
        return studentScoreService.reportAllStudentMassege();
    }

    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
    public ResponseEntity<Student> getOneStudentScore(@PathVariable String id)
    {
        return studentScoreService.getOneStudentScore(id);

    }

    @RequestMapping(value = "/students/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Report> modifyStudentScore(@RequestBody Student student,@PathVariable String id){
        return studentScoreService.modifyStudentScores(student,student.getId());

    }

}
