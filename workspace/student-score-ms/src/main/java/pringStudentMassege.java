import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

/**
 * Created by lwan on 26/07/2017.
 */
public class pringStudentMassege {

    public String printStuMessage(List<Student> stu){
        String infoStart="成绩单\n"
                + "姓名|数学|语文|英语|编程|平均分|总分 \n"
                + "========================\n";
        StringBuilder studentItem = new StringBuilder();

        for (int i = 0; i < stu.size(); i++) {

            studentItem.append(stu.get(i).getName()).append("|")
                    .append(stu.get(i).getMath()).append("|")
                    .append(stu.get(i).getChinese()).append("|")
                    .append(stu.get(i).getEnglish()).append("|")
                    .append(stu.get(i).getCoding()).append("|")
                    .append(stu.get(i).getAverage()).append("|")
                    .append(stu.get(i).getTotalScore()).append("\n");

        }
        String infoEnd="========================\n";
        return infoStart+studentItem.toString()+infoEnd;
    }


}
