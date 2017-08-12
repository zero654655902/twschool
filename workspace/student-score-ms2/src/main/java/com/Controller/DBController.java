package com.Controller;

import com.core.Report.Report;
import com.core.Report.ReportBuilder;
import com.core.Student;
import com.core.StudentScore;
import com.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lwan on 12/08/2017.
 */
@RestController
@CrossOrigin("*")
@EntityScan("com.core")
@EnableJpaRepositories("com.repository")
public class DBController {
   @Autowired
    DBService dbService;
    @RequestMapping(value = "/db/students", method = RequestMethod.POST)
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(dbService.addStudentMessage(student), HttpStatus.OK);
    }

    @RequestMapping(value = "/db/students", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<List<Student>>(dbService.reportAllStudentMessage(),HttpStatus.OK);

    }

    @RequestMapping(value = "/db/students/{id}",method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentById(@PathVariable String id){
        return new ResponseEntity<Student>(dbService.getStudentById(id),HttpStatus.OK);
    }

    @RequestMapping(value = "/db/scores",method = RequestMethod.POST)
    public ResponseEntity<ReportBuilder> addStudentScore(@RequestBody StudentScore studentScore)
    {
       return new ResponseEntity<ReportBuilder>(dbService.addStudentScore(studentScore),HttpStatus.OK);
    }

    @RequestMapping(value = "/db/scores",method = RequestMethod.GET)
    public ResponseEntity<Report> getAllStudentScore(){
        return new ResponseEntity<Report>(dbService.reportAllStudentScore(),HttpStatus.OK);
    }

    @RequestMapping(value = "/db/scores",method = RequestMethod.PUT)
    public ResponseEntity<Report> updateStudentSore(@RequestBody StudentScore studentScore){
        return new ResponseEntity<Report>(dbService.updateStudentScore(studentScore ),HttpStatus.OK);
    }

}
