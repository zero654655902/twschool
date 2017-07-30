package practice_13;


import practice_11.*;

/**
 * Created by lwan on 30/07/2017.
 */
public class Student extends Person {

    public Class kclass;

    private final String introduceLeader = " I am a student, I am the Leader of Class %d.";
    private final String introduceMember = " I am a student, I am at Class %d.";
    private final String introducenotofus = "It is not one of us.";


    public Student(String id, String name, int age, Class kclass) {
        super(id, name, age);
        this.kclass = kclass;
    }

    @Override
    public String introduce() {
        if (this.kclass.isLeader(this)) {
            return super.introduce() + String.format(introduceLeader, this.kclass.getNumber());
        } else if (this.kclass.isMember(this)) {
            return introducenotofus;
        } else
            return super.introduce() + String.format(introduceMember, this.kclass.getNumber());
    }

    public Class getKClass() {
        return this.kclass;
    }
}
