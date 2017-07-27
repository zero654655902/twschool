import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 27/07/2017.
 */
public class MenuTest {



    @Test
    public void testAddStudentMassege(){
        Menu pSM=new Menu();
        ArrayList<Student> stuArr=new ArrayList<Student>();
        Student ZhangSan=new Student("ZhangSan",1200,75,95,80,80);
        Student LiSi=new Student("LiSi",1200,85,95,80,80);
        Student WangWu=new Student("WanWu",1200,75,75,80,80);

        Student ZS=new Student("ZS",1200,75,95,90,80);

        stuArr.add(ZhangSan);






    }
}
