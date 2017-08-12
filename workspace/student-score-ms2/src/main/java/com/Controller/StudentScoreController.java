package com.Controller;

import com.core.Report.Report;
import com.core.Report.ReportBuilder;
import com.core.Student;
import com.core.StudentScore;
import com.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lwan on 10/08/2017.
 */
@RestController
@CrossOrigin("*")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(studentScoreService.addStudentMessage(student), HttpStatus.OK);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> reportAllStudentsScore() {
        return new ResponseEntity<List<Student>>(studentScoreService.reportAllStudentMessage(), HttpStatus.OK);
    }

    @RequestMapping(value = "/scores",method = RequestMethod.POST)
    public ResponseEntity<ReportBuilder> addStudentScore(@RequestBody StudentScore studentScore){
        return new ResponseEntity<ReportBuilder>(studentScoreService.reportStudentScore(studentScore),HttpStatus.OK);
    }

    @RequestMapping(value = "/scores",method = RequestMethod.GET)

        public ResponseEntity<Report> getAllStudentScore(){

            return new ResponseEntity<Report>(studentScoreService.reportAllStudentScore(),HttpStatus.OK);
    }

    @RequestMapping(value = "/scores",method = RequestMethod.PUT)
    public ResponseEntity<Report> updateStudentSore(@RequestBody StudentScore studentScore){
            return new ResponseEntity<Report>(studentScoreService.updateStudentScore(studentScore ),HttpStatus.OK);
    }
}
