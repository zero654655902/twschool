package com.service;

import com.core.Report.Report;
import com.core.Report.ReportBuilder;
import com.core.Student;
import com.core.StudentScore;
import com.repository.ReportBuilderRepository;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwan on 12/08/2017.
 */
@Service
public class DBService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ReportBuilderRepository reportBuilderRepository;

    public Student addStudentMessage(Student student) {
        studentRepository.save(student);
        return student;
    }

    public List<Student> reportAllStudentMessage() {
        List<Student> allStudents = studentRepository.findAll();
        return allStudents;

    }

    public Student getStudentById(String id) {
        Student student = studentRepository.findById(id);
        return student;
    }

    public ReportBuilder addStudentScore(StudentScore studentScore) {
        List<Student> studentList = studentRepository.findAll();
        ReportBuilder reportBuilder = new ReportBuilder(studentList, studentScore);
        reportBuilderRepository.save(reportBuilder);
        return reportBuilder;
    }

    public Report reportAllStudentScore() {

        List<ReportBuilder> reportBuilderList = reportBuilderRepository.findAll();
        Report report1 = new Report(reportBuilderList);
        return report1;
    }

    public Report updateStudentScore(StudentScore studentScore) {
        List<Student> studentList = studentRepository.findAll();
        ReportBuilder reportBuilder = new ReportBuilder(studentList, studentScore);
        List<ReportBuilder> reportBuilderList = reportBuilderRepository.findAll();

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
        return new Report(reportBuilderList);

    }


}
