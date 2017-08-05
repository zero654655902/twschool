
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 26/07/2017.
 */
public class TestStudent {
@Test
    public void testStudent(){
    //Give
        Student ZhangSan=new Student("张三","1200",75,95,80,80);
     //when
//        ZhangSan.calculateScore();
        //then
        assertEquals(true, ZhangSan.getAverage() ==  82.5);
      assertEquals(true,ZhangSan.getTotalScore()==330);
    }
}
