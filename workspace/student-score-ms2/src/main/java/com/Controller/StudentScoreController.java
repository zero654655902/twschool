package com.Controller;

import com.core.Kclass;
import com.core.Student;
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
}
