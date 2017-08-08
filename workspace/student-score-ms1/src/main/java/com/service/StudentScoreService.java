package com.service;

import com.core.Kclass;
import com.core.Report;
import com.core.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwan on 27/07/2017.
 */
@Service

public class StudentScoreService {
    //
    private static Kclass kclass = new Kclass();
    private Report report = new Report();


//   public StudentScoreService(Kclass kclass, Report report) {
//       this.kclass = kclass;
//       this.report = report;
//   }
//   public Kclass getkclass(){
//       return this.kclass;
//   }
//   public Report getReport(){
//       return this.report;
//   }

    public ResponseEntity<Student> addStudentMessage(Student student) {
        kclass.addStudentMessage(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    public String reportStudentScore(String[] ids) {
        List<Student> students = kclass.getStudentById(ids);
        int totalScore = kclass.getStudentTotalScore(students);
        int average = kclass.getCalculateMiddleScore(students);
        return report.getScoreMassege(students, average, totalScore);
    }

    public ResponseEntity<String> reportAllStudentScore(){
        List<Student>students=kclass.getTotalStudent();
        int totalScore = kclass.getStudentTotalScore(students);
        int average = kclass.getCalculateMiddleScore(students);
        return new ResponseEntity<String>(report.getScoreMassege(students, average, totalScore),HttpStatus.OK);
    }

}
