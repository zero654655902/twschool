//import com.core.Kclass;
//import com.core.Report;
//import com.core.Student;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static junit.framework.TestCase.assertEquals;
//
///**
// * Created by lwan on 27/07/2017.
// */
//public class ReportTest {
//    @Test
//    public void should_print_massege(){
//        Kclass _class = new Kclass();
//        Student student1 = new Student("张三", "1200", 75, 95, 80, 80);
//        Student student2 = new Student("李四", "1201", 70, 95, 80, 80);
//        Student student3 = new Student("王五", "1202", 75, 95, 80, 80);
//        _class.addStudentMessage(student1);
//        _class.addStudentMessage(student2);
//        _class.addStudentMessage(student3);
//
//        String[] id = {"1200", "1201"};
//
//        List<Student> idStudent = new ArrayList<Student>();
//        //when
//        idStudent = _class.getStudentById(id);
//
//        int average = _class.getCalculateMiddleScore(idStudent);
//        int totalScore = _class.getStudentTotalScore(idStudent);
//        //Then
//        Report SM=new Report();
//        String str=SM.getScoreMassege(idStudent,average,totalScore);
//        String expect = "成绩单\n"
//                + "姓名|数学|语文|英语|编程|平均分|总分\n"
//                + "========================\n"
//                + "张三|75|95|80|80|82.50|330\n"
//                + "李四|70|95|80|80|81.25|325\n"
//                + "========================\n"
//                +"全班总分中位数:327\n"
//                +"全班总平均分:327\n";
//  assertEquals(expect, str);
//
//    }
//
//}
//
//
//
