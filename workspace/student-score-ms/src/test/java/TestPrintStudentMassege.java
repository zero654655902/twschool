import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by lwan on 26/07/2017.
 */
public class TestPrintStudentMassege {



    @Test
    public void should_false_when_lack_one_score() {
        pringStudentMassege pSM=new pringStudentMassege();
        String message1="张三,1200,语文:75,数学:95,英语:80";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message1));

    }


    @Test
    public void should_false_when_score_not_resonable() {
        pringStudentMassege pSM=new pringStudentMassege();
        String message2="张三,1200,语文:75,数学:95,英语:80,编程:120";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message2));
    }


    @Test
    public void should_false_when_score_missing() {
        pringStudentMassege pSM=new pringStudentMassege();
        String message3="张三,1200,语文:75,数学:95,英语:80,编程:";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message3));

    }


    @Test
    public void should_true_when_massege_correct() {
        pringStudentMassege pSM=new pringStudentMassege();
        String message="张三,1200,语文:75,数学:95,英语:80,编程:80";
        assertEquals(true,pSM.isStudentMassegeFormatCorrect(message));


    }
    @Test
    public void should_false_when_name_loss() {
        pringStudentMassege pSM=new pringStudentMassege();
        String message="1200,语文:75,数学:95,英语:80,编程:80";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message));

    }
    @Test
    public void should_false_when_id_loss() {
        pringStudentMassege pSM=new pringStudentMassege();
        String message="张三,语文:75,数学:95,英语:80,编程:80";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message));

    }
    @Test
    //
    public void testMessageProcess(){
        String message="张三,1200,语文:75,数学:95,英语:80,编程:80";
        pringStudentMassege pSM=new pringStudentMassege();
        Student ZhangSan=pSM.processMassege(message);
        assertEquals(true,ZhangSan.getName().equals("张三"));
        assertEquals(true,ZhangSan.getId()==1200);
    }

}

