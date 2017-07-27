import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 27/07/2017.
 */
public class strParseTest {

    @Test
    public void should_false_when_lack_one_score() {
        strParse sp=new strParse();
        String message1="张三,1200,语文:75,数学:95,英语:80";
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message1));

    }
    @Test
    public void should_false_when_score_not_resonable() {
        strParse sp=new strParse();

        String message2="张三,1200,语文:75,数学:95,英语:80,编程:120";
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message2));
    }


    @Test
    public void should_false_when_score_missing() {
        strParse sp=new strParse();

        String message3="张三,1200,语文:75,数学:95,英语:80,编程:";
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message3));

    }


    @Test
    public void should_true_when_massege_correct() {
        strParse sp=new strParse();

        String message="张三,1200,语文:75,数学:95,英语:80,编程:80";
        assertEquals(true,sp.isStudentMassegeFormatCorrect(message));


    }
    @Test
    public void should_false_when_name_loss() {
        strParse sp=new strParse();

        String message="1200,语文:75,数学:95,英语:80,编程:80";
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message));

    }
    @Test
    public void should_false_when_id_loss() {

        strParse sp=new strParse();
        String message="张三,语文:75,数学:95,英语:80,编程:80";
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message));

    }
    @Test
    //
    public void should_get_student_when_str_parse(){
        strParse sp=new strParse();
        String message="张三,1200,语文:75,数学:95,英语:80,编程:80";
        Student ZhangSan=sp.processMassege(message);
        assertEquals(true,ZhangSan.getName().equals("张三"));
        assertEquals(true,ZhangSan.getId()==1200);
    }

}
