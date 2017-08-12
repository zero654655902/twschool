package com.core.Report;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lwan on 10/08/2017.
 */
public class Report {
    private List<ReportBuilder> reportBuilderList = new ArrayList<>();
    private int totalScore = 0;
    private int average = 0;

    public Report() {
    }

    public Report(List<ReportBuilder> reportBuilderList) {
        this.reportBuilderList = reportBuilderList;
        this.totalScore = getStudentTotalScore(reportBuilderList);
        this.average = getCalculateMiddleScore(reportBuilderList);

    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getAverage() {
        return average;
    }


    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setReportBuilderList(List<ReportBuilder> reportBuilderList) {
        this.reportBuilderList = reportBuilderList;
    }

    public void addReportBuilder(ReportBuilder reportBuilder) {
        reportBuilderList.add(reportBuilder);
    }


    public List<ReportBuilder> getReportBuilderList() {
        return reportBuilderList;
    }


    public int getCalculateMiddleScore(List<ReportBuilder> oldreportBuilderList) {
        int middleScore = 0;
        reportBuilderList = oldreportBuilderList.stream()
                .sorted((s1, s2) -> s1.getTotalScore() - s2.getTotalScore())
                .collect(Collectors.toList());
        if (reportBuilderList.size() % 2 == 0) {
            middleScore = (reportBuilderList.get(reportBuilderList.size() / 2 - 1).getTotalScore()
                    + reportBuilderList.get(reportBuilderList.size() / 2).getTotalScore()) / 2;

        } else {
            middleScore = reportBuilderList.get((reportBuilderList.size() - 1) / 2).getTotalScore();
        }
        return middleScore;
    }

    public int getStudentTotalScore(List<ReportBuilder> reportBuilderList) {

        int totalScore = 0;
        for (int i = 0; i < reportBuilderList.size(); ++i) {
            totalScore += reportBuilderList.get(i).getTotalScore();
        }
        return totalScore / reportBuilderList.size();
    }
}
