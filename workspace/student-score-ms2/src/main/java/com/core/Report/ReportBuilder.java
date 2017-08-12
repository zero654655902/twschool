package com.core.Report;

import com.core.Kclass;
import com.core.Student;
import com.core.StudentScore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by lwan on 10/08/2017.
 */
@Entity
public class ReportBuilder {
    @Id
    private String name;
    private String id;
    private int math;
    private int chinese;
    private int english;
    private int coding;
    private int totalScore;
    private int average;


    public ReportBuilder() {
    }


        public ReportBuilder(List<Student>studentList, StudentScore studentScore) {
        Student student = findStudentById(studentList, studentScore);
        this.id = student.getId();
        this.name = student.getName();
        this.math = studentScore.getMath();
        this.chinese = studentScore.getChinese();
        this.english = studentScore.getEnglish();
        this.coding = studentScore.getCoding();
        this.totalScore = getTotalScore(studentScore);
        this.average = getTotalScore(studentScore) / 4;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public void setTotolScore(int totolScore) {
        this.totalScore = totolScore;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMath() {
        return math;
    }

    public int getChinese() {
        return chinese;
    }

    public int getEnglish() {
        return english;
    }

    public int getCoding() {
        return coding;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getAverage() {
        return average;
    }


    private Student findStudentById(List<Student>studentList, StudentScore studentScore) {
        Student student = null;
        for (int i = 0; i < studentList.size(); ++i) {
            if (studentList.get(i).getId().equals(studentScore.getId())) {
                student = studentList.get(i);
            }
        }
        return student;
    }

    private int getTotalScore(StudentScore studentScore) {
        return (studentScore.getMath() + studentScore.getChinese() + studentScore.getEnglish() + studentScore.getCoding());
    }

}
