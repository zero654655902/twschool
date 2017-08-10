package com.core.Report;

import com.core.Student;
import com.menu.Constants;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by lwan on 27/07/2017.
 */
public class Report {
    private List<ReportScoreItem> reportScoreItemList;
    private List<ReportMessageItem> reportMessageItems;
    private int totalScore;
    private int average;

    public void setReportScoreItemList(List<ReportScoreItem> reportScoreItemList) {
        this.reportScoreItemList = reportScoreItemList;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    public void setAverage(int average) {
        this.average = average;
    }

    public List<ReportMessageItem> getReportMessageItems() {
        return reportMessageItems;
    }

    public void setReportMessageItems(List<ReportMessageItem> reportMessageItems) {
        this.reportMessageItems = reportMessageItems;
    }

    public List<ReportScoreItem> getReportScoreItemList() {
        return reportScoreItemList;
    }



    public int getTotalScore() {
        return totalScore;
    }
    public int getAverage() {
        return average;
    }

    public Report() {
    }

    public Report(List<ReportScoreItem> reportScoreItemList, int totalScore, int average) {
        this.reportScoreItemList = reportScoreItemList;
        this.totalScore = totalScore;
        this.average = average;

    }

    public Report(List<ReportMessageItem> reportMessageItems)
    {
        this.reportMessageItems = reportMessageItems;
    }




    public int getStudentTotalScore(List<ReportScoreItem> reportScoreItemList) {

        int totalScore = 0;
        for (int i = 0; i < reportScoreItemList.size(); ++i) {
            totalScore += reportScoreItemList.get(i).getTotalScore();
        }
        return totalScore / reportScoreItemList.size();
    }

    public int getCalculateMiddleScore(List<ReportScoreItem> oldReportScoreItemList) {
        int middleScore = 0;
        reportScoreItemList = oldReportScoreItemList.stream()
                .sorted((s1, s2) -> s1.getTotalScore() - s2.getTotalScore())
                .collect(Collectors.toList());
        if (reportScoreItemList.size() % 2 == 0) {
            middleScore = (reportScoreItemList.get(reportScoreItemList.size() / 2 - 1).getTotalScore()
                    + reportScoreItemList.get(reportScoreItemList.size() / 2).getTotalScore()) / 2;

        } else {
            middleScore = reportScoreItemList.get((reportScoreItemList.size() - 1) / 2).getTotalScore();
        }
        return middleScore;
    }

    public List<ReportScoreItem> buildReportItem(List<Student> studentList) {
        List<ReportScoreItem> reportScoreItemList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); ++i) {
            Student student = studentList.get(i);
            ReportScoreItem reportScoreItem = new ReportScoreItem();
            int average = reportScoreItem.calculateOneAverage(student);
            int totalScore = reportScoreItem.calculateOneTotalScore(student);
            reportScoreItemList.add(new ReportScoreItem(student,totalScore,average));
        }
        return reportScoreItemList;

    }

    public List<ReportMessageItem> buildReportStudentItem(List<Student>studentList){
        List<ReportMessageItem> reportMessageItem =new ArrayList<>();
        for (int i = 0; i < studentList.size(); ++i) {
            Student student = studentList.get(i);
            reportMessageItem.add(new ReportMessageItem(student));
        }
        return reportMessageItem;
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
//                    , idStudent.get(i).getCoding()));
////                    , idStudent.get(i).getAverage()
////                    , idStudent.get(i).getTotalScore()));
//
//        }
//        String infoEnd = "========================\n";
//        studentItem.append(infoEnd).append(String.format(Constants.middleScoreById,average))
//                .append(String.format(Constants.totalScoreById,totalScore));
//
//        return studentItem.toString();
//    }


}
