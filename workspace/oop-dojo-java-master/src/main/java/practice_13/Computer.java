package practice_13;

/**
 * Created by lwan on 30/07/2017.
 */
public class Computer implements X {
    public String name;
    public String notifyAddmenber = "I am the %s, I know %s has joined Class %d.";
    public String notifyAssignLeader = "I am the %s, I know %s has become Leader of Class %d.";

    public Computer(String name){
        this.name=name;
    }
    @Override
    public String notifyAssignLeader(Student student, Class kclass) {
        if (student.getKClass().isLeader(student))
            return String.format(notifyAssignLeader, this.name, student.name, kclass.getNumber());
        else
            return null;

    }

    @Override
    public String notifyAppendMember(Student student, Class kclass) {
        if (student.getKClass().isMember(student))
            return String.format(notifyAddmenber, this.name, student.name, kclass.getNumber());
        else
            return null;
    }
}
