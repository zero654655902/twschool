import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 27/07/2017.
 */
public class MenuTest {
    @Test
    public void should_false_when_lack_one_score() {
        Menu pSM=new Menu();
        String message1="张三,1200,语文:75,数学:95,英语:80";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message1));

    }


    @Test
    public void should_false_when_score_not_resonable() {
        Menu pSM=new Menu();

        String message2="张三,1200,语文:75,数学:95,英语:80,编程:120";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message2));
    }


    @Test
    public void should_false_when_score_missing() {
        Menu pSM=new Menu();
        String message3="张三,1200,语文:75,数学:95,英语:80,编程:";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message3));

    }


    @Test
    public void should_true_when_massege_correct() {
        Menu pSM=new Menu();
        String message="张三,1200,语文:75,数学:95,英语:80,编程:80";
        assertEquals(true,pSM.isStudentMassegeFormatCorrect(message));


    }
    @Test
    public void should_false_when_name_loss() {
        Menu pSM=new Menu();
        String message="1200,语文:75,数学:95,英语:80,编程:80";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message));

    }
    @Test
    public void should_false_when_id_loss() {
        Menu pSM=new Menu();
        String message="张三,语文:75,数学:95,英语:80,编程:80";
        assertEquals(false,pSM.isStudentMassegeFormatCorrect(message));

    }
    @Test
    //
    public void testMessageProcess(){
        Menu pSM=new Menu();

        String message="张三,1200,语文:75,数学:95,英语:80,编程:80";
        Student ZhangSan=pSM.processMassege(message);
        assertEquals(true,ZhangSan.getName().equals("张三"));
        assertEquals(true,ZhangSan.getId()==1200);
    }

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
