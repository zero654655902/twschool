import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

/**
 * Created by lwan on 27/07/2017.
 */
public class strParse {
    public Student processMassege(String input) {

        String regex="([^,]+),(\\w+),语文:(\\d+),数学:(\\d+),英语:(\\d+),编程:(\\d+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            return (new Student(matcher.group(1), (matcher.group(2)), Integer.parseInt(matcher.group(3)),
                    Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6))));
        }

        return  null;




    }

    public boolean isStudentMassegeFormatCorrect(String studentMessage){

       String regex="([^,]+),(\\w+),语文:(\\d+),数学:(\\d+),英语:(\\d+),编程:(\\d+)";
      return studentMessage.matches(regex);

    }

    public boolean isStudentIdFormateCorrect(String ids){
        String regex="(\\d+,)+(\\d+)";
        return ids.matches(regex);

    }

    public String[] processId(String ids){
        String[] id=ids.split(",");

       return id;


    }

}
