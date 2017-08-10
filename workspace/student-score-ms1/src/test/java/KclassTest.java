//import com.core.Kclass;
//import com.core.Student;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * Created by lwan on 27/07/2017.
// */
//public class KclassTest {
//    @Test
//    public void should_add_Student() {
//        //Given
//        Kclass _class = new Kclass();
//
//        StudentJpaEntity ZhangSan = new StudentJpaEntity("张三", "1201", 65, 95, 80, 80);
//        StudentJpaEntity Lisi = new StudentJpaEntity("李四", "1202", 75, 85, 80, 80);
//        //when
//        List<StudentJpaEntity> kclass = new ArrayList<StudentJpaEntity>();
//        kclass.add(ZhangSan);
//
//        kclass.add(Lisi);
//        _class.setKclass(kclass);
//        StudentJpaEntity Wanwu = new StudentJpaEntity("王五", "1203", 75, 95, 70, 85);
//
//        _class.addStudentMessage(Wanwu);
//        //then
//        assertEquals(3, _class.getTotalStudent().size());
//
//
//    }
//
//
//    @Test
//    public void should_get_2_when_2_id() {
//        Kclass _class = new Kclass();
//        StudentJpaEntity student1 = new StudentJpaEntity("张三", "1200", 75, 95, 80, 80);
//        StudentJpaEntity student2 = new StudentJpaEntity("李四", "1201", 75, 95, 80, 80);
//        StudentJpaEntity student3 = new StudentJpaEntity("王五", "1202", 75, 95, 80, 80);
//        _class.addStudentMessage(student1);
//        _class.addStudentMessage(student2);
//        _class.addStudentMessage(student3);
//
//        String[] id = {"1201", "1202"};
//
//        List<StudentJpaEntity> idStudent = new ArrayList<StudentJpaEntity>();
//        //when
//        idStudent = _class.getStudentById(id);
//
//        int average = _class.getCalculateMiddleScore(idStudent);
//        int totalScore = _class.getStudentTotalScore(idStudent);
//        //Then
//
//        assertEquals(330, average);
//        assertEquals(330, totalScore);
//    }
//
//}
