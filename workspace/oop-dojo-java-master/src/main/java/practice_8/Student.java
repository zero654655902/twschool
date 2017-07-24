package practice_8;

/**
 * Created by lwan on 24/07/2017.
 */
public class Student extends Person {
    private Class kclass;
    public Student(String name, int age, Class kclass) {
        super(name,age);
        this.kclass=kclass;
    }

    @Override
    public String introduce(){
        return super.introduce()+" I am a student, I am at Class "+this.kclass.getNumber()+".";
    }

}
