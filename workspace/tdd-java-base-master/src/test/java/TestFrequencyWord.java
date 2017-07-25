import FrequencyWords.FrequencyWord;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lwan on 25/07/2017.
 */
public class TestFrequencyWord {
//    @Test
//    public void shoule_get_file_txt() throws IOException {
//        FrequencyWord fw=new FrequencyWord();
//        String strTxt="the day is sunny the the the  sunny  is is";
//        String strTxtResult=fw.readFileTxt("address?");
//        assertEquals(strTxt,strTxtResult);
//
//    }


    @Test
    public void testSplitStr(){
        //Given
        FrequencyWord fw=new FrequencyWord();
        String strTxt="the day is sunny the the the  sunny  is is";
        String[] s = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        //when
        String[] strSplitResult=fw.splitStr(strTxt);
        //Then
        assertThat(s,is(strSplitResult));
    }

    @Test
    public void should_get_word_number(){
        //Given
        FrequencyWord fw=new FrequencyWord();
        String[] s = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};

        Map<String, Integer> word_count=new HashMap<String,Integer>();
        word_count.put("the",4);
        word_count.put("day",1);
        word_count.put("is",3);
        word_count.put("sunny",2);
        //when
        Map<String,Integer> word = fw.calculateWordNum(s);
        //Then
        assertEquals(word_count,word);
    }

@Test
public void should_word_count_sort_by_num(){
    //Given
    Map<String, Integer> word_count=new HashMap<String,Integer>();
    word_count.put("the",4);
    word_count.put("day",1);
    word_count.put("is",3);
    word_count.put("sunny",2);

    Map<String, Integer> word=new HashMap<String,Integer>();
    word.put("the",4);
    word.put("is",3);
    word.put("sunny",2);
    word.put("day",1);

    //when
    FrequencyWord fw=new FrequencyWord();
    word_count=fw.sortByValue(word_count);
    //then
    assertEquals(word_count,word);
}


@Test
    public void should_print_word_count(){
    //Given
    FrequencyWord fw=new FrequencyWord();
    Map<String, Integer> word=new HashMap<String,Integer>();
    word.put("the",4);
    word.put("is",3);
    word.put("sunny",2);
    word.put("day",1);
    String result="the 4\n"
            +"is 3\n"
            +"sunny 2\n"
            +"day 1\n";
    //when
    String resultMassege=fw.printFrequencyWordsResult(word);
    //Then
    assertEquals(resultMassege,result);

}

}

