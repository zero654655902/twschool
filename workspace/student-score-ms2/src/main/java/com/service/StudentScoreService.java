package com.service;

import com.core.Kclass;
import com.core.Report.Report;
import com.core.Report.ReportBuilder;
import com.core.Student;
import com.core.StudentScore;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwan on 10/08/2017.
 */
@Service
public class StudentScoreService {
    private Kclass kclass = new Kclass();
    private Report report = new Report();

    public Student addStudentMessage(Student student) {
        kclass.addStudentMessage(student);
        return student;
    }

    public List<Student> reportAllStudentMessage() {
        List<Student> students = kclass.getTotalStudent();
        return students;

    }

    public ReportBuilder reportStudentScore(StudentScore studentScore) {
        List<Student> studentList = kclass.getTotalStudent();
        ReportBuilder reportBuilder = new ReportBuilder(studentList, studentScore);
        report.addReportBuilder(reportBuilder);
        return reportBuilder;
    }

    public Report reportAllStudentScore() {
        List<ReportBuilder> reportBuilderList = report.getReportBuilderList();
        Report report1 = new Report(reportBuilderList);
        return report1;
    }


    public Report updateStudentScore(StudentScore studentScore) {
        List<ReportBuilder> reportBuilderList = report.getReportBuilderList();
        List<Student> studentList = kclass.getTotalStudent();
        ReportBuilder reportBuilder = new ReportBuilder(studentList, studentScore);
        for (int i = 0; i < reportBuilderList.size(); ++i) {
            if (reportBuilder.getId().equals(reportBuilderList.get(i).getId())) {
                reportBuilderList.get(i).setMath(reportBuilder.getMath());
                reportBuilderList.get(i).setChinese(reportBuilder.getChinese());
                reportBuilderList.get(i).setEnglish(reportBuilder.getEnglish());
                reportBuilderList.get(i).setCoding(reportBuilder.getCoding());
                reportBuilderList.get(i).setTotolScore(reportBuilder.getTotalScore());
                reportBuilderList.get(i).setAverage(reportBuilder.getAverage());
            }
        }
        Report report1 = new Report(reportBuilderList);
        return report1;

    }

}
