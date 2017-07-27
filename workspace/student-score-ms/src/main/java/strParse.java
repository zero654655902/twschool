import static java.lang.Integer.parseInt;

/**
 * Created by lwan on 27/07/2017.
 */
public class strParse {
    public Student processMassege(String input) {
        String regex=",";
        String regex2=":";
        String[] messages=input.split(regex);
        for(int i=2;i<messages.length;++i){
            String[] tmpMessage=messages[i].split(regex2);
            messages[i]=tmpMessage[1];
        }
        Student ZhangSan=new Student(messages[0], parseInt(messages[1]),parseInt(messages[2]),
                parseInt(messages[3]),parseInt(messages[4]),parseInt(messages[5]));
        return  ZhangSan;

    }

    public boolean isStudentMassegeFormatCorrect(String studentMessage){
        //String regex1="";
        if(studentMessage.contains("数学:")&&studentMessage.contains("语文:")
                && studentMessage.contains("英语:")&&studentMessage.contains("编程:"))
        {
            String regex=",";
            String regex2=":";
            String[] messages=studentMessage.split(regex);
            if(messages.length<6)
                return false;
            else
            {for(int i=2;i<messages.length;++i){
                String[] tmpMessage=messages[i].split(regex2);
                if(tmpMessage.length<2)
                    return false;
                messages[i]=tmpMessage[1];
                if(parseInt(messages[i])<0||parseInt(messages[i])>100){
                    return  false;
                }
            }

            }
            return true;
        }
        return  false;

//        String regex="(^,),(\\w+),语文:(\\d+),数学:(\\d+),英语:(\\d+),编程:(\\d+)";
//        return studentMessage.matches(regex);


//        return false;





    }

}
