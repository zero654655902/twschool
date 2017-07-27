import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by lwan on 27/07/2017.
 */
public class Menu {


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

    public void addStudentMassege(ArrayList<Student> _class, String input){
        if(isStudentMassegeFormatCorrect(input)){
            Student ZhangSan=processMassege(input);
            _class.add(ZhangSan);
        }
    }

    public String[] processStudentId(String input) {
        String regex=",";
        String[] ids=input.split(regex);
        return ids;
    }

    public void printMessage(List<Student> stu) {
        String message="成绩单\n"
                +"|姓名|学号|数学|语文|英语|编程|平均分|总分|\n"
                +"=================================\n";
        for(int i=0;i<stu.size();++i){
            stu.get(i).calculateScore();
            message+="张三|"+stu.get(i).getName()+"|"+stu.get(i).getMath()+"|"+
                    stu.get(i).getChinese()+"|"+stu.get(i).getEnglish()+"|"+
                    stu.get(i).getCoding()+"|\n";
        }

        message+="=================================";

    }
}
