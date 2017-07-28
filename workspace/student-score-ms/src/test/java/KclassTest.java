import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 27/07/2017.
 */
public class KclassTest {
    @Test
    public void should_add_Student() {
        //Given
        Kclass _class = new Kclass();

        Student ZhangSan = new Student("张三", "1201", 65, 95, 80, 80);
        Student Lisi = new Student("李四", "1202", 75, 85, 80, 80);
        //when
        List<Student> kclass = new ArrayList<Student>();
        kclass.add(ZhangSan);

        kclass.add(Lisi);
        _class.setKclass(kclass);
        Student Wanwu = new Student("王五", "1203", 75, 95, 70, 85);
        _class.addStudentMessage(Wanwu);
        //then
        assertEquals(3, _class.getTotalStudent().size());


    }

}
