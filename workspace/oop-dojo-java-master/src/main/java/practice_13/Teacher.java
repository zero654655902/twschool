package practice_13;

import java.util.List;

/**
 * Created by lwan on 30/07/2017.
 */
public class Teacher extends Person implements X {
    private List<Class> classes = null;

    public String notifyAddmenber = "I am %s, I know %s has joined Class %d.";
    public String notifyAssignLeader = "I am %s, I know %s has become Leader of Class %d.";

    public Teacher(String id, String name, int age, List<Class> classes) {
        super(id, name, age);
        this.classes = classes;
    }


    @Override
    public String introduce() {
        String start = super.introduce();
        StringBuilder resultStr = new StringBuilder(start);

        if (this.classes.size() == 0)
            resultStr.append(" I am a teacher, I teach No Class.");
        else {
            resultStr.append(" I am a teacher, I teach Class ");
            for (int i = 0; i < this.classes.size() - 1; ++i) {
                resultStr.append(this.classes.get(i).getNumber()).append(", ");
            }
            resultStr.append(this.classes.get(this.classes.size() - 1).getNumber()).append(".");
        }
        return resultStr.toString();
    }

    public boolean isTeacheing(Student student) {
        if (this.classes.contains(student.getKClass()) && student.getKClass().isIn(student))
            return true;
        else
            return false;
    }

    @Override
    public String notifyAssignLeader(Student student, Class kclass) {
        if (isTeacheing(student)&&student.getKClass().isLeader(student))
            return String.format(notifyAssignLeader, this.name, student.name, kclass.getNumber());
        else
            return null;

    }

    @Override
    public String notifyAppendMember(Student student, Class kclass) {
        if (isTeacheing(student)&&student.getKClass().isMember(student))
            return String.format(notifyAddmenber, this.name, student.name, kclass.getNumber());
        else
            return null;

    }
}
