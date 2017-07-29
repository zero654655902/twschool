import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lwan on 27/07/2017.
 */
public class ScoreManage {

    public List<Student> getIdStudent(List<Student> kclass, String[] id) {
        List<Student> idStudent = new ArrayList<Student>();
        for (int i = 0; i < kclass.size(); ++i) {
            for (int j = 0; j < id.length; ++j) {
                if (kclass.get(i).getId().equals(id[j])) {
                    kclass.get(i).calculateScore();
                    idStudent.add(kclass.get(i));
                    break;
                }

            }
        }
        return idStudent;
    }

    public int calculateTotal(List<Student> kclass) {
        int totalScore = 0;
        for (int i = 0; i < kclass.size(); ++i) {
            totalScore += kclass.get(i).getTotalScore();
        }
        return totalScore/kclass.size();
    }

    public int calculateMiddleScore(List<Student> kclass) {
        int middleScore = 0;
        List<Student> students = kclass.stream()
                .sorted((s1, s2) -> s1.getTotalScore() - s2.getTotalScore())
                .collect(Collectors.toList());
        if (students.size() % 2 == 0) {
            middleScore = (students.get(students.size()/ 2-1).getTotalScore()+students.get(students.size()/ 2).getTotalScore())/2;

        } else {
            middleScore = students.get((students.size()-1 )/ 2).getTotalScore();
        }
        return middleScore;
    }

}
