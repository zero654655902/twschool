import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lwan on 27/07/2017.
 */
public class ScoreManageTest {
    @Test
    public void should_get_2_when_has_2_id(){
        //Given
        List<Student> kclass=new ArrayList<Student>();
        Student student1= new Student("张三", 1200, 75, 95, 80, 80);
        Student student2= new Student("李四", 1201, 75, 95, 80, 80);
        Student student3= new Student("王五", 1202, 75, 95, 80, 80);
        kclass.add(student1);
        kclass.add(student2);
        kclass.add(student3);

        int[] id={1201,1202};
        ScoreManage SM=new ScoreManage();
        List<Student> idStudent=new ArrayList<Student>();
        //when
        idStudent=SM.getIdStudent(kclass,id);
        //Then
        assertEquals(2,idStudent.size());

    }

    @Test
    public void should_get_score_middle(){
        //Given
        List<Student> kclass=new ArrayList<Student>();
        Student student1= new Student("张三", 1200, 65, 95, 80, 80);
        Student student2= new Student("李四", 1201, 70, 95, 80, 80);
        Student student3= new Student("王五", 1202, 75, 95, 85, 80);
        student1.calculateScore();
        student2.calculateScore();
        student3.calculateScore();
        kclass.add(student1);
        kclass.add(student2);
        kclass.add(student3);

        ScoreManage SM=new ScoreManage();
        //when
        int middle=SM.calculateMiddleScore(kclass);
        //Then
        assertEquals(325,middle);
    }



}
