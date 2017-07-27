import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by lwan on 26/07/2017.
 */
public class TestPrintStudentMassege {
    @Test
    public void should_print_StudentMessage(){
        //Given
        pringStudentMassege psm=new pringStudentMassege();
        List<Student> stu=new ArrayList<Student>();
        Student student1= new Student("张三", 1200, 75, 95, 80, 80);
        Student student2= new Student("张三", 1200, 75, 95, 80, 80);
        Student student3= new Student("张三", 1200, 75, 95, 80, 80);
        stu.add(student1);
        stu.add(student2);
        stu.add(student3);

        //when
        String result=psm.printMessage(stu);
        String expect="成绩单\n"
                +"姓名|学号|数学|语文|英语|编程|平均分|总分\n"
                +"张三|1200|75|95|80|80|\n"
                +"李四|1200|75|95|80|80|\n"
                +"=======================\n";
        assertEquals(expect,result);

    }






}

