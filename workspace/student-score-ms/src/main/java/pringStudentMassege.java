import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

/**
 * Created by lwan on 26/07/2017.
 */
public class pringStudentMassege {
    private final static String infoStart = "成绩单\n姓名|数学|语文|英语|编程|平均分|总分\n========================\n";
    private final static String infoStudentScore = "%s|%s|%d|%d|%d|%.2f|%d\n";

    public String printStuMessage(List<Student> stu) {

        StringBuilder studentItem = new StringBuilder();
        studentItem.append(infoStart);

        for (int i = 0; i < stu.size(); i++) {

//            studentItem.append(stu.get(i).getName()).append("|")
//                    .append(stu.get(i).getMath()).append("|")
//                    .append(stu.get(i).getChinese()).append("|")
//                    .append(stu.get(i).getEnglish()).append("|")
//                    .append(stu.get(i).getCoding()).append("|")
//                    .append(stu.get(i).getAverage()).append("|")
//                    .append(stu.get(i).getTotalScore()).append("\n");
            studentItem.append(String.format(infoStudentScore
                    , stu.get(i).getName()
                    , stu.get(i).getMath()
                    , stu.get(i).getChinese()
                    , stu.get(i).getEnglish()
                    , stu.get(i).getCoding()
                    , stu.get(i).getAverage()
                    , stu.get(i).getTotalScore()));

        }
        String infoEnd = "========================\n";
        return studentItem.toString() + infoEnd;
    }


}
