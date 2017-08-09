package com.core;

import java.util.List;

/**
 * Created by lwan on 09/08/2017.
 */
public class ReportItem {
    private Student student;
    private int average;
    private int totalScore;
    public ReportItem(){}
    public ReportItem(Student student,int average,int totalScore){
        this.student=student;
        this.average=average;
        this.totalScore=totalScore;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    public Student getStudent() {
        return student;
    }

    public int getAverage() {
        return average;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int calculateOneAverage(Student student){
        return (student.getMath()+student.getChinese()+student.getEnglish()+student.getCoding())/4;
    }
    public int calculateOneTotalScore(Student student){
        return (student.getMath()+student.getChinese()+student.getEnglish()+student.getCoding());
    }

}
