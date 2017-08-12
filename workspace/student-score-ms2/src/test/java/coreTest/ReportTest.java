package coreTest;

import com.core.Report.Report;
import com.core.Report.ReportBuilder;
import com.core.Student;
import com.core.StudentScore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 12/08/2017.
 */
public class ReportTest {
    @Test
    public void should_get_students_report() {
        List<Student> studentList = new ArrayList<>();
        Student ZhangSan = new Student("001", "zs", "2@2", "11", "33", "xian");
        Student lisi = new Student("002", "ls", "2@2", "11", "33", "xian");
        Student wangwu = new Student("003", "ww", "2@2", "11", "33", "xian");

        studentList.add(ZhangSan);
        studentList.add(lisi);
        studentList.add(wangwu);

        StudentScore studentScore = new StudentScore("001", 67, 78, 89, 90);
        StudentScore studentScore1 = new StudentScore("003", 60, 88, 80, 70);
        StudentScore studentScore2 = new StudentScore("003", 60, 88, 80, 70);
        ReportBuilder reportBuilder = new ReportBuilder(studentList, studentScore);
        ReportBuilder reportBuilder1 = new ReportBuilder(studentList, studentScore1);
        ReportBuilder reportBuilder2 = new ReportBuilder(studentList, studentScore2);
        List<ReportBuilder> reportBuilderList=new ArrayList<>();
        reportBuilderList.add(reportBuilder);
        reportBuilderList.add(reportBuilder1);
        reportBuilderList.add(reportBuilder2);

        Report report=new Report(reportBuilderList);

        assertEquals(218, report.getAverage());
        assertEquals(223, report.getTotalScore());


    }

}
