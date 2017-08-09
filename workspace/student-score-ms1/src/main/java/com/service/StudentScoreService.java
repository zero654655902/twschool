package com.service;

import com.core.Kclass;
import com.core.Report.Report;
import com.core.Report.ReportMessageItem;
import com.core.Report.ReportScoreItem;
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
//    private Report report = new Report();


    public ResponseEntity<Student> addStudentMessage(Student student) {
        kclass.addStudentMessage(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

//    public String reportStudentScore(String[] ids) {
//        List<Student> students = kclass.getStudentById(ids);
//        int totalScore = kclass.getStudentTotalScore(students);
//        int average = kclass.getCalculateMiddleScore(students);
//        return report.getScoreMassege(students, average, totalScore);
//    }

//    public ResponseEntity<String> reportAllStudentScore() {
//        List<Student> students = kclass.getTotalStudent();
//        int totalScore = kclass.getStudentTotalScore(students);
//        int average = kclass.getCalculateMiddleScore(students);
//        return new ResponseEntity<String>(report.getScoreMassege(students, average, totalScore), HttpStatus.OK);
//    }

//    public ResponseEntity<Report>reportAllStudentScore(){
//        List<Student> students = kclass.getTotalStudent();
//        int totalScore = kclass.getStudentTotalScore(students);
//        int average = kclass.getCalculateMiddleScore(students);
//        return new ResponseEntity<Report>(new Report(students,totalScore,average),HttpStatus.OK);
//    }

    public ResponseEntity<Report>reportAllStudentScore(){
        List<Student>students=kclass.getTotalStudent();
        Report report=new Report();
        List<ReportScoreItem> reportScoreItemList =report.buildReportItem(students);
        int totalScore=report.getStudentTotalScore(reportScoreItemList);
        int average=report.getCalculateMiddleScore(reportScoreItemList);
        return new ResponseEntity<Report>(new Report(reportScoreItemList,totalScore,average),HttpStatus.OK);
    }


    public ResponseEntity<Report>reportAllStudentMassege(){
        List<Student>students=kclass.getTotalStudent();
        Report report=new Report();
        List<ReportMessageItem> reportMessageItemList =report.buildReportStudentItem(students);
        return new ResponseEntity<Report>(new Report(reportMessageItemList),HttpStatus.OK);
    }

    public ResponseEntity<Report> modifyStudentMessage(Student student,String id) {
        List<Student>students=kclass.getTotalStudent();
        for(int i=0;i<students.size();++i)
        {
            Student stu=students.get(i);
            if(id.equals(students.get(i).getId())){
                students.get(i).setChinese(student.getCoding());
                students.get(i).setMath(student.getMath());
                students.get(i).setCoding(student.getCoding());
                students.get(i).setEnglish(student.getEnglish());
            }
        }
        Report report=new Report();
        List<ReportScoreItem> reportScoreItemList =report.buildReportItem(students);
        int totalScore=report.getStudentTotalScore(reportScoreItemList);
        int average=report.getCalculateMiddleScore(reportScoreItemList);
        return new ResponseEntity<Report>(new Report(reportScoreItemList,totalScore,average),HttpStatus.OK);
    }


}
