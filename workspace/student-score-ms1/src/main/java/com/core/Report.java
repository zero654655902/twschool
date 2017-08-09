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

    private List<ReportItem> reportItemList;

    private int totalScore;
    private int average;

    public void setReportItemList(List<ReportItem> reportItemList) {
        this.reportItemList = reportItemList;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    public void setAverage(int average) {
        this.average = average;
    }



    public List<ReportItem> getReportItemList() {
        return reportItemList;
    }



    public int getTotalScore() {
        return totalScore;
    }
    public int getAverage() {
        return average;
    }

    public Report() {
    }

    public Report(List<ReportItem> reportItemList, int totalScore,int average) {
        this.reportItemList = reportItemList;
        this.totalScore = totalScore;
        this.average = average;

    }




    public int getStudentTotalScore(List<ReportItem> reportItemList) {

        int totalScore = 0;
        for (int i = 0; i < reportItemList.size(); ++i) {
            totalScore += reportItemList.get(i).getTotalScore();
        }
        return totalScore / reportItemList.size();
    }
    public int getCalculateMiddleScore(List<ReportItem> oldReportItemList) {
        int middleScore = 0;
        reportItemList = oldReportItemList.stream()
                .sorted((s1, s2) -> s1.getTotalScore() - s2.getTotalScore())
                .collect(Collectors.toList());
        if (reportItemList.size() % 2 == 0) {
            middleScore = (reportItemList.get(reportItemList.size() / 2 - 1).getTotalScore() + reportItemList.get(reportItemList.size() / 2).getTotalScore()) / 2;

        } else {
            middleScore = reportItemList.get((reportItemList.size() - 1) / 2).getTotalScore();
        }
        return middleScore;
    }
    public List<ReportItem> buildReportItem(List<Student> studentList) {
        List<ReportItem> reportItemList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); ++i) {
            Student student = studentList.get(i);
            ReportItem reportItem = new ReportItem();
            int average = reportItem.calculateOneAverage(student);
            int totalScore = reportItem.calculateOneTotalScore(student);
            reportItemList.add(new ReportItem(student,totalScore,average));
        }
        return reportItemList;

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
