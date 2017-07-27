import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

/**
 * Created by lwan on 26/07/2017.
 */
public class pringStudentMassege {

    public void printStudentMassege(String input){
        if(input.equals("1")){


        }

    }





    public String printMessage(List<Student> stu) {
        String message="成绩单\n"
                +"|姓名|学号|数学|语文|英语|编程|平均分|总分|\n"
                +"=================================\n";
        for(int i=0;i<stu.size();++i){
            stu.get(i).calculateScore();
            message+=stu.get(i).getName()+"|"+stu.get(i).getMath()+"|"+
                    stu.get(i).getChinese()+"|"+stu.get(i).getEnglish()+"|"+
                    stu.get(i).getCoding()+"|\n";
        }

        message+="=================================";
        return message;
    }





}
