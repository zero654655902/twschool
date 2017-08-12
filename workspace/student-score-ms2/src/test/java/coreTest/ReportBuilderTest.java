package coreTest;

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
public class ReportBuilderTest {
    @Test
    public void should_get_one_student_score(){
        List<Student>studentList=new ArrayList<>();
        Student ZhangSan = new Student("001","zs","2@2","11","33","xian");
        Student lisi = new Student("002","ls","2@2","11","33","xian");
        Student wangwu = new Student("003","ww","2@2","11","33","xian");

        studentList.add(ZhangSan);
        studentList.add(lisi);
        studentList.add(wangwu);

        StudentScore studentScore=new StudentScore("001",67,78,89,90);

        ReportBuilder reportBuilder=new ReportBuilder(studentList,studentScore);
        assertEquals("001",reportBuilder.getId());
        assertEquals("zs",reportBuilder.getName());
        assertEquals(235,reportBuilder.getTotalScore());

    }

}
