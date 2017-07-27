import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by lwan on 27/07/2017.
 */
public class Menu {








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
