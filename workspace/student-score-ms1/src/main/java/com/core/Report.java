package com.core;

import com.menu.Constants;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by lwan on 27/07/2017.
 */
public class Report {
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getAverage() {
        return average;
    }

    public int getTotalScore() {
        return totalScore;
    }

    private List<Student> studentList;
    private int average;
    private int totalScore;

    public Report(List<Student> idStudent, int average, int totalScore){
        this.studentList=idStudent;
        this.average=average;
        this.totalScore=totalScore;
    }

//    public String getScoreMassege(List<Student> idStudent, int average, int totalScore) {
//        StringBuilder studentItem = new StringBuilder();
//        studentItem.append(Constants.infoStart);
//
//        for (int i = 0; i < idStudent.size(); i++) {
//
//
//            studentItem.append(String.format(Constants.infoStudentScore
//                    , idStudent.get(i).getName()
//                    , idStudent.get(i).getMath()
//                    , idStudent.get(i).getChinese()
//                    , idStudent.get(i).getEnglish()
//                    , idStudent.get(i).getCoding()
//                    , idStudent.get(i).getAverage()
//                    , idStudent.get(i).getTotalScore()));
//
//        }
//        String infoEnd = "========================\n";
//        studentItem.append(infoEnd).append(String.format(Constants.middleScoreById,average))
//                .append(String.format(Constants.totalScoreById,totalScore));
//
//        return studentItem.toString();
//    }



}
