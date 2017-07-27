import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 27/07/2017.
 */
public class KclassTest {
    @Test
    public void should_add_Student(){
        Kclass _class=new Kclass();

      Student ZhangSan = new Student("张三", 1200, 75, 95, 80, 80);
      Student Lisi = new Student("李四", 1200, 75, 95, 80, 80);

        List<Student> kclass=new ArrayList<Student>() ;
        kclass.add(ZhangSan);
        kclass.add(Lisi);
        _class.setKclass(kclass);
        Student Wanwu = new Student("王五", 1200, 75, 95, 80, 80);
        _class.addStudentMessage(Wanwu);

        assertEquals(3,_class.getTotalStudent().size());


    }

}
