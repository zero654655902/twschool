package practice_10;

/**
 * Created by lwan on 24/07/2017.
 */
public class Student extends Person {
    private Class kclass;

    public Student(int id,String name, int age, Class kclass) {
        super(id,name, age);
        this.kclass = kclass;
    }

    @Override
    public String introduce() {
        String str ="";
        if(this.kclass.isMember(this))
        {
            if(this.kclass.isLeader(this))
                str= super.introduce()+" I am a student, I am the leader of Class " + this.kclass.getNumber() + ".";

            else
                str = super.introduce()+" I am a student, I am at Class " + this.kclass.getNumber() + ".";

        }

        else
            str="It is not one of us.";
        return str;
    }
}