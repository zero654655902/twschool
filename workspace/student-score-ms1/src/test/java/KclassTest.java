import com.core.Kclass;
import com.core.Student;
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

        Student ZhangSan = new Student("001","zs","2@2","11","33","xian");
        Student lisi = new Student("001","zs","2@2","11","33","xian");
        Student wangwu = new Student("001","zs","2@2","11","33","xian");
        //when
        List<Student> kclass = new ArrayList<Student>();
        kclass.add(ZhangSan);
        kclass.add(lisi);
        _class.setKclass(kclass);

        _class.addStudentMessage(wangwu);
        //then
        assertEquals(3, _class.getTotalStudent().size());
    }
}
