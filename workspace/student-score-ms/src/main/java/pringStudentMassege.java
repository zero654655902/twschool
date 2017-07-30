import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

/**
 * Created by lwan on 26/07/2017.
 */
public class pringStudentMassege {


    public String printStuMessage(List<Student> stu) {

        StringBuilder studentItem = new StringBuilder();
        studentItem.append(Constants.infoStart);

        for (int i = 0; i < stu.size(); i++) {

//            studentItem.append(stu.get(i).getName()).append("|")
//                    .append(stu.get(i).getMath()).append("|")
//                    .append(stu.get(i).getChinese()).append("|")
//                    .append(stu.get(i).getEnglish()).append("|")
//                    .append(stu.get(i).getCoding()).append("|")
//                    .append(stu.get(i).getAverage()).append("|")
//                    .append(stu.get(i).getTotalScore()).append("\n");
            studentItem.append(String.format(Constants.infoStudentScore
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
