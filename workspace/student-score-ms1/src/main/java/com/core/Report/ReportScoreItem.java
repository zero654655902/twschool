package com.core.Report;

import com.core.Student;

import java.util.List;

/**
 * Created by lwan on 09/08/2017.
 */
public class ReportScoreItem {
    //    private Student student;
    private String id;
    private String name;
    private int math;
    private int chinese;
    private int english;
    private int coding;


    private int totalScore;
    private int average;

    public ReportScoreItem() {
    }

    public ReportScoreItem(Student student, int totalScore, int average) {
        this.id = student.getId();
        this.name = student.getName();
        this.math = student.getMath();
        this.chinese = student.getChinese();
        this.english = student.getEnglish();
        this.coding = student.getCoding();
        this.average = average;
        this.totalScore = totalScore;
    }


    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
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


    public int calculateOneTotalScore(Student student) {
        return (student.getMath() + student.getChinese() + student.getEnglish() + student.getCoding());
    }

    public int calculateOneAverage(Student student) {
        return (student.getMath() + student.getChinese() + student.getEnglish() + student.getCoding()) / 4;
    }
}
