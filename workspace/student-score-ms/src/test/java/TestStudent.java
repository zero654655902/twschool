
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 26/07/2017.
 */
public class TestStudent {
@Test
    public void testStudent(){
        Student ZhangSan=new Student("张三",1200,75,95,80,80);
        Student ZhangSan1=new Student("张三",1200,75,95,80,80,82.5,330);
        ZhangSan.calculateScore();
        double average=ZhangSan.getAverage();
    assertEquals(true, ZhangSan.getAverage() ==  ZhangSan1.getAverage());
    assertEquals(true, ZhangSan.getTotalScore() ==  ZhangSan1.getTotalScore());
    }



}
