package practice_9;

/**
 * Created by lwan on 24/07/2017.
 */
public class Student extends Person {
    private Class kclass;

    public Student(String name, int age, Class kclass) {
        super(name, age);
        this.kclass = kclass;
    }

    @Override
    public String introduce() {
        String str = super.introduce();
        if (this.kclass.isLeader(this)) {
            str += " I am a student, I am the leader of Class " + this.kclass.getNumber() + ".";
        } else
            str += " I am a student, I am at Class " + this.kclass.getNumber() + ".";

        return str;
    }
}