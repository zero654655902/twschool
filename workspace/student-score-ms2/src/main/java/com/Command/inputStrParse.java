package com.Command;


import com.core.StudentScore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lwan on 12/08/2017.
 */
public class inputStrParse {
    public StudentScore processMassege(String input) {

        String regex= Global.regex;
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            return (new StudentScore(matcher.group(1), Integer.parseInt(matcher.group(3)),
                    Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6))));
        }

        return  null;
    }

    public boolean isStudentMassegeFormatCorrect(String studentMessage){

        String regex=Global.regex;
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
