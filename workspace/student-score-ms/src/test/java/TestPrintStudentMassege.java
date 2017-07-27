import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by lwan on 26/07/2017.
 */
public class TestPrintStudentMassege {
    @Test
    public void should_print_StudentMessage()throws Exception{
        //Given
        pringStudentMassege psm=new pringStudentMassege();
        List<Student> stu=new ArrayList<Student>();
        Student student1= new Student("张三", 1200, 75, 95, 80, 80);
        Student student2= new Student("李四", 1201, 85, 80, 70, 90);
        student1.calculateScore();
        student2.calculateScore();
        stu.add(student1);
        stu.add(student2);
        //when
        String result=psm.printStuMessage(stu);
        String expect="成绩单\n"
                +"姓名|数学|语文|英语|编程|平均分|总分\n"
                +"========================\n"
                +"张三|75|95|80|80|82.5|330\n"
                +"李四|85|80|70|90|81.25|325\n"
                +"========================\n";
        assertEquals(true,result.equals(expect));
        //assertThat(result,is(expect));

    }


}

