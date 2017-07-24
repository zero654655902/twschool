package practice_5;

/**
 * Created by lwan on 24/07/2017.
 */
public class Student extends Person{
    private int klass;

    public Student(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }



    @Override
    public String introduce(){
        String str=super.basicIntroduce();
         str+=" I am a student, I am at Class "+this.klass;

        return str;
    }



}
