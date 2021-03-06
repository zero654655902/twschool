import com.core.Student;
import com.menu.strParse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by lwan on 27/07/2017.
 */
public class strParseTest {

    @Test
    public void should_false_when_lack_one_score() {
        //Given
        strParse sp=new strParse();
        String message1="1200,张三,数学:95,语文:75,英语:80";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message1));

    }

    @Test
    public void should_false_when_score_missing() {
        //Given
        strParse sp=new strParse();
        String message3="1200,张三,数学:95,语文:75,英语:80,编程:";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message3));

    }


    @Test
    public void should_true_when_massege_correct() {
        //Given
        strParse sp=new strParse();
        String message="1200,张三,数学:95,语文:75,英语:80,编程:80";
        //李四,1201,语文:75,数学:95,英语:87,编程:80
        //王五,1203,语文:79,数学:95,英语:80,编程:80
        //when-then
        assertEquals(true,sp.isStudentMassegeFormatCorrect(message));


    }
    @Test
    public void should_false_when_name_loss() {
        //Given
        strParse sp=new strParse();
        String message="1200,数学:95,语文:75,英语:80,编程:80";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message));

    }
    @Test
    public void should_false_when_id_loss() {
        //Given
        strParse sp=new strParse();
        String message="张三,数学:95,语文:75,英语:80,编程:80";
        //when-then
        assertEquals(false,sp.isStudentMassegeFormatCorrect(message));

    }
    @Test
    //
    public void should_get_student_when_str_parse(){
        //Given
        strParse sp=new strParse();
        String message="1200,张三,数学:95,语文:75,英语:80,编程:80";
        //when
        Student ZhangSan=sp.processMassege(message);
        Student student1= new Student("1200","张三",  75, 95, 80, 80);
        //then
        assertEquals(true,ZhangSan.getId().equals("1200"));
        assertEquals(true,ZhangSan.getName().equals("张三"));
    }


    @Test
    public void should_get_student_id(){
        //Given
        strParse sp=new strParse();
        String ids="1200,1201,1203";
        String[] id=sp.processId(ids);
        assertEquals(true,id[1].equals("1201"));
    }

}
