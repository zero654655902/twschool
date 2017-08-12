package CommandTest;

import com.Command.inputStrParse;
import com.core.StudentScore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 12/08/2017.
 */
public class inputStrParseTest {
    @Test
    public void should_false_when_lack_one_score() {
        //Given
        inputStrParse sp=new inputStrParse();
        String message1="1200,张三,数学:95,语文:75,英语:80";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message1));

    }

    @Test
    public void should_false_when_score_missing() {
        //Given
        inputStrParse sp=new inputStrParse();
        String message3="1200,张三,数学:95,语文:75,英语:80,编程:";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message3));

    }


    @Test
    public void should_true_when_massege_correct() {
        //Given
        inputStrParse sp=new inputStrParse();
        String message="1200,张三,数学:95,语文:75,英语:80,编程:80";
        //李四,1201,语文:75,数学:95,英语:87,编程:80
        //王五,1203,语文:79,数学:95,英语:80,编程:80
        //when-then
        assertEquals(true,sp.isStudentMassegeFormatCorrect(message));


    }
    @Test
    public void should_false_when_name_loss() {
        //Given
        inputStrParse sp=new inputStrParse();
        String message="1200,数学:95,语文:75,英语:80,编程:80";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message));

    }
    @Test
    public void should_false_when_id_loss() {
        //Given
        inputStrParse sp=new inputStrParse();
        String message="张三,数学:95,语文:75,英语:80,编程:80";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message));

    }
    @Test
    //
    public void should_get_student_when_str_parse(){
        //Given
        inputStrParse sp=new inputStrParse();
        String message="1200,张三,数学:95,语文:75,英语:80,编程:80";
        //when
        StudentScore ZhangSan=sp.processMassege(message);
        StudentScore student1= new StudentScore("1200",  75, 95, 80, 80);
        //then
        assertEquals(true,ZhangSan.getId().equals("1200"));
    }


    @Test
    public void should_get_student_id(){
        //Given
        inputStrParse sp=new inputStrParse();
        String ids="1200,1201,1203";
        String[] id=sp.processId(ids);
        assertEquals(true,id[1].equals("1201"));
    }

}
